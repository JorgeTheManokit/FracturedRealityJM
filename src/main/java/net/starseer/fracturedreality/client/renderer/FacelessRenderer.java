package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.FacelessEntity;
import net.starseer.fracturedreality.client.model.animations.FacelessAnimation;
import net.starseer.fracturedreality.client.model.ModelFaceless;

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

public class FacelessRenderer extends MobRenderer<FacelessEntity, ModelFaceless<FacelessEntity>> {
	public FacelessRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelFaceless.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<FacelessEntity, ModelFaceless<FacelessEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/faceless_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, FacelessEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FacelessEntity entity) {
		return ResourceLocation.parse("fractured_reality:textures/entities/faceless.png");
	}

	private static final class AnimatedModel extends ModelFaceless<FacelessEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<FacelessEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(FacelessEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, FacelessAnimation.Constant, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(FacelessEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}