package net.starseer.fracturedreality.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

public class VoidMissileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		Entity Player = null;
		Vec3 VectorA = Vec3.ZERO;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_PORTAL) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.END_PORTAL) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
		immediatesourceentity.setNoGravity(true);
		Player = findEntityInWorldRange(world, Player.class, x, y, z, 64);
		if (!(Player == null)) {
			VectorA = ((new Vec3((Player.getX() - x), ((Player.getY() + 1) - y), (Player.getZ() - z))).normalize()).scale(1.0 / 2);
			immediatesourceentity.setDeltaMovement(new Vec3((VectorA.x()), (VectorA.y()), (VectorA.z())));
		}
		if (Player == null) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}