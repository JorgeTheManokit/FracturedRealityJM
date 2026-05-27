/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class FracturedRealityModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FracturedRealityMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FracturedRealityModItems.PRESENTER_SPAWN_EGG.get());
			tabData.accept(FracturedRealityModItems.BEAM_SUMMONER_SPAWN_EGG.get());
			tabData.accept(FracturedRealityModItems.FACELESS_SPAWN_EGG.get());
			tabData.accept(FracturedRealityModItems.MOON_BREAKER_SPAWN_EGG.get());
			tabData.accept(FracturedRealityModItems.ENFORCER_SPAWN_EGG.get());
			tabData.accept(FracturedRealityModItems.SHATTERED_SPAWN_EGG.get());
			tabData.accept(FracturedRealityModItems.TRUTHSEEKER_SPAWN_EGG.get());
			tabData.accept(FracturedRealityModItems.STARCORE_SPAWN_EGG.get());
			tabData.accept(FracturedRealityModItems.FOLLOWER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FracturedRealityModItems.VOID_JETPACK_CHESTPLATE.get());
			tabData.accept(FracturedRealityModItems.GRAPPLING_HOOK.get());
			tabData.accept(FracturedRealityModBlocks.GRAPPLING_POINT.get().asItem());
			tabData.accept(FracturedRealityModItems.DISK_VOID.get());
			tabData.accept(FracturedRealityModItems.DISK_289.get());
			tabData.accept(FracturedRealityModItems.DISK_475.get());
			tabData.accept(FracturedRealityModItems.DISK_748.get());
			tabData.accept(FracturedRealityModItems.DISK_1052.get());
			tabData.accept(FracturedRealityModItems.DISK_1644.get());
			tabData.accept(FracturedRealityModItems.DISK_2193.get());
			tabData.accept(FracturedRealityModItems.DISK_2374.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(FracturedRealityModItems.VOID_DROP.get());
			tabData.accept(FracturedRealityModItems.VOID_BLOB.get());
			tabData.accept(FracturedRealityModItems.VOID_STEEL_INGOT.get());
			tabData.accept(FracturedRealityModItems.VOID_UPGRADE_TEMPLATE.get());
			tabData.accept(FracturedRealityModItems.BLANK_DISK.get());
			tabData.accept(FracturedRealityModItems.STAR_DUST.get());
			tabData.accept(FracturedRealityModItems.STAR_SHARD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FracturedRealityModItems.VOID_STEEL_HELMET.get());
			tabData.accept(FracturedRealityModItems.VOID_STEEL_CHESTPLATE.get());
			tabData.accept(FracturedRealityModItems.VOID_STEEL_LEGGINGS.get());
			tabData.accept(FracturedRealityModItems.VOID_STEEL_BOOTS.get());
			tabData.accept(FracturedRealityModItems.VOID_STEEL_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(FracturedRealityModBlocks.VOID_BLOCKER_TOTEM.get().asItem());
			tabData.accept(FracturedRealityModBlocks.LAUNCH_PAD.get().asItem());
			tabData.accept(FracturedRealityModBlocks.DISK_BURNER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(FracturedRealityModBlocks.FORGOTTEN.get().asItem());
			}
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(FracturedRealityModBlocks.VOID_DRILL.get().asItem());
		}
	}
}