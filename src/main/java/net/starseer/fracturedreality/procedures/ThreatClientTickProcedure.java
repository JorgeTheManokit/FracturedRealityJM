package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ThreatClientTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double threatLevel = 0;
		threatLevel = GetThreatLevelProcedure.execute(world, x, y, z);
		if (entity.getData(FracturedRealityModVariables.PLAYER_VARIABLES).threatRepeatCooldown == 0) {
			if (world.isClientSide()) {
				if (FracturedRealityModVariables.MapVariables.get(world).Phase == 1) {
					if (threatLevel == 5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.severe")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.severe")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					} else if (threatLevel == 4) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.major")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.major")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					} else if (threatLevel == 3) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.moderate")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.moderate")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					} else if (threatLevel == 2) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.minor")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.minor")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					} else if (threatLevel == 1) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.negligible")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase1.negligible")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					}
				} else if (FracturedRealityModVariables.MapVariables.get(world).Phase == 2) {
					if (threatLevel == 5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.severe")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.severe")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					} else if (threatLevel == 4) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.major")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.major")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					} else if (threatLevel == 3) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.moderate")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.moderate")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					} else if (threatLevel == 2) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.minor")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.minor")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					} else if (threatLevel == 1) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.negligible")), SoundSource.HOSTILE, 100, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.threat.phase2.negligible")), SoundSource.HOSTILE, 100, 1, false);
							}
						}
					}
				}
			}
		}
		{
			FracturedRealityModVariables.PlayerVariables _vars = entity.getData(FracturedRealityModVariables.PLAYER_VARIABLES);
			_vars.threatRepeatCooldown = entity.getData(FracturedRealityModVariables.PLAYER_VARIABLES).threatRepeatCooldown == 0 ? 240 : entity.getData(FracturedRealityModVariables.PLAYER_VARIABLES).threatRepeatCooldown - 1;
			_vars.markSyncDirty();
		}
	}
}