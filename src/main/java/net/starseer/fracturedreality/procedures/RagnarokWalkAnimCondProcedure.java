package net.starseer.fracturedreality.procedures;

import net.minecraft.world.entity.Entity;

public class RagnarokWalkAnimCondProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getDeltaMovement().x() != 0 || entity.getDeltaMovement().z() != 0;
	}
}