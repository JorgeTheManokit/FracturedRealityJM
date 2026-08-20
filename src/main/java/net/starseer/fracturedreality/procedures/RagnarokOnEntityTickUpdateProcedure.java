package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModEntities;
import net.starseer.fracturedreality.entity.RagnarokEntity;
import net.starseer.fracturedreality.entity.FollowerMinionEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

public class RagnarokOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Rand01 = 0;
		double EntLimit = 0;
		if (!(entity instanceof RagnarokEntity _datEntL0 && _datEntL0.getEntityData().get(RagnarokEntity.DATA_DoingMonologue))) {
			if (Math.random() < (1) / ((float) 400)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.molten.speak")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.molten.speak")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(48 / 2d), e -> true).isEmpty()) {
				if ((entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_SwitchAttackCooldown) : 0) == 0) {
					Rand01 = Mth.nextInt(RandomSource.create(), 1, 30);
					if (Rand01 <= 5) {
						if (entity instanceof RagnarokEntity _datEntSetS)
							_datEntSetS.getEntityData().set(RagnarokEntity.DATA_CurrentAttack, "Slash");
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 30, 50));
					} else if (Rand01 <= 9) {
						if (entity instanceof RagnarokEntity _datEntSetS)
							_datEntSetS.getEntityData().set(RagnarokEntity.DATA_CurrentAttack, "Charge");
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_AttackTimer, 5);
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 25, 35));
					} else if (Rand01 <= 10) {
						if (entity instanceof RagnarokEntity _datEntSetS)
							_datEntSetS.getEntityData().set(RagnarokEntity.DATA_CurrentAttack, "Cannon");
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_AttackTimer, 1);
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 25, 35));
					} else if (Rand01 <= 10) {
						if (entity instanceof RagnarokEntity _datEntSetS)
							_datEntSetS.getEntityData().set(RagnarokEntity.DATA_CurrentAttack, "Spew");
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_AttackTimer, 1);
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 25, 35));
					} else if (Rand01 <= 10) {
						if (entity instanceof RagnarokEntity _datEntSetS)
							_datEntSetS.getEntityData().set(RagnarokEntity.DATA_CurrentAttack, "Heal");
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_AttackTimer, 1);
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 25, 35));
					} else {
						if (entity instanceof RagnarokEntity _datEntSetS)
							_datEntSetS.getEntityData().set(RagnarokEntity.DATA_CurrentAttack, "None");
						if (entity instanceof RagnarokEntity _datEntSetI)
							_datEntSetI.getEntityData().set(RagnarokEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 25, 35));
					}
				}
			}
			if ((entity instanceof RagnarokEntity _datEntS ? _datEntS.getEntityData().get(RagnarokEntity.DATA_CurrentAttack) : "").equals("Missile")
					&& (entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_AttackTimer) : 0) > 0) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FracturedRealityModEntities.SUMMONED_PROJECTILE_BEAMER.get().spawn(_level,
							BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -15, 15), y + Mth.nextDouble(RandomSource.create(), 5, 10), z + Mth.nextDouble(RandomSource.create(), -15, 15)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if ((entity instanceof RagnarokEntity _datEntS ? _datEntS.getEntityData().get(RagnarokEntity.DATA_CurrentAttack) : "").equals("Ground Pound")
					&& (entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_AttackTimer) : 0) == 1) {
				entity.push(0, 2, 0);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
			} else if ((entity instanceof RagnarokEntity _datEntS ? _datEntS.getEntityData().get(RagnarokEntity.DATA_CurrentAttack) : "").equals("Smash")
					&& (entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_AttackTimer) : 0) == 21) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.NONE);
			} else if ((entity instanceof RagnarokEntity _datEntS ? _datEntS.getEntityData().get(RagnarokEntity.DATA_CurrentAttack) : "").equals("Arms")
					&& (entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_AttackTimer) : 0) == 1) {
				EntLimit = 0;
				{
					final Vec3 _center = new Vec3(x, y, z);
					for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
						if (entityiterator instanceof FollowerMinionEntity) {
							EntLimit = EntLimit + 1;
						}
					}
				}
				if (EntLimit < 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FracturedRealityModEntities.FOLLOWER_MINION.get().spawn(_level, BlockPos.containing(x, y + 5, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
			if ((entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_BossThemeLoopCooldown) : 0) <= 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.all_together.middle")), SoundSource.HOSTILE, 100, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.all_together.middle")), SoundSource.HOSTILE, 100, 1, false);
					}
				}
			}
			if (entity instanceof RagnarokEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RagnarokEntity.DATA_SwitchAttackCooldown, (int) Math.max((entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_SwitchAttackCooldown) : 0) - 1, 0));
			if (entity instanceof RagnarokEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RagnarokEntity.DATA_AttackTimer, (int) Math.max((entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_AttackTimer) : 0) - 1, 0));
			if (entity instanceof RagnarokEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RagnarokEntity.DATA_BossThemeLoopCooldown,
						(int) ((entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_BossThemeLoopCooldown) : 0) <= 0
								? 836
								: (entity instanceof RagnarokEntity _datEntI ? _datEntI.getEntityData().get(RagnarokEntity.DATA_BossThemeLoopCooldown) : 0) - 1));
			if (entity instanceof RagnarokEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RagnarokEntity.DATA_GroundTickAgo, (int) entity.fallDistance);
		}
	}
}