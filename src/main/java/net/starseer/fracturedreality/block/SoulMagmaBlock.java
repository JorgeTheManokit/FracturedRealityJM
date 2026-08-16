package net.starseer.fracturedreality.block;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.core.BlockPos;

public class SoulMagmaBlock extends Block {
	public SoulMagmaBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERRACK).strength(1f, 10f).lightLevel(blockstate -> 5));
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.DANGER_FIRE;
	}
}