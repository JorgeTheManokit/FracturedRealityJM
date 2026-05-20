package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModEntities;
import net.starseer.fracturedreality.entity.StarseerEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
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

public class StarseerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Rand01 = 0;
		double randX = 0;
		double randZ = 0;
		if (!(entity instanceof StarseerEntity _datEntL0 && _datEntL0.getEntityData().get(StarseerEntity.DATA_DoingMonologue))) {
			if (Math.random() < (1) / ((float) 400)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.starseer.taunt")), SoundSource.VOICE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.starseer.taunt")), SoundSource.VOICE, 1, 1, false);
					}
				}
			}
			if (!world.getEntitiesOfClass(Player.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(48 / 2d), e -> true).isEmpty()) {
				if ((entity instanceof StarseerEntity _datEntI ? _datEntI.getEntityData().get(StarseerEntity.DATA_SwitchAttackCooldown) : 0) == 0) {
					Rand01 = Mth.nextInt(RandomSource.create(), 1, 5);
					if (Rand01 == 1) {
						if (entity instanceof StarseerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StarseerEntity.DATA_CurrentAttack, "Melee");
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 30, 50));
					} else if (Rand01 == 2) {
						if (entity instanceof StarseerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StarseerEntity.DATA_CurrentAttack, "Missile");
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_AttackTimer, 5);
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 25, 35));
					} else if (Rand01 == 3) {
						if (entity instanceof StarseerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StarseerEntity.DATA_CurrentAttack, "Ground Pound");
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_AttackTimer, 1);
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 60, 75));
					} else if (Rand01 == 4) {
						if (entity instanceof StarseerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StarseerEntity.DATA_CurrentAttack, "Smash");
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_AttackTimer, 41);
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 50, 70));
					} else if (Rand01 == 5) {
						if (entity instanceof StarseerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StarseerEntity.DATA_CurrentAttack, "Arms");
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_AttackTimer, 1);
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 25, 35));
					} else if (Rand01 == 6) {
						if (entity instanceof StarseerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StarseerEntity.DATA_CurrentAttack, "Lasers");
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_AttackTimer, 1);
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 25, 35));
					} else {
						if (entity instanceof StarseerEntity _datEntSetS)
							_datEntSetS.getEntityData().set(StarseerEntity.DATA_CurrentAttack, "None");
						if (entity instanceof StarseerEntity _datEntSetI)
							_datEntSetI.getEntityData().set(StarseerEntity.DATA_SwitchAttackCooldown, Mth.nextInt(RandomSource.create(), 25, 35));
					}
				}
			}
			if ((entity instanceof StarseerEntity _datEntS ? _datEntS.getEntityData().get(StarseerEntity.DATA_CurrentAttack) : "").equals("Missile")
					&& (entity instanceof StarseerEntity _datEntI ? _datEntI.getEntityData().get(StarseerEntity.DATA_AttackTimer) : 0) > 0) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = FracturedRealityModEntities.SUMMONED_PROJECTILE_BEAMER.get().spawn(_level,
							BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), -15, 15), y + Mth.nextDouble(RandomSource.create(), 7, 15), z + Mth.nextDouble(RandomSource.create(), -15, 15)), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			} else if ((entity instanceof StarseerEntity _datEntS ? _datEntS.getEntityData().get(StarseerEntity.DATA_CurrentAttack) : "").equals("Ground Pound")
					&& (entity instanceof StarseerEntity _datEntI ? _datEntI.getEntityData().get(StarseerEntity.DATA_AttackTimer) : 0) == 1) {
				entity.push(0, 2, 0);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
			} else if ((entity instanceof StarseerEntity _datEntS ? _datEntS.getEntityData().get(StarseerEntity.DATA_CurrentAttack) : "").equals("Smash")
					&& (entity instanceof StarseerEntity _datEntI ? _datEntI.getEntityData().get(StarseerEntity.DATA_AttackTimer) : 0) == 21) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.NONE);
			} else if ((entity instanceof StarseerEntity _datEntS ? _datEntS.getEntityData().get(StarseerEntity.DATA_CurrentAttack) : "").equals("Arms")
					&& (entity instanceof StarseerEntity _datEntI ? _datEntI.getEntityData().get(StarseerEntity.DATA_AttackTimer) : 0) == 1) {
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 16, 32); index0++) {
					randX = x + Mth.nextInt(RandomSource.create(), -32, 32);
					randZ = z + Mth.nextInt(RandomSource.create(), -32, 32);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = FracturedRealityModEntities.STAR_ARM.get().spawn(_level, BlockPos.containing(randX, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) randX, (int) randZ), randZ),
								MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
			if (entity instanceof StarseerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(StarseerEntity.DATA_SwitchAttackCooldown, (int) Math.max((entity instanceof StarseerEntity _datEntI ? _datEntI.getEntityData().get(StarseerEntity.DATA_SwitchAttackCooldown) : 0) - 1, 0));
			if (entity instanceof StarseerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(StarseerEntity.DATA_AttackTimer, (int) Math.max((entity instanceof StarseerEntity _datEntI ? _datEntI.getEntityData().get(StarseerEntity.DATA_AttackTimer) : 0) - 1, 0));
			if (entity.fallDistance == 0 && (entity instanceof StarseerEntity _datEntI ? _datEntI.getEntityData().get(StarseerEntity.DATA_GroundTickAgo) : 0) > 3) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.NONE);
			}
			if (entity instanceof StarseerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(StarseerEntity.DATA_GroundTickAgo, (int) entity.fallDistance);
		}
	}
}