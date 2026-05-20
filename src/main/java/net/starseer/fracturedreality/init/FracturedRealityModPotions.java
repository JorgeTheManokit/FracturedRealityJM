/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

public class FracturedRealityModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, FracturedRealityMod.MODID);
	public static final DeferredHolder<Potion, Potion> REALITY_DISTORTION = REGISTRY.register("reality_distortion", () -> new Potion(new MobEffectInstance(FracturedRealityModMobEffects.FALSE_SIGHT, 72000, 0, false, true)));
}