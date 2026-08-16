package net.starseer.fracturedreality.client.gui;

import net.starseer.fracturedreality.world.inventory.DiskBurnerGUIMenu;
import net.starseer.fracturedreality.network.DiskBurnerGUIButtonMessage;
import net.starseer.fracturedreality.init.FracturedRealityModScreens;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import com.mojang.blaze3d.systems.RenderSystem;

public class DiskBurnerGUIScreen extends AbstractContainerScreen<DiskBurnerGUIMenu> implements FracturedRealityModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_void_fluid;
	private Button button_s289;
	private Button button_s475;
	private Button button_s748;
	private Button button_s1052;
	private Button button_s1644;
	private Button button_s2193;
	private Button button_s2374_vml;
	private static final ResourceLocation BACKGROUND = ResourceLocation.parse("fractured_reality:textures/screens/disk_burner_gui.png");
	private static final ResourceLocation IMAGE_0 = ResourceLocation.parse("fractured_reality:textures/screens/left_arrow.png");
	private static final ResourceLocation IMAGE_1 = ResourceLocation.parse("fractured_reality:textures/screens/disc_slot.png");

	public DiskBurnerGUIScreen(DiskBurnerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 240;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(IMAGE_0, this.leftPos + 41, this.topPos + 99, 0, 0, 36, 18, 36, 18);
		guiGraphics.blit(IMAGE_1, this.leftPos + 24, this.topPos + 100, 0, 0, 16, 16, 16, 16);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fractured_reality.disk_burner_gui.label_disk_burner"), 5, 5, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_void_fluid = Button.builder(Component.translatable("gui.fractured_reality.disk_burner_gui.button_void_fluid"), e -> {
			int x = DiskBurnerGUIScreen.this.x;
			int y = DiskBurnerGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new DiskBurnerGUIButtonMessage(0, x, y, z));
				DiskBurnerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 33, this.topPos + 17, 63, 20).build();
		this.addRenderableWidget(button_void_fluid);
		button_s289 = Button.builder(Component.translatable("gui.fractured_reality.disk_burner_gui.button_s289"), e -> {
			int x = DiskBurnerGUIScreen.this.x;
			int y = DiskBurnerGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new DiskBurnerGUIButtonMessage(1, x, y, z));
				DiskBurnerGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 33, this.topPos + 44, 63, 20).build();
		this.addRenderableWidget(button_s289);
		button_s475 = Button.builder(Component.translatable("gui.fractured_reality.disk_burner_gui.button_s475"), e -> {
			int x = DiskBurnerGUIScreen.this.x;
			int y = DiskBurnerGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new DiskBurnerGUIButtonMessage(2, x, y, z));
				DiskBurnerGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 33, this.topPos + 71, 63, 20).build();
		this.addRenderableWidget(button_s475);
		button_s748 = Button.builder(Component.translatable("gui.fractured_reality.disk_burner_gui.button_s748"), e -> {
			int x = DiskBurnerGUIScreen.this.x;
			int y = DiskBurnerGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new DiskBurnerGUIButtonMessage(3, x, y, z));
				DiskBurnerGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 17, 63, 20).build();
		this.addRenderableWidget(button_s748);
		button_s1052 = Button.builder(Component.translatable("gui.fractured_reality.disk_burner_gui.button_s1052"), e -> {
			int x = DiskBurnerGUIScreen.this.x;
			int y = DiskBurnerGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new DiskBurnerGUIButtonMessage(4, x, y, z));
				DiskBurnerGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 44, 63, 20).build();
		this.addRenderableWidget(button_s1052);
		button_s1644 = Button.builder(Component.translatable("gui.fractured_reality.disk_burner_gui.button_s1644"), e -> {
			int x = DiskBurnerGUIScreen.this.x;
			int y = DiskBurnerGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new DiskBurnerGUIButtonMessage(5, x, y, z));
				DiskBurnerGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 71, 63, 20).build();
		this.addRenderableWidget(button_s1644);
		button_s2193 = Button.builder(Component.translatable("gui.fractured_reality.disk_burner_gui.button_s2193"), e -> {
			int x = DiskBurnerGUIScreen.this.x;
			int y = DiskBurnerGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new DiskBurnerGUIButtonMessage(6, x, y, z));
				DiskBurnerGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 98, 63, 20).build();
		this.addRenderableWidget(button_s2193);
		button_s2374_vml = Button.builder(Component.translatable("gui.fractured_reality.disk_burner_gui.button_s2374_vml"), e -> {
			int x = DiskBurnerGUIScreen.this.x;
			int y = DiskBurnerGUIScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new DiskBurnerGUIButtonMessage(7, x, y, z));
				DiskBurnerGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 105, this.topPos + 125, 63, 20).build();
		this.addRenderableWidget(button_s2374_vml);
	}
}