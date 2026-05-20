package net.starseer.fracturedreality.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;

public class LaunchPadPlaybackConditionProcedure {
	public static boolean execute(BlockState blockstate) {
		return blockstate.getBlock().getStateDefinition().getProperty("animating") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1);
	}
}