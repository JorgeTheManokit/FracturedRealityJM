package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModEntities;
import net.starseer.fracturedreality.entity.VoidMissileEntity;
import net.starseer.fracturedreality.entity.FacelessEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import java.util.Comparator;

public class FacelessTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Vec3 shooterVector = Vec3.ZERO;
		FacelessSoundsProcedure.execute(world, x, y, z);
		if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(32 / 2d), e -> true).isEmpty()) {
			shooterVector = new Vec3(((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getX() - x), (((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getY() + 1) - y),
					((findEntityInWorldRange(world, Player.class, x, y, z, 32)).getZ() - z));
			shooterVector = shooterVector.normalize();
			if ((entity instanceof FacelessEntity _datEntI ? _datEntI.getEntityData().get(FacelessEntity.DATA_Cooldown) : 0) == 0) {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = initArrowProjectile(new VoidMissileEntity(FracturedRealityModEntities.VOID_MISSILE.get(), projectileLevel), entity, 0, true, false, false, AbstractArrow.Pickup.DISALLOWED);
					_entityToSpawn.setPos((x + shooterVector.x()), (y + shooterVector.y()), (z + shooterVector.z()));
					_entityToSpawn.shoot((shooterVector.x()), (shooterVector.y()), (shooterVector.z()), 0, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (entity instanceof FacelessEntity _datEntSetI)
					_datEntSetI.getEntityData().set(FacelessEntity.DATA_Cooldown, Mth.nextInt(RandomSource.create(), 50, 65));
			}
			if (entity instanceof FacelessEntity _datEntSetI)
				_datEntSetI.getEntityData().set(FacelessEntity.DATA_Cooldown, (int) Math.max((entity instanceof FacelessEntity _datEntI ? _datEntI.getEntityData().get(FacelessEntity.DATA_Cooldown) : 0) - 1, 0));
		}
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.igniteForSeconds(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}
}