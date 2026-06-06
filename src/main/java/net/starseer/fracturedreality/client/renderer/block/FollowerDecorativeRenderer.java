package net.starseer.fracturedreality.client.renderer.block;

import net.starseer.fracturedreality.init.FracturedRealityModBlockEntities;
import net.starseer.fracturedreality.client.model.animations.PresenterAnimation;
import net.starseer.fracturedreality.client.model.ModelPresenter;
import net.starseer.fracturedreality.block.entity.FollowerDecorativeBlockEntity;
import net.starseer.fracturedreality.block.FollowerDecorativeBlock;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(Dist.CLIENT)
public class FollowerDecorativeRenderer implements BlockEntityRenderer<FollowerDecorativeBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;

	FollowerDecorativeRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(ModelPresenter.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("fractured_reality:textures/block/follower.png");
	}

	private void updateRenderState(FollowerDecorativeBlockEntity blockEntity) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		blockEntity.animationState0.animateWhen(true, tickCount);
		blockEntity.animationState1.animateWhen(true, tickCount);
	}

	@Override
	public void render(FollowerDecorativeBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight) {
		updateRenderState(blockEntity);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		BlockState state = blockEntity.getBlockState();
		Direction facing = state.getValue(FollowerDecorativeBlock.FACING);
		switch (facing) {
			case NORTH -> {
			}
			case EAST -> poseStack.mulPose(Axis.YP.rotationDegrees(90));
			case WEST -> poseStack.mulPose(Axis.YP.rotationDegrees(-90));
			case SOUTH -> poseStack.mulPose(Axis.YP.rotationDegrees(180));
		}
		if (state.getValue(FollowerDecorativeBlock.BOTTOM))
			poseStack.translate(0, 0.5, 0);
		poseStack.translate(0, -1, 0);
		VertexConsumer builder = renderer.getBuffer(RenderType.entityCutout(texture));
		model.setupBlockEntityAnim(blockEntity, blockEntity.getLevel().getGameTime() + partialTick);
		model.renderToBuffer(poseStack, builder, light, overlayLight);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FracturedRealityModBlockEntities.FOLLOWER_DECORATIVE.get(), FollowerDecorativeRenderer::new);
	}

	private static final class CustomHierarchicalModel extends ModelPresenter {
		private final ModelPart root;
		private final BlockEntityHierarchicalModel animator = new BlockEntityHierarchicalModel();

		public CustomHierarchicalModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		public void setupBlockEntityAnim(FollowerDecorativeBlockEntity blockEntity, float ageInTicks) {
			animator.setupBlockEntityAnim(blockEntity, ageInTicks);
			super.setupAnim(null, 0, 0, ageInTicks, 0, 0);
		}

		private class BlockEntityHierarchicalModel extends HierarchicalModel<Entity> {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			}

			public void setupBlockEntityAnim(FollowerDecorativeBlockEntity blockEntity, float ageInTicks) {
				animator.root().getAllParts().forEach(ModelPart::resetPose);
				animator.animate(blockEntity.animationState0, PresenterAnimation.base, ageInTicks, 1f);
				animator.animate(blockEntity.animationState1, PresenterAnimation.scaleDown, ageInTicks, 1f);
			}
		}
	}
}