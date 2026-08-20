/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.procedures.GrapplingHookPropertyValueProviderProcedure;
import net.starseer.fracturedreality.item.*;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

public class FracturedRealityModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FracturedRealityMod.MODID);
	public static final DeferredItem<Item> PRESENTER_SPAWN_EGG;
	public static final DeferredItem<Item> BEAM_SUMMONER_SPAWN_EGG;
	public static final DeferredItem<Item> FACELESS_SPAWN_EGG;
	public static final DeferredItem<Item> VOID_JETPACK_CHESTPLATE;
	public static final DeferredItem<Item> VOID_DROP;
	public static final DeferredItem<Item> VOID_BLOB;
	public static final DeferredItem<Item> VOID_STEEL_INGOT;
	public static final DeferredItem<Item> VOID_UPGRADE_TEMPLATE;
	public static final DeferredItem<Item> MOON_BREAKER_SPAWN_EGG;
	public static final DeferredItem<Item> ADV_ICON_1;
	public static final DeferredItem<Item> ADV_ICON_2;
	public static final DeferredItem<Item> VOID_STEEL_HELMET;
	public static final DeferredItem<Item> VOID_STEEL_CHESTPLATE;
	public static final DeferredItem<Item> VOID_STEEL_LEGGINGS;
	public static final DeferredItem<Item> VOID_STEEL_BOOTS;
	public static final DeferredItem<Item> GRAPPLING_HOOK;
	public static final DeferredItem<Item> GRAPPLING_POINT;
	public static final DeferredItem<Item> VOID_BLOCK;
	public static final DeferredItem<Item> CRACKED_VOID_BLOCK;
	public static final DeferredItem<Item> VOID_BLOCKER_TOTEM;
	public static final DeferredItem<Item> LAUNCH_PAD;
	public static final DeferredItem<Item> ADV_ICON_3;
	public static final DeferredItem<Item> ADV_ICON_4;
	public static final DeferredItem<Item> BLANK_DISK;
	public static final DeferredItem<Item> DISK_BURNER;
	public static final DeferredItem<Item> DISK_VOID;
	public static final DeferredItem<Item> DISK_289;
	public static final DeferredItem<Item> DISK_475;
	public static final DeferredItem<Item> DISK_748;
	public static final DeferredItem<Item> DISK_1052;
	public static final DeferredItem<Item> DISK_1644;
	public static final DeferredItem<Item> DISK_2193;
	public static final DeferredItem<Item> DISK_2374;
	public static final DeferredItem<Item> FORGOTTEN;
	public static final DeferredItem<Item> VOID_STEEL_SWORD;
	public static final DeferredItem<Item> ENFORCER_SPAWN_EGG;
	public static final DeferredItem<Item> SHATTERED_SPAWN_EGG;
	public static final DeferredItem<Item> TRUTHSEEKER_SPAWN_EGG;
	public static final DeferredItem<Item> STAR_DUST;
	public static final DeferredItem<Item> STARCORE_SPAWN_EGG;
	public static final DeferredItem<Item> STAR_SHARD;
	public static final DeferredItem<Item> VOID_DRILL;
	public static final DeferredItem<Item> FOLLOWER_SPAWN_EGG;
	public static final DeferredItem<Item> SOUL_MAGMA;
	public static final DeferredItem<Item> ENFORCER_DECORATIVE;
	public static final DeferredItem<Item> TRUTH_SEEKER_DECORATIVE;
	public static final DeferredItem<Item> FOLLOWER_DECORATIVE;
	public static final DeferredItem<Item> STAR_CORE_DECORATIVE;
	public static final DeferredItem<Item> WARPED_LADDER;
	public static final DeferredItem<Item> DOOR_BLOCKER_MOLTEN;
	public static final DeferredItem<Item> DOOR_BLOCKER_RAGNAROK;
	public static final DeferredItem<Item> DOOR_BLOCKER_INVISIBLE;
	public static final DeferredItem<Item> VOIDSLATE;
	public static final DeferredItem<Item> GRASSY_VOID_SLATE;
	public static final DeferredItem<Item> VOID_GENERATOR;
	public static final DeferredItem<Item> VOID_STEEL_BLOCK;
	public static final DeferredItem<Item> VOID_STEEL_BARS;
	public static final DeferredItem<Item> SHARD_LANTERN;
	public static final DeferredItem<Item> VOID_BRICKS;
	public static final DeferredItem<Item> VOID_BRICK_STAIRS;
	public static final DeferredItem<Item> VOID_BRICK_SLAB;
	public static final DeferredItem<Item> VOID_BRICK_WALL;
	static {
		PRESENTER_SPAWN_EGG = REGISTRY.register("presenter_spawn_egg", () -> new DeferredSpawnEggItem(FracturedRealityModEntities.PRESENTER, -1, -1, new Item.Properties()));
		BEAM_SUMMONER_SPAWN_EGG = REGISTRY.register("beam_summoner_spawn_egg", () -> new DeferredSpawnEggItem(FracturedRealityModEntities.BEAM_SUMMONER, -1, -1, new Item.Properties()));
		FACELESS_SPAWN_EGG = REGISTRY.register("faceless_spawn_egg", () -> new DeferredSpawnEggItem(FracturedRealityModEntities.FACELESS, -1, -1, new Item.Properties()));
		VOID_JETPACK_CHESTPLATE = REGISTRY.register("void_jetpack_chestplate", VoidJetpackItem.Chestplate::new);
		VOID_DROP = REGISTRY.register("void_drop", VoidDropItem::new);
		VOID_BLOB = REGISTRY.register("void_blob", VoidBlobItem::new);
		VOID_STEEL_INGOT = REGISTRY.register("void_steel_ingot", VoidSteelIngotItem::new);
		VOID_UPGRADE_TEMPLATE = REGISTRY.register("void_upgrade_template", VoidUpgradeTemplateItem::new);
		MOON_BREAKER_SPAWN_EGG = REGISTRY.register("moon_breaker_spawn_egg", () -> new DeferredSpawnEggItem(FracturedRealityModEntities.MOON_BREAKER, -1, -1, new Item.Properties()));
		ADV_ICON_1 = REGISTRY.register("adv_icon_1", AdvIcon1Item::new);
		ADV_ICON_2 = REGISTRY.register("adv_icon_2", AdvIcon2Item::new);
		VOID_STEEL_HELMET = REGISTRY.register("void_steel_helmet", VoidSteelItem.Helmet::new);
		VOID_STEEL_CHESTPLATE = REGISTRY.register("void_steel_chestplate", VoidSteelItem.Chestplate::new);
		VOID_STEEL_LEGGINGS = REGISTRY.register("void_steel_leggings", VoidSteelItem.Leggings::new);
		VOID_STEEL_BOOTS = REGISTRY.register("void_steel_boots", VoidSteelItem.Boots::new);
		GRAPPLING_HOOK = REGISTRY.register("grappling_hook", GrapplingHookItem::new);
		GRAPPLING_POINT = block(FracturedRealityModBlocks.GRAPPLING_POINT);
		VOID_BLOCK = block(FracturedRealityModBlocks.VOID_BLOCK);
		CRACKED_VOID_BLOCK = block(FracturedRealityModBlocks.CRACKED_VOID_BLOCK);
		VOID_BLOCKER_TOTEM = block(FracturedRealityModBlocks.VOID_BLOCKER_TOTEM, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
		LAUNCH_PAD = block(FracturedRealityModBlocks.LAUNCH_PAD);
		ADV_ICON_3 = REGISTRY.register("adv_icon_3", AdvIcon3Item::new);
		ADV_ICON_4 = REGISTRY.register("adv_icon_4", AdvIcon4Item::new);
		BLANK_DISK = REGISTRY.register("blank_disk", BlankDiskItem::new);
		DISK_BURNER = block(FracturedRealityModBlocks.DISK_BURNER);
		DISK_VOID = REGISTRY.register("disk_void", DiskVoidItem::new);
		DISK_289 = REGISTRY.register("disk_289", Disk289Item::new);
		DISK_475 = REGISTRY.register("disk_475", Disk475Item::new);
		DISK_748 = REGISTRY.register("disk_748", Disk748Item::new);
		DISK_1052 = REGISTRY.register("disk_1052", Disk1052Item::new);
		DISK_1644 = REGISTRY.register("disk_1644", Disk1644Item::new);
		DISK_2193 = REGISTRY.register("disk_2193", Disk2193Item::new);
		DISK_2374 = REGISTRY.register("disk_2374", Disk2374Item::new);
		FORGOTTEN = block(FracturedRealityModBlocks.FORGOTTEN);
		VOID_STEEL_SWORD = REGISTRY.register("void_steel_sword", VoidSteelSwordItem::new);
		ENFORCER_SPAWN_EGG = REGISTRY.register("enforcer_spawn_egg", () -> new DeferredSpawnEggItem(FracturedRealityModEntities.ENFORCER, -1, -1, new Item.Properties()));
		SHATTERED_SPAWN_EGG = REGISTRY.register("shattered_spawn_egg", () -> new DeferredSpawnEggItem(FracturedRealityModEntities.SHATTERED, -1, -1, new Item.Properties()));
		TRUTHSEEKER_SPAWN_EGG = REGISTRY.register("truthseeker_spawn_egg", () -> new DeferredSpawnEggItem(FracturedRealityModEntities.TRUTHSEEKER, -1, -1, new Item.Properties()));
		STAR_DUST = REGISTRY.register("star_dust", StarDustItem::new);
		STARCORE_SPAWN_EGG = REGISTRY.register("starcore_spawn_egg", () -> new DeferredSpawnEggItem(FracturedRealityModEntities.STARCORE, -1, -1, new Item.Properties()));
		STAR_SHARD = REGISTRY.register("star_shard", StarShardItem::new);
		VOID_DRILL = block(FracturedRealityModBlocks.VOID_DRILL);
		FOLLOWER_SPAWN_EGG = REGISTRY.register("follower_spawn_egg", () -> new DeferredSpawnEggItem(FracturedRealityModEntities.FOLLOWER, -1, -1, new Item.Properties()));
		SOUL_MAGMA = block(FracturedRealityModBlocks.SOUL_MAGMA);
		ENFORCER_DECORATIVE = block(FracturedRealityModBlocks.ENFORCER_DECORATIVE);
		TRUTH_SEEKER_DECORATIVE = block(FracturedRealityModBlocks.TRUTH_SEEKER_DECORATIVE);
		FOLLOWER_DECORATIVE = block(FracturedRealityModBlocks.FOLLOWER_DECORATIVE);
		STAR_CORE_DECORATIVE = block(FracturedRealityModBlocks.STAR_CORE_DECORATIVE);
		WARPED_LADDER = block(FracturedRealityModBlocks.WARPED_LADDER);
		DOOR_BLOCKER_MOLTEN = block(FracturedRealityModBlocks.DOOR_BLOCKER_MOLTEN);
		DOOR_BLOCKER_RAGNAROK = block(FracturedRealityModBlocks.DOOR_BLOCKER_RAGNAROK);
		DOOR_BLOCKER_INVISIBLE = block(FracturedRealityModBlocks.DOOR_BLOCKER_INVISIBLE);
		VOIDSLATE = block(FracturedRealityModBlocks.VOIDSLATE);
		GRASSY_VOID_SLATE = block(FracturedRealityModBlocks.GRASSY_VOID_SLATE);
		VOID_GENERATOR = block(FracturedRealityModBlocks.VOID_GENERATOR);
		VOID_STEEL_BLOCK = block(FracturedRealityModBlocks.VOID_STEEL_BLOCK);
		VOID_STEEL_BARS = block(FracturedRealityModBlocks.VOID_STEEL_BARS);
		SHARD_LANTERN = block(FracturedRealityModBlocks.SHARD_LANTERN);
		VOID_BRICKS = block(FracturedRealityModBlocks.VOID_BRICKS);
		VOID_BRICK_STAIRS = block(FracturedRealityModBlocks.VOID_BRICK_STAIRS);
		VOID_BRICK_SLAB = block(FracturedRealityModBlocks.VOID_BRICK_SLAB);
		VOID_BRICK_WALL = block(FracturedRealityModBlocks.VOID_BRICK_WALL);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class ItemsClientSideHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void clientLoad(FMLClientSetupEvent event) {
			event.enqueueWork(() -> {
				ItemProperties.register(GRAPPLING_HOOK.get(), ResourceLocation.parse("fractured_reality:grappling_hook_used"),
						(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GrapplingHookPropertyValueProviderProcedure.execute(itemStackToRender));
			});
		}
	}
}