package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModItems;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@EventBusSubscriber
public class VoidJetpackTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		Vec3 VectorA = Vec3.ZERO;
		if ((getEntityGameType(entity) == GameType.SURVIVAL || getEntityGameType(entity) == GameType.ADVENTURE)
				&& !((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("fractured_reality:reality_edge")))) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == FracturedRealityModItems.VOID_JETPACK_CHESTPLATE.get());
				_player.onUpdateAbilities();
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == FracturedRealityModItems.VOID_JETPACK_CHESTPLATE.get() && !entity.onGround()) {
				if (!(entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttribute(Attributes.BLOCK_BREAK_SPEED).hasModifier(ResourceLocation.parse("fractured_reality:jetpack_minespeed_mult")))) {
					if (entity instanceof LivingEntity _entity) {
						AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("fractured_reality:jetpack_minespeed_mult"), 5, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
						if (!_entity.getAttribute(Attributes.BLOCK_BREAK_SPEED).hasModifier(modifier.id())) {
							_entity.getAttribute(Attributes.BLOCK_BREAK_SPEED).addPermanentModifier(modifier);
						}
					}
				}
			} else {
				if (entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttribute(Attributes.BLOCK_BREAK_SPEED).hasModifier(ResourceLocation.parse("fractured_reality:jetpack_minespeed_mult"))) {
					if (entity instanceof LivingEntity _entity) {
						_entity.getAttribute(Attributes.BLOCK_BREAK_SPEED).removeModifier(ResourceLocation.parse("fractured_reality:jetpack_minespeed_mult"));
					}
				}
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}