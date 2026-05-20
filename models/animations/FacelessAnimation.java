// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.0.7 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class FacelessAnimation {
	public static final AnimationDefinition Constant = AnimationDefinition.Builder.withLength(2.0F).looping()
			.addAnimation("Casing",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(-90.0F, -180.0F, 360.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();
}