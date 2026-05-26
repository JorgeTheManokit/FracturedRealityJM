/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.client.model.*;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class FracturedRealityModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelPresenter.LAYER_LOCATION, ModelPresenter::createBodyLayer);
		event.registerLayerDefinition(ModelGrapplingPoint.LAYER_LOCATION, ModelGrapplingPoint::createBodyLayer);
		event.registerLayerDefinition(ModelLaunchPad.LAYER_LOCATION, ModelLaunchPad::createBodyLayer);
		event.registerLayerDefinition(ModelStarseer.LAYER_LOCATION, ModelStarseer::createBodyLayer);
		event.registerLayerDefinition(ModelForgotten.LAYER_LOCATION, ModelForgotten::createBodyLayer);
		event.registerLayerDefinition(ModelShattered.LAYER_LOCATION, ModelShattered::createBodyLayer);
		event.registerLayerDefinition(ModelStarArm.LAYER_LOCATION, ModelStarArm::createBodyLayer);
		event.registerLayerDefinition(ModelStarCore.LAYER_LOCATION, ModelStarCore::createBodyLayer);
		event.registerLayerDefinition(ModelLIghtningStriker.LAYER_LOCATION, ModelLIghtningStriker::createBodyLayer);
		event.registerLayerDefinition(ModelvoidBlockerTotem.LAYER_LOCATION, ModelvoidBlockerTotem::createBodyLayer);
		event.registerLayerDefinition(ModelhookFabricator.LAYER_LOCATION, ModelhookFabricator::createBodyLayer);
		event.registerLayerDefinition(ModelStarseerSpawner.LAYER_LOCATION, ModelStarseerSpawner::createBodyLayer);
		event.registerLayerDefinition(ModelVoidMissile.LAYER_LOCATION, ModelVoidMissile::createBodyLayer);
		event.registerLayerDefinition(ModelEnforcer.LAYER_LOCATION, ModelEnforcer::createBodyLayer);
		event.registerLayerDefinition(ModelBeamSummoner.LAYER_LOCATION, ModelBeamSummoner::createBodyLayer);
		event.registerLayerDefinition(Modelmoonbreaker.LAYER_LOCATION, Modelmoonbreaker::createBodyLayer);
		event.registerLayerDefinition(Modeltruthseeker.LAYER_LOCATION, Modeltruthseeker::createBodyLayer);
		event.registerLayerDefinition(Modelsmaller_armor_model.LAYER_LOCATION, Modelsmaller_armor_model::createBodyLayer);
		event.registerLayerDefinition(ModelSummonedProjectileBeamer.LAYER_LOCATION, ModelSummonedProjectileBeamer::createBodyLayer);
		event.registerLayerDefinition(ModelLightBeam.LAYER_LOCATION, ModelLightBeam::createBodyLayer);
		event.registerLayerDefinition(ModelBedrockCracker.LAYER_LOCATION, ModelBedrockCracker::createBodyLayer);
		event.registerLayerDefinition(ModelFaceless.LAYER_LOCATION, ModelFaceless::createBodyLayer);
		event.registerLayerDefinition(ModelVoidJetpack.LAYER_LOCATION, ModelVoidJetpack::createBodyLayer);
	}
}