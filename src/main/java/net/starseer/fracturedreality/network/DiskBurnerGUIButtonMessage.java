package net.starseer.fracturedreality.network;

import net.starseer.fracturedreality.procedures.*;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

@EventBusSubscriber
public record DiskBurnerGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {
	public static final Type<DiskBurnerGUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(FracturedRealityMod.MODID, "disk_burner_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, DiskBurnerGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, DiskBurnerGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new DiskBurnerGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<DiskBurnerGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final DiskBurnerGUIButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (buttonID == 0) {

			BurnLog1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			BurnLog2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			BurnLog3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			BurnLog4Procedure.execute(entity);
		}
		if (buttonID == 4) {

			BurnLog5Procedure.execute(entity);
		}
		if (buttonID == 5) {

			BurnLog6Procedure.execute(entity);
		}
		if (buttonID == 6) {

			BurnLog7Procedure.execute(entity);
		}
		if (buttonID == 7) {

			BurnLog8Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FracturedRealityMod.addNetworkMessage(DiskBurnerGUIButtonMessage.TYPE, DiskBurnerGUIButtonMessage.STREAM_CODEC, DiskBurnerGUIButtonMessage::handleData);
	}
}