package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DoorBlockerOpenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FracturedRealityModBlocks.DOOR_BLOCKER_INVISIBLE.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FracturedRealityModBlocks.DOOR_BLOCKER_MOLTEN.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FracturedRealityModBlocks.DOOR_BLOCKER_RAGNAROK.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			DoorBlockerOpenProcedure.execute(world, x + 1, y, z);
			DoorBlockerOpenProcedure.execute(world, x - 1, y, z);
			DoorBlockerOpenProcedure.execute(world, x, y + 1, z);
			DoorBlockerOpenProcedure.execute(world, x, y - 1, z);
			DoorBlockerOpenProcedure.execute(world, x, y, z + 1);
			DoorBlockerOpenProcedure.execute(world, x, y, z - 1);
		}
	}
}