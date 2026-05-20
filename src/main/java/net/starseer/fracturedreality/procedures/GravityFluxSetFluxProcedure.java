package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GravityFluxSetFluxProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double randX = 0;
		double randZ = 0;
		if (FracturedRealityModVariables.MapVariables.get(world).DoGravityFlux) {
			if (Mth.nextInt(RandomSource.create(), 1, 25000) >= 24999) {
				if (FracturedRealityModVariables.MapVariables.get(world).IntenseGravityFlux) {
					FracturedRealityModVariables.MapVariables.get(world).GravityFlux = Mth.nextDouble(RandomSource.create(), 2.5, 5);
					FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
				} else {
					FracturedRealityModVariables.MapVariables.get(world).GravityFlux = Mth.nextDouble(RandomSource.create(), 1.5, 3);
					FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
				}
				FracturedRealityMod.queueServerWork(Mth.nextInt(RandomSource.create(), 30, 45) * 20, () -> {
					FracturedRealityModVariables.MapVariables.get(world).GravityFlux = 0;
					FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
				});
			}
		}
	}
}