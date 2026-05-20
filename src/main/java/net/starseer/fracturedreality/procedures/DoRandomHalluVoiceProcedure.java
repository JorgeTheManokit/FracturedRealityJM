package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class DoRandomHalluVoiceProcedure {
	public static void execute(Entity Entity) {
		if (Entity == null)
			return;
		double randX = 0;
		double randZ = 0;
		{
			FracturedRealityModVariables.PlayerVariables _vars = Entity.getData(FracturedRealityModVariables.PLAYER_VARIABLES);
			_vars.ShowHallucination = Mth.nextInt(RandomSource.create(), 1, 3);
			_vars.HallucinationHideDelay = 5;
			_vars.markSyncDirty();
		}
	}
}