package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;
import net.starseer.fracturedreality.init.FracturedRealityModMobEffects;
import net.starseer.fracturedreality.client.RenderUtils;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class SkyChangerProcedure {
	@SubscribeEvent
	public static void onSkyRendered(RenderLevelStageEvent event) {
		Minecraft mc = Minecraft.getInstance();
		if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY)
			execute(event, mc.player.level(), mc.player, event);
	}

	public static void execute(LevelAccessor world, Entity entity, RenderLevelStageEvent skyRenderEvent) {
		execute(null, world, entity, skyRenderEvent);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, RenderLevelStageEvent skyRenderEvent) {
		if (entity == null || skyRenderEvent == null)
			return;
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			if (!(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(FracturedRealityModMobEffects.FALSE_SIGHT))) {
				if (FracturedRealityModVariables.MapVariables.get(world).Phase == 1) {
					if (FracturedRealityModVariables.MapVariables.get(world).SkyPhase > 0 && FracturedRealityModVariables.MapVariables.get(world).SkyPhase < 5) {
						RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_cracked_background_cut.png"), 0xffffff, Math.min(1, 1));
					}
					if (FracturedRealityModVariables.MapVariables.get(world).SkyPhase > 4) {
						RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_cracked_background.png"), 0xffffff, Math.min(1, 1));
					}
					if (FracturedRealityModVariables.MapVariables.get(world).ShowAllseer) {
						RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_cracked_starseer.png"), 0xffffff, Math.min(1, 1));
					}
					if (NightTimeCheckerProcedure.execute(world) && FracturedRealityModVariables.MapVariables.get(world).ShowWatchers) {
						RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_cracked_watchers.png"), 0xffffff, Math.min(1, 1));
					}
					if (FracturedRealityModVariables.MapVariables.get(world).SkyPhase > 0) {
						RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_cracked_foreground.png"), 0xffffff,
								Math.min((float) (FracturedRealityModVariables.MapVariables.get(world).SkyPhase * 0.2), 1));
					}
				} else {
					if (FracturedRealityModVariables.MapVariables.get(world).SkyPhase > 0 && FracturedRealityModVariables.MapVariables.get(world).SkyPhase < 5) {
						RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_cracked_background_cut_phase_2.png"), 0xffffff, Math.min(1, 1));
					}
					if (FracturedRealityModVariables.MapVariables.get(world).SkyPhase > 4) {
						RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_cracked_background_phase_2.png"), 0xffffff, Math.min(1, 1));
					}
					if (FracturedRealityModVariables.MapVariables.get(world).SkyPhase > 0) {
						RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_cracked_foreground_phase_2.png"), 0xffffff,
								Math.min((float) (FracturedRealityModVariables.MapVariables.get(world).SkyPhase * 0.2), 1));
					}
				}
			} else if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(FracturedRealityModMobEffects.FALSE_SIGHT)) {
				RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_false_lines.png"), 0xffffff, Math.min((float) 0.25, 1));
				RenderUtils.renderCustomSun(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_false_sun.png"));
				RenderUtils.renderCustomMoon(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/sky_false_moon_phases.png"));
			}
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("fractured_reality:reality_edge"))) {
			if (FracturedRealityModVariables.MapVariables.get(world).SkyPhase > 1 && FracturedRealityModVariables.MapVariables.get(world).Phase == 2) {
				RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/edge_sky_phase2.png"), 0xffffff, Math.min(1, 1));
			} else if (FracturedRealityModVariables.MapVariables.get(world).SkyPhase > 1 && FracturedRealityModVariables.MapVariables.get(world).Phase == 1) {
				RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/edge_sky.png"), 0xffffff, Math.min(1, 1));
			} else {
				RenderUtils.renderCustomSkybox(skyRenderEvent, ResourceLocation.parse("fractured_reality:textures/edge_sky_standard.png"), 0xffffff, Math.min(1, 1));
			}
		}
	}
}