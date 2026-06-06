package net.starseer.fracturedreality.fluid;

import net.starseer.fracturedreality.init.FracturedRealityModFluids;
import net.starseer.fracturedreality.init.FracturedRealityModFluidTypes;
import net.starseer.fracturedreality.init.FracturedRealityModBlocks;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class SoulLavaFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> FracturedRealityModFluidTypes.SOUL_LAVA_TYPE.get(), () -> FracturedRealityModFluids.SOUL_LAVA.get(),
			() -> FracturedRealityModFluids.FLOWING_SOUL_LAVA.get()).explosionResistance(100f).levelDecreasePerBlock(2).block(() -> (LiquidBlock) FracturedRealityModBlocks.SOUL_LAVA.get());

	private SoulLavaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SoulLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SoulLavaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}