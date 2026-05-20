// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.0.7 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class StarseerSpawnerAnimation {
	public static final AnimationDefinition loop = AnimationDefinition.Builder.withLength(8.0F).looping()
			.addAnimation("Floor",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Floor",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.125F, 1.125F, 1.125F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(3.0F, KeyframeAnimations.scaleVec(1.125F, 1.125F, 1.125F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(5.0F, KeyframeAnimations.scaleVec(1.125F, 1.125F, 1.125F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(6.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(7.0F, KeyframeAnimations.scaleVec(1.125F, 1.125F, 1.125F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}