package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.entity.StarseerEntity;

import net.minecraft.world.entity.Entity;

public class StarseerSmashCondProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof StarseerEntity _datEntS ? _datEntS.getEntityData().get(StarseerEntity.DATA_CurrentAttack) : "").equals("Smash")
				&& (entity instanceof StarseerEntity _datEntI ? _datEntI.getEntityData().get(StarseerEntity.DATA_AttackTimer) : 0) > 0;
	}
}