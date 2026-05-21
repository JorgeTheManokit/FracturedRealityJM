package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.entity.EnforcerEntity;

import net.minecraft.world.entity.Entity;

public class EnforcerCallPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof EnforcerEntity _datEntI ? _datEntI.getEntityData().get(EnforcerEntity.DATA_LightningTimer) : 0) <= 80
				&& (entity instanceof EnforcerEntity _datEntI ? _datEntI.getEntityData().get(EnforcerEntity.DATA_LightningCooldown) : 0) <= 0;
	}
}