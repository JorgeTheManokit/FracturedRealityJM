package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class SpawnEnablerBeamSummonerProcedure {
	public static boolean execute(LevelAccessor world) {
		if (FracturedRealityModVariables.MapVariables.get(world).SpawnSummoners) {
			if (!((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END)) {
				return true;
			} else {
				if (Mth.nextInt(RandomSource.create(), 1, 10) > 8) {
					return true;
				}
			}
		}
		return false;
	}
}