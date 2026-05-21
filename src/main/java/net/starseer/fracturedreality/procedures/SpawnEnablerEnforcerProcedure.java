package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.minecraft.world.level.LevelAccessor;

public class SpawnEnablerEnforcerProcedure {
	public static boolean execute(LevelAccessor world) {
		return FracturedRealityModVariables.MapVariables.get(world).SpawnEnforcers;
	}
}