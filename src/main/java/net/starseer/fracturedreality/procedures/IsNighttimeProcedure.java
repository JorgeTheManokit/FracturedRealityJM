package net.starseer.fracturedreality.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class IsNighttimeProcedure {
	public static boolean execute(LevelAccessor world) {
		return !(world instanceof Level _lvl0 && _lvl0.isDay());
	}
}