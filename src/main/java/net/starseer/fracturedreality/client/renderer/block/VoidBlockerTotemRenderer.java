package net.starseer.fracturedreality.client.renderer.block;

import net.starseer.fracturedreality.procedures.VoidBlockerTotemPlaybackCondition3Procedure;
import net.starseer.fracturedreality.procedures.VoidBlockerTotemPlaybackCondition2Procedure;
import net.starseer.fracturedreality.procedures.VoidBlockerTotemPlaybackCondition1Procedure;
import net.starseer.fracturedreality.init.FracturedRealityModBlockEntities;
import net.starseer.fracturedreality.client.model.animations.voidBlockerTotemAnimation;
import net.starseer.fracturedreality.client.model.ModelvoidBlockerTotem;
import net.starseer.fracturedreality.block.entity.VoidBlockerTotemBlockEntity;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(Dist.CLIENT)
public class VoidBlockerTotemRenderer implements BlockEntityRenderer<VoidBlockerTotemBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;

	VoidBlockerTotemRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(ModelvoidBlockerTotem.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("fractured_reality:textures/block/void_blocker_totem.png");
	}

	private void updateRenderState(VoidBlockerTotemBlockEntity blockEntity) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		blockEntity.animationState0.animateWhen(VoidBlockerTotemPlaybackCondition1Procedure.execute(blockEntity.getBlockState()), tickCount);
		blockEntity.animationState1.animateWhen(VoidBlockerTotemPlaybackCondition2Procedure.execute(blockEntity.getBlockState()), tickCount);
		blockEntity.animationState2.animateWhen(VoidBlockerTotemPlaybackCondition3Procedure.execute(blockEntity.getBlockState()), tickCount);
		blockEntity.animationState3.animateWhen(true, tickCount);
	}

	@Override
	public void render(VoidBlockerTotemBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight) {
		updateRenderState(blockEntity);
		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		poseStack.translate(0, -1, 0);
		VertexConsumer builder = renderer.getBuffer(RenderType.entityCutout(texture));
		model.setupBlockEntityAnim(blockEntity, blockEntity.getLevel().getGameTime() + partialTick);
		model.renderToBuffer(poseStack, builder, light, overlayLight);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FracturedRealityModBlockEntities.VOID_BLOCKER_TOTEM.get(), VoidBlockerTotemRenderer::new);
	}

	private static final class CustomHierarchicalModel extends ModelvoidBlockerTotem {
		private final ModelPart root;
		private final BlockEntityHierarchicalModel animator = new BlockEntityHierarchicalModel();

		public CustomHierarchicalModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		public void setupBlockEntityAnim(VoidBlockerTotemBlockEntity blockEntity, float ageInTicks) {
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

			public void setupBlockEntityAnim(VoidBlockerTotemBlockEntity blockEntity, float ageInTicks) {
				animator.root().getAllParts().forEach(ModelPart::resetPose);
				animator.animate(blockEntity.animationState0, voidBlockerTotemAnimation.Ring1Biggen, ageInTicks, 1f);
				animator.animate(blockEntity.animationState1, voidBlockerTotemAnimation.Ring2Biggen, ageInTicks, 1f);
				animator.animate(blockEntity.animationState2, voidBlockerTotemAnimation.Ring3Biggen, ageInTicks, 1f);
				animator.animate(blockEntity.animationState3, voidBlockerTotemAnimation.base, ageInTicks, 1f);
			}
		}
	}
}