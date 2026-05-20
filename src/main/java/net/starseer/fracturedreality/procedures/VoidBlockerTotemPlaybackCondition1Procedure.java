package net.starseer.fracturedreality.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;

public class VoidBlockerTotemPlaybackCondition1Procedure {
	public static boolean execute(BlockState blockstate) {
		return (blockstate.getBlock().getStateDefinition().getProperty("power_level") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) > 0;
	}
}