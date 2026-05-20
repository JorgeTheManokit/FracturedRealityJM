/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.block.*;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

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
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}