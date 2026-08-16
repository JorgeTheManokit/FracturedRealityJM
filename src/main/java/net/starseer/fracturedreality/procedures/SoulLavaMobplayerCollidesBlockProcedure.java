package net.starseer.fracturedreality.procedures;

import net.minecraft.world.entity.Entity;

public class SoulLavaMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(60);
	}
}