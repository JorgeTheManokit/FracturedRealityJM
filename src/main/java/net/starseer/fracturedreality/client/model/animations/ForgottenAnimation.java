package net.starseer.fracturedreality.client.model.animations;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 5.0.7 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class ForgottenAnimation {
	public static final AnimationDefinition Idle = AnimationDefinition.Builder.withLength(8.0F).looping()
			.addAnimation("Lleg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.5139F, -24.8984F, -2.6727F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.degreeVec(-5.5139F, -24.8984F, -2.6727F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(-5.5139F, -24.8984F, -2.6727F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Rarm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(-94.0622F, 8.0885F, 48.1976F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.75F, KeyframeAnimations.degreeVec(-71.2007F, 17.3927F, 48.9187F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(-75.937F, 2.7833F, 65.9154F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.25F, KeyframeAnimations.degreeVec(-94.0622F, 8.0885F, 48.1976F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(3.25F, KeyframeAnimations.degreeVec(-95.3421F, -1.4763F, 47.8269F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.degreeVec(-94.0622F, 8.0885F, 48.1976F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.875F, KeyframeAnimations.degreeVec(-82.1889F, -6.8542F, 69.6362F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.8333F, KeyframeAnimations.degreeVec(-39.7955F, -33.6899F, 41.2145F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(6.75F, KeyframeAnimations.degreeVec(12.4091F, 5.4021F, 61.9751F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(-94.0622F, 8.0885F, 48.1976F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Larm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(24.6375F, -15.0397F, -15.3316F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5833F, KeyframeAnimations.degreeVec(23.2945F, -13.1078F, -20.0863F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.125F, KeyframeAnimations.degreeVec(23.4057F, -18.8183F, -19.4454F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.125F, KeyframeAnimations.degreeVec(13.0688F, -11.2514F, -14.8365F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.9167F, KeyframeAnimations.degreeVec(-2.9254F, -12.3452F, -14.4665F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.degreeVec(24.6375F, -15.0397F, -15.3316F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.7917F, KeyframeAnimations.degreeVec(3.6539F, -14.8462F, -33.4336F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.4583F, KeyframeAnimations.degreeVec(1.6545F, -1.2784F, -62.3376F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(6.375F, KeyframeAnimations.degreeVec(39.1134F, -4.8796F, -48.8278F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(7.0833F, KeyframeAnimations.degreeVec(58.3964F, -7.3744F, -34.8911F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(24.6375F, -15.0397F, -15.3316F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Rleg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.1479F, 34.3927F, 16.9326F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.degreeVec(12.1479F, 34.3927F, 16.9326F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(12.1479F, 34.3927F, 16.9326F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Body",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(18.3211F, -0.5764F, 2.4327F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(3.0F, KeyframeAnimations.degreeVec(16.6247F, 1.1447F, -3.5742F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.7083F, KeyframeAnimations.degreeVec(12.5407F, -7.3917F, -1.4098F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.3333F, KeyframeAnimations.degreeVec(2.6828F, 0.5148F, 0.3566F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(6.2917F, KeyframeAnimations.degreeVec(-1.5637F, 13.2327F, -7.4665F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(7.0F, KeyframeAnimations.degreeVec(12.2851F, 8.9236F, -5.0811F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.7494F, -11.6333F, -12.1099F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.75F, KeyframeAnimations.degreeVec(-12.2506F, -11.6333F, -12.1099F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.7083F, KeyframeAnimations.degreeVec(-10.7904F, -9.1626F, 2.9349F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.7917F, KeyframeAnimations.degreeVec(6.5715F, -17.5507F, -16.6541F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.7494F, -11.6333F, -12.1099F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.7083F, KeyframeAnimations.degreeVec(9.4814F, -10.1321F, -19.3809F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.75F, KeyframeAnimations.degreeVec(15.869F, -11.6234F, -10.361F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(6.625F, KeyframeAnimations.degreeVec(25.985F, -23.0596F, -15.898F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(7.4167F, KeyframeAnimations.degreeVec(-1.9325F, -16.7592F, -8.7115F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(7.7494F, -11.6333F, -12.1099F), AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}