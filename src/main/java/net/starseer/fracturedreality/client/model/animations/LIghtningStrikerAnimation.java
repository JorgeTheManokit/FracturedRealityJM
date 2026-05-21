package net.starseer.fracturedreality.client.model.animations;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 5.1.4 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class LIghtningStrikerAnimation {
	public static final AnimationDefinition ScaleUp = AnimationDefinition.Builder.withLength(1.0F).addAnimation("Circle", new AnimationChannel(AnimationChannel.Targets.SCALE,
			new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.125F, 0.125F, 0.125F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.0F, KeyframeAnimations.scaleVec(0.3333F, 0.3333F, 0.3333F), AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}