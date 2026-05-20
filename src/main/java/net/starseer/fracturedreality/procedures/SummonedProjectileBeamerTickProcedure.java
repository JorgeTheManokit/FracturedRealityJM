package net.starseer.fracturedreality.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import java.util.Comparator;

public class SummonedProjectileBeamerTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Vec3 shooterVector = Vec3.ZERO;
		if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(32 / 2d), e -> true).isEmpty()) {
			entity.lookAt(EntityAnchorArgument.Anchor.EYES,
					new Vec3(((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getX()), ((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getY() + 1), ((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getZ())));
			shooterVector = new Vec3(((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getX() - x), (((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getY() + 1) - y),
					((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getZ() - z));
			shooterVector = shooterVector.normalize();
			entity.getPersistentData().putDouble("aimingX", (shooterVector.x()));
			entity.getPersistentData().putDouble("aimingY", (shooterVector.y()));
			entity.getPersistentData().putDouble("aimingZ", (shooterVector.z()));
		} else {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}