package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.minecraft.world.entity.Entity;

public class ShowHallu04Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getData(FracturedRealityModVariables.PLAYER_VARIABLES).ShowHallucination == 4;
	}
}