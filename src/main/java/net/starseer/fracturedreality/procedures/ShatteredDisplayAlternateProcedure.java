package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.entity.ShatteredEntity;

import net.minecraft.world.entity.Entity;

public class ShatteredDisplayAlternateProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof ShatteredEntity _datEntI ? _datEntI.getEntityData().get(ShatteredEntity.DATA_Variant) : 0) == 2;
	}
}