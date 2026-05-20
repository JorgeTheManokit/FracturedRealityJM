package net.starseer.fracturedreality.block;

import net.starseer.fracturedreality.block.entity.ForgottenBlockEntity;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.util.Mth;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class ForgottenBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;
	private static final VoxelShape SHAPE_NORTH_FLOOR = box(0, 0, 0, 16, 0.1, 16);
	private static final VoxelShape SHAPE_NORTH_WALL = box(0, 0, 15.9, 16, 16, 16);
	private static final VoxelShape SHAPE_NORTH_CEILING = box(0, 15.9, 0, 16, 16, 16);
	private static final VoxelShape SHAPE_SOUTH_FLOOR = box(0, 0, 0, 16, 0.1, 16);
	private static final VoxelShape SHAPE_SOUTH_WALL = box(0, 0, 0, 16, 16, 0.1);
	private static final VoxelShape SHAPE_SOUTH_CEILING = box(0, 15.9, 0, 16, 16, 16);
	private static final VoxelShape SHAPE_EAST_FLOOR = box(0, 0, 0, 16, 0.1, 16);
	private static final VoxelShape SHAPE_EAST_WALL = box(0, 0, 0, 0.1, 16, 16);
	private static final VoxelShape SHAPE_EAST_CEILING = box(0, 15.9, 0, 16, 16, 16);
	private static final VoxelShape SHAPE_WEST_FLOOR = box(0, 0, 0, 16, 0.1, 16);
	private static final VoxelShape SHAPE_WEST_WALL = box(15.9, 0, 0, 16, 16, 16);
	private static final VoxelShape SHAPE_WEST_CEILING = box(0, 15.9, 0, 16, 16, 16);

	public ForgottenBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SLIME_BLOCK).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
	}

	@Override
	protected RenderShape getRenderShape(BlockState state) {
		return RenderShape.INVISIBLE;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return (switch (state.getValue(FACING)) {
			case NORTH -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_NORTH_FLOOR;
				case WALL -> SHAPE_NORTH_WALL;
				case CEILING -> SHAPE_NORTH_CEILING;
			};
			case SOUTH -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_SOUTH_FLOOR;
				case WALL -> SHAPE_SOUTH_WALL;
				case CEILING -> SHAPE_SOUTH_CEILING;
			};
			case EAST -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_EAST_FLOOR;
				case WALL -> SHAPE_EAST_WALL;
				case CEILING -> SHAPE_EAST_CEILING;
			};
			case WEST -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_WEST_FLOOR;
				case WALL -> SHAPE_WEST_WALL;
				case CEILING -> SHAPE_WEST_CEILING;
			};
			default -> switch (state.getValue(FACE)) {
				case FLOOR -> SHAPE_NORTH_FLOOR;
				case WALL -> SHAPE_NORTH_WALL;
				case CEILING -> SHAPE_NORTH_CEILING;
			};
		});
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, FACE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACE, faceForDirection(context.getNearestLookingDirection())).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	private AttachFace faceForDirection(Direction direction) {
		if (direction.getAxis() == Direction.Axis.Y)
			return direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR;
		else
			return AttachFace.WALL;
	}

	@Override
	public int getExpDrop(BlockState state, LevelAccessor level, BlockPos pos, BlockEntity blockEntity, Entity breaker, ItemStack tool) {
		return Mth.randomBetweenInclusive(level.getRandom(), 30, 900);
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new ForgottenBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity != null && blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof ForgottenBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof ForgottenBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}