package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModBlocks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class GrapplingHookEveryTickWhileUsingItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Vec3 vectorA = Vec3.ZERO;
		if ((world.getBlockState(
				new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(64)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
						entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(64)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
						entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(64)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
				.getBlock() == FracturedRealityModBlocks.GRAPPLING_POINT.get()) {
			vectorA = (entity.getLookAngle()).normalize();
			vectorA = vectorA.scale(
					((Vec3.atLowerCornerOf(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(64)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()))
							.length() / 128));
			entity.setDeltaMovement(new Vec3((vectorA.x()), (vectorA.y() + 0.125), (vectorA.z())));
		}
	}
}