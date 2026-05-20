package net.starseer.fracturedreality.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;

public class HookFabricatorPlayAnimProcedure {
	public static boolean execute(BlockState blockstate) {
		return blockstate.getBlock().getStateDefinition().getProperty("fabricating") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1);
	}
}