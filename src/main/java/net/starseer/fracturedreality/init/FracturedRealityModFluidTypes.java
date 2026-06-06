/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.fluid.types.SoulLavaFluidType;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

public class FracturedRealityModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, FracturedRealityMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> SOUL_LAVA_TYPE = REGISTRY.register("soul_lava", () -> new SoulLavaFluidType());
}