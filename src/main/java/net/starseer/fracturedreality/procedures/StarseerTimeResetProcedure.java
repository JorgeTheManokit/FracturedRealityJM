package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

@EventBusSubscriber
public class StarseerTimeResetProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (FracturedRealityModVariables.MapVariables.get(world).StarseerDefeated) {
			FracturedRealityModVariables.MapVariables.get(world).StarseerDefeated = false;
			FracturedRealityModVariables.MapVariables.get(world).SpawnPresenters = false;
			FracturedRealityModVariables.MapVariables.get(world).SpawnSummoners = false;
			FracturedRealityModVariables.MapVariables.get(world).SpawnFaceless = false;
			FracturedRealityModVariables.MapVariables.get(world).DoGravityFlux = false;
			FracturedRealityModVariables.MapVariables.get(world).IntenseGravityFlux = false;
			FracturedRealityModVariables.MapVariables.get(world).DoVisualHallucinations = false;
			FracturedRealityModVariables.MapVariables.get(world).DoAudioHallucinations = false;
			FracturedRealityModVariables.MapVariables.get(world).SpawnMoonbreakers = false;
			FracturedRealityModVariables.MapVariables.get(world).GenerateFractStructure = true;
			FracturedRealityModVariables.MapVariables.get(world).DayCountOffset = FracturedRealityModVariables.MapVariables.get(world).DayCountOffset + FracturedRealityModVariables.MapVariables.get(world).DaysSurvived
					+ Mth.nextInt(RandomSource.create(), 5, 10);
			FracturedRealityModVariables.MapVariables.get(world).Phase = 2;
			FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}