package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.entity.StarseerEntity;

import net.minecraft.world.entity.Entity;

public class StarseerNotMonologueProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !(entity instanceof StarseerEntity _datEntL0 && _datEntL0.getEntityData().get(StarseerEntity.DATA_DoingMonologue));
	}
}