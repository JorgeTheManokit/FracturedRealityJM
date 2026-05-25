/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.client.particle.WhiteSparkParticle;
import net.starseer.fracturedreality.client.particle.VoidDripParticle;
import net.starseer.fracturedreality.client.particle.GreenSparkParticle;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class FracturedRealityModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(FracturedRealityModParticleTypes.VOID_DRIP.get(), VoidDripParticle::provider);
		event.registerSpriteSet(FracturedRealityModParticleTypes.GREEN_SPARK.get(), GreenSparkParticle::provider);
		event.registerSpriteSet(FracturedRealityModParticleTypes.WHITE_SPARK.get(), WhiteSparkParticle::provider);
	}
}