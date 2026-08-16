package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.LightningStrikerEntity;
import net.starseer.fracturedreality.client.model.animations.LIghtningStrikerAnimation;
import net.starseer.fracturedreality.client.model.ModelLIghtningStriker;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LightningStrikerRenderer extends MobRenderer<LightningStrikerEntity, ModelLIghtningStriker<LightningStrikerEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("fractured_reality:textures/entities/lightning_striker.png");

	public LightningStrikerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelLIghtningStriker.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<LightningStrikerEntity, ModelLIghtningStriker<LightningStrikerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/lightning_striker.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LightningStrikerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LightningStrikerEntity entity) {
		return entityTexture;
	}

	@Override
	protected boolean isBodyVisible(LightningStrikerEntity entity) {
		return false;
	}

	private static final class AnimatedModel extends ModelLIghtningStriker<LightningStrikerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<LightningStrikerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(LightningStrikerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, LIghtningStrikerAnimation.ScaleUp, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(LightningStrikerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}