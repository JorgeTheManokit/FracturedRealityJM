package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;
import net.starseer.fracturedreality.configuration.FracturedRealityServerConfigConfiguration;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

@EventBusSubscriber
public class EventEnablerPhase2Procedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (FracturedRealityModVariables.MapVariables.get(world).Phase == 2) {
			if (FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 4 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) {
				FracturedRealityModVariables.MapVariables.get(world).SkyPhase = 5;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			} else if (FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 3 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) {
				FracturedRealityModVariables.MapVariables.get(world).SkyPhase = 4;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			} else if (FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 2 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) {
				FracturedRealityModVariables.MapVariables.get(world).SkyPhase = 3;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			} else if (FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 1 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) {
				FracturedRealityModVariables.MapVariables.get(world).SkyPhase = 2;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			} else if (FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 0 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) {
				FracturedRealityModVariables.MapVariables.get(world).SkyPhase = 1;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			} else {
				FracturedRealityModVariables.MapVariables.get(world).SkyPhase = 0;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			}
			if (FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 10 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) {
				FracturedRealityModVariables.MapVariables.get(world).FogFluxMinDistance = 5;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			} else if (FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 5 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) {
				FracturedRealityModVariables.MapVariables.get(world).FogFluxMinDistance = 25;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			} else {
				FracturedRealityModVariables.MapVariables.get(world).FogFluxMinDistance = 200;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			}
			if (FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 26 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()
					&& FracturedRealityModVariables.MapVariables.get(world).DaysSurvived < 40 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) {
				FracturedRealityModVariables.MapVariables.get(world).NonFRMobSpawnChance = (100d / 14)
						* ((40 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) - FracturedRealityModVariables.MapVariables.get(world).DaysSurvived);
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			} else if (FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 40 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get() + (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get()) {
				FracturedRealityModVariables.MapVariables.get(world).NonFRMobSpawnChance = 0;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			} else {
				FracturedRealityModVariables.MapVariables.get(world).NonFRMobSpawnChance = 100;
				FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			}
			FracturedRealityModVariables.MapVariables.get(world).SpawnStarCores = FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 6 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get()
					+ (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get();
			FracturedRealityModVariables.MapVariables.get(world).SpawnFollowers = FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 8 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get()
					+ (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get();
			FracturedRealityModVariables.MapVariables.get(world).SpawnEnforcers = FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 8 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get()
					+ (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get();
			FracturedRealityModVariables.MapVariables.get(world).SpawnShattered = FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 10 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get()
					+ (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get();
			FracturedRealityModVariables.MapVariables.get(world).SpawnTruthseekers = FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 10 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get()
					+ (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get();
			FracturedRealityModVariables.MapVariables.get(world).DoRandomLightning = FracturedRealityModVariables.MapVariables.get(world).DaysSurvived >= 6 * (double) FracturedRealityServerConfigConfiguration.TIME_SCALE.get()
					+ (double) FracturedRealityServerConfigConfiguration.PREP_TIME.get();
			FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}