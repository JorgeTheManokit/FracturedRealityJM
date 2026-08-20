package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModEntities;
import net.starseer.fracturedreality.entity.EnforcerEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

public class EnforcerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < (1) / ((float) 1000)) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.enforcer.speak")), SoundSource.NEUTRAL, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.enforcer.speak")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
				}
			}
		}
		if (entity instanceof EnforcerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(EnforcerEntity.DATA_LightningCooldown, (int) ((entity instanceof EnforcerEntity _datEntI ? _datEntI.getEntityData().get(EnforcerEntity.DATA_LightningCooldown) : 0) - 1));
		if ((entity instanceof EnforcerEntity _datEntI ? _datEntI.getEntityData().get(EnforcerEntity.DATA_LightningCooldown) : 0) <= 0) {
			if (entity instanceof EnforcerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(EnforcerEntity.DATA_LightningTimer, (int) ((entity instanceof EnforcerEntity _datEntI ? _datEntI.getEntityData().get(EnforcerEntity.DATA_LightningTimer) : 0) + 1));
			if ((entity instanceof EnforcerEntity _datEntI ? _datEntI.getEntityData().get(EnforcerEntity.DATA_LightningTimer) : 0) % 40 == 0) {
				if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(64 / 2d), e -> true).isEmpty()) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
							if (entityiterator instanceof Player) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = FracturedRealityModEntities.LIGHTNING_STRIKER.get().spawn(_level,
											BlockPos.containing(entityiterator.getX(), world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) entityiterator.getX(), (int) entityiterator.getZ()), entityiterator.getZ()),
											MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof EnforcerEntity _datEntI ? _datEntI.getEntityData().get(EnforcerEntity.DATA_LightningTimer) : 0) >= 80) {
			if (entity instanceof EnforcerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(EnforcerEntity.DATA_LightningCooldown, 150);
			if (entity instanceof EnforcerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(EnforcerEntity.DATA_LightningTimer, 0);
		}
	}
}