package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class GravityFluxSetFluxDevProcedure {
	public static void execute(LevelAccessor world) {
		double randX = 0;
		double randZ = 0;
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