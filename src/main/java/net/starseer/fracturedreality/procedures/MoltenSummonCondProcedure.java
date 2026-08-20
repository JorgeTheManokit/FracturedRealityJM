package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.entity.MoltenEntity;

import net.minecraft.world.entity.Entity;

public class MoltenSummonCondProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof MoltenEntity _datEntS ? _datEntS.getEntityData().get(MoltenEntity.DATA_CurrentAttack) : "").equals("Arms");
	}
}