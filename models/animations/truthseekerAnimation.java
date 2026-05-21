// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.1.4 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class truthseekerAnimation {
	public static final AnimationDefinition base = AnimationDefinition.Builder.withLength(4.0F).looping()
			.addAnimation("Hips",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -7.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("RLegU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("RLegM",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("RLegL",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-45.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("RFoot",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("LLegU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("LLegM",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("LLegL",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-45.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("LFoot",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("URArmU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 15.0F, -75.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("URArmL",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -30.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("ULArmU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -15.0F, 75.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("ULArmL",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 30.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 720.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Eye",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1440.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Eye",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition walk = AnimationDefinition.Builder.withLength(2.0F).looping()
			.addAnimation("Hips",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -7.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -7.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("RLegU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("LLegU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.5F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("URArmU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 30.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -30.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("ULArmU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 30.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -30.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();

	public static final AnimationDefinition attack = AnimationDefinition.Builder.withLength(0.5F)
			.addAnimation("Waist",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.25F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Chest",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.25F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("URArmU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.25F, KeyframeAnimations.degreeVec(7.6734F, -41.4883F, -16.8087F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("ULArmU",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.25F, KeyframeAnimations.degreeVec(9.3631F, 46.2647F, 17.6254F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}