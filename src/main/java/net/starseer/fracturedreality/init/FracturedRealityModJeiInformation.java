package net.starseer.fracturedreality.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class FracturedRealityModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("fractured_reality:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(FracturedRealityModBlocks.VOID_BLOCKER_TOTEM.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.fractured_reality.void_blocker_totem_guide"));
		registration.addIngredientInfo(List.of(new ItemStack(FracturedRealityModItems.GRAPPLING_HOOK.get()), new ItemStack(FracturedRealityModBlocks.GRAPPLING_POINT.get())), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.fractured_reality.grappling_guide"));
		registration.addIngredientInfo(List.of(new ItemStack(FracturedRealityModItems.VOID_STEEL_HELMET.get()), new ItemStack(FracturedRealityModItems.VOID_STEEL_CHESTPLATE.get()), new ItemStack(FracturedRealityModItems.VOID_STEEL_LEGGINGS.get()),
				new ItemStack(FracturedRealityModItems.VOID_STEEL_BOOTS.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.fractured_reality.void_steel_armor_guide"));
		registration.addIngredientInfo(List.of(new ItemStack(FracturedRealityModItems.VOID_STEEL_SWORD.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.fractured_reality.void_steel_sword_guide"));
	}
}