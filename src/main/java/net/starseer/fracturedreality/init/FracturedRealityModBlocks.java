/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.block.*;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class FracturedRealityModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FracturedRealityMod.MODID);
	public static final DeferredBlock<Block> HOOK_FABRICATOR;
	public static final DeferredBlock<Block> GRAPPLING_POINT;
	public static final DeferredBlock<Block> VOID_BLOCK;
	public static final DeferredBlock<Block> CRACKED_VOID_BLOCK;
	public static final DeferredBlock<Block> VOID_BLOCKER_TOTEM;
	public static final DeferredBlock<Block> STARSEER_SPAWNER;
	public static final DeferredBlock<Block> LAUNCH_PAD;
	public static final DeferredBlock<Block> DISK_BURNER;
	public static final DeferredBlock<Block> FORGOTTEN;
	public static final DeferredBlock<Block> VOID_DRILL;
	public static final DeferredBlock<Block> SOUL_MAGMA;
	public static final DeferredBlock<Block> SOUL_LAVA;
	public static final DeferredBlock<Block> ENFORCER_DECORATIVE;
	public static final DeferredBlock<Block> TRUTH_SEEKER_DECORATIVE;
	public static final DeferredBlock<Block> FOLLOWER_DECORATIVE;
	public static final DeferredBlock<Block> STAR_CORE_DECORATIVE;
	public static final DeferredBlock<Block> WARPED_LADDER;
	public static final DeferredBlock<Block> DOOR_BLOCKER_MOLTEN;
	public static final DeferredBlock<Block> DOOR_BLOCKER_RAGNAROK;
	public static final DeferredBlock<Block> DOOR_BLOCKER_INVISIBLE;
	public static final DeferredBlock<Block> VOIDSLATE;
	public static final DeferredBlock<Block> GRASSY_VOID_SLATE;
	public static final DeferredBlock<Block> VOID_GENERATOR;
	public static final DeferredBlock<Block> VOID_STEEL_BLOCK;
	public static final DeferredBlock<Block> VOID_STEEL_BARS;
	public static final DeferredBlock<Block> SHARD_LANTERN;
	static {
		HOOK_FABRICATOR = REGISTRY.register("hook_fabricator", HookFabricatorBlock::new);
		GRAPPLING_POINT = REGISTRY.register("grappling_point", GrapplingPointBlock::new);
		VOID_BLOCK = REGISTRY.register("void_block", VoidBlockBlock::new);
		CRACKED_VOID_BLOCK = REGISTRY.register("cracked_void_block", CrackedVoidBlockBlock::new);
		VOID_BLOCKER_TOTEM = REGISTRY.register("void_blocker_totem", VoidBlockerTotemBlock::new);
		STARSEER_SPAWNER = REGISTRY.register("starseer_spawner", StarseerSpawnerBlock::new);
		LAUNCH_PAD = REGISTRY.register("launch_pad", LaunchPadBlock::new);
		DISK_BURNER = REGISTRY.register("disk_burner", DiskBurnerBlock::new);
		FORGOTTEN = REGISTRY.register("forgotten", ForgottenBlock::new);
		VOID_DRILL = REGISTRY.register("void_drill", VoidDrillBlock::new);
		SOUL_MAGMA = REGISTRY.register("soul_magma", SoulMagmaBlock::new);
		SOUL_LAVA = REGISTRY.register("soul_lava", SoulLavaBlock::new);
		ENFORCER_DECORATIVE = REGISTRY.register("enforcer_decorative", EnforcerDecorativeBlock::new);
		TRUTH_SEEKER_DECORATIVE = REGISTRY.register("truth_seeker_decorative", TruthSeekerDecorativeBlock::new);
		FOLLOWER_DECORATIVE = REGISTRY.register("follower_decorative", FollowerDecorativeBlock::new);
		STAR_CORE_DECORATIVE = REGISTRY.register("star_core_decorative", StarCoreDecorativeBlock::new);
		WARPED_LADDER = REGISTRY.register("warped_ladder", WarpedLadderBlock::new);
		DOOR_BLOCKER_MOLTEN = REGISTRY.register("door_blocker_molten", DoorBlockerMoltenBlock::new);
		DOOR_BLOCKER_RAGNAROK = REGISTRY.register("door_blocker_ragnarok", DoorBlockerRagnarokBlock::new);
		DOOR_BLOCKER_INVISIBLE = REGISTRY.register("door_blocker_invisible", DoorBlockerInvisibleBlock::new);
		VOIDSLATE = REGISTRY.register("voidslate", VoidslateBlock::new);
		GRASSY_VOID_SLATE = REGISTRY.register("grassy_void_slate", GrassyVoidSlateBlock::new);
		VOID_GENERATOR = REGISTRY.register("void_generator", VoidGeneratorBlock::new);
		VOID_STEEL_BLOCK = REGISTRY.register("void_steel_block", VoidSteelBlockBlock::new);
		VOID_STEEL_BARS = REGISTRY.register("void_steel_bars", VoidSteelBarsBlock::new);
		SHARD_LANTERN = REGISTRY.register("shard_lantern", ShardLanternBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			GrassyVoidSlateBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			GrassyVoidSlateBlock.itemColorLoad(event);
		}
	}
}