package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.minecraft.world.level.LevelAccessor;

public class FollowerSpawnEnablerProcedure {
	public static boolean execute(LevelAccessor world) {
		return FracturedRealityModVariables.MapVariables.get(world).SpawnFollowers;
	}
}