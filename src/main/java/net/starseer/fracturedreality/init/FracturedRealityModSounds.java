/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class FracturedRealityModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, FracturedRealityMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> GRAVFLUX_START = REGISTRY.register("gravflux_start", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "gravflux_start")));
	public static final DeferredHolder<SoundEvent, SoundEvent> GRAVFLUX_END = REGISTRY.register("gravflux_end", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "gravflux_end")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HALLUCINATION_VOICES = REGISTRY.register("hallucination_voices",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "hallucination_voices")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_STARSEER_START_MONOLOGUE_1P = REGISTRY.register("fr.starseer.start_monologue_1p",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.starseer.start_monologue_1p")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_STARSEER_START_MONOLOGUE_MP = REGISTRY.register("fr.starseer.start_monologue_mp",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.starseer.start_monologue_mp")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_STARSEER_TAUNT = REGISTRY.register("fr.starseer.taunt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.starseer.taunt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_STARSEER_KILLS_PLAYER = REGISTRY.register("fr.starseer.kills_player",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.starseer.kills_player")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_PRESENTER_HURT = REGISTRY.register("fr.presenter.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.presenter.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_PRESENTER_SPEAK = REGISTRY.register("fr.presenter.speak", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.presenter.speak")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_MOONBREAKER_GRUNT = REGISTRY.register("fr.moonbreaker.grunt",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.moonbreaker.grunt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_FACELESS_WHISPER = REGISTRY.register("fr.faceless.whisper",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.faceless.whisper")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_SUMMONER_NOISE = REGISTRY.register("fr.summoner.noise", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.summoner.noise")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_SUMMONER_SUMMON = REGISTRY.register("fr.summoner.summon", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.summoner.summon")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_LORE_DISCS_VOID_FLUID = REGISTRY.register("fr.lore_discs.void_fluid",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.lore_discs.void_fluid")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_LORE_DISCS_SUBJECT_289 = REGISTRY.register("fr.lore_discs.subject_289",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.lore_discs.subject_289")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_LORE_DISCS_SUBJECT_475 = REGISTRY.register("fr.lore_discs.subject_475",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.lore_discs.subject_475")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_LORE_DISCS_SUBJECT_748 = REGISTRY.register("fr.lore_discs.subject_748",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.lore_discs.subject_748")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_LORE_DISCS_SUBJECT_1052 = REGISTRY.register("fr.lore_discs.subject_1052",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.lore_discs.subject_1052")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_LORE_DISCS_SUBJECT_1644 = REGISTRY.register("fr.lore_discs.subject_1644",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.lore_discs.subject_1644")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_LORE_DISCS_SUBJECT_2193 = REGISTRY.register("fr.lore_discs.subject_2193",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.lore_discs.subject_2193")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FR_LORE_DISCS_SUBJECT_2374 = REGISTRY.register("fr.lore_discs.subject_2374",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fractured_reality", "fr.lore_discs.subject_2374")));
}