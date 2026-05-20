package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModEntities;
import net.starseer.fracturedreality.entity.VoidMissileEntity;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class SummonedProjectileBeamerAimAndShootProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Vec3 shooterVector = Vec3.ZERO;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.summoner.summon")), SoundSource.HOSTILE, 1,
						(float) Mth.nextDouble(RandomSource.create(), 0.75, 1.25));
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.summoner.summon")), SoundSource.HOSTILE, 1, (float) Mth.nextDouble(RandomSource.create(), 0.75, 1.25), false);
			}
		}
		if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(32 / 2d), e -> true).isEmpty()) {
			FracturedRealityMod.queueServerWork(40, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = initArrowProjectile(new VoidMissileEntity(FracturedRealityModEntities.VOID_MISSILE.get(), projectileLevel), entity, 0, true, false, false, AbstractArrow.Pickup.DISALLOWED);
					_entityToSpawn.setPos(x, y, z);
					_entityToSpawn.shoot((entity.getPersistentData().getDouble("aimingX")), (entity.getPersistentData().getDouble("aimingY")), (entity.getPersistentData().getDouble("aimingZ")), 0, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				FracturedRealityMod.queueServerWork(10, () -> {
					if (!entity.level().isClientSide())
						entity.discard();
				});
			});
		}
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