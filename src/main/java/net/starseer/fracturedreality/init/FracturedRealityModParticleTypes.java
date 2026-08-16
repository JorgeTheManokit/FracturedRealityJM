/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class FracturedRealityModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, FracturedRealityMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> VOID_DRIP = REGISTRY.register("void_drip", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GREEN_SPARK = REGISTRY.register("green_spark", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> WHITE_SPARK = REGISTRY.register("white_spark", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ABYSS_PORTAL = REGISTRY.register("abyss_portal", () -> new SimpleParticleType(true));
}