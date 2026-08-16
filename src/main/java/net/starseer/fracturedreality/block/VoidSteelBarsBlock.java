package net.starseer.fracturedreality.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class VoidSteelBarsBlock extends IronBarsBlock {
	public VoidSteelBarsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 6f).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false)
				.instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}
}