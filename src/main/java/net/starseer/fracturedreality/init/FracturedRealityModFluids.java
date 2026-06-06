/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.fluid.SoulLavaFluid;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class FracturedRealityModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, FracturedRealityMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> SOUL_LAVA = REGISTRY.register("soul_lava", () -> new SoulLavaFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_SOUL_LAVA = REGISTRY.register("flowing_soul_lava", () -> new SoulLavaFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SOUL_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SOUL_LAVA.get(), RenderType.translucent());
		}
	}
}