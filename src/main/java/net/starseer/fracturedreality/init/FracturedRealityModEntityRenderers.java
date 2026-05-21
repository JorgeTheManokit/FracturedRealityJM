/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.client.renderer.*;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class FracturedRealityModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FracturedRealityModEntities.PRESENTER.get(), PresenterRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.BEAM_SUMMONER.get(), BeamSummonerRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.SUMMONED_PROJECTILE_BEAMER.get(), SummonedProjectileBeamerRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.LIGHT_BEAM.get(), LightBeamRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.FACELESS.get(), FacelessRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.MOON_BREAKER.get(), MoonBreakerRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.VOID_MISSILE.get(), VoidMissileRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.STARSEER.get(), StarseerRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.STAR_ARM.get(), StarArmRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.LIGHTNING_STRIKER.get(), LightningStrikerRenderer::new);
		event.registerEntityRenderer(FracturedRealityModEntities.ENFORCER.get(), EnforcerRenderer::new);
	}
}