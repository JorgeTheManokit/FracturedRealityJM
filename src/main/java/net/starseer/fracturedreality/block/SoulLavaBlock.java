package net.starseer.fracturedreality.block;

import net.starseer.fracturedreality.init.FracturedRealityModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class SoulLavaBlock extends LiquidBlock {
	public SoulLavaBlock() {
		super(FracturedRealityModFluids.SOUL_LAVA.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).noCollission().noLootTable().liquid()
				.pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}