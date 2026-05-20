/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.potion.FalseSightMobEffect;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

public class FracturedRealityModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, FracturedRealityMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> FALSE_SIGHT = REGISTRY.register("false_sight", () -> new FalseSightMobEffect());
}