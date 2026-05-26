/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.block.entity.*;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber
public class FracturedRealityModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, FracturedRealityMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<HookFabricatorBlockEntity>> HOOK_FABRICATOR = register("hook_fabricator", FracturedRealityModBlocks.HOOK_FABRICATOR, HookFabricatorBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GrapplingPointBlockEntity>> GRAPPLING_POINT = register("grappling_point", FracturedRealityModBlocks.GRAPPLING_POINT, GrapplingPointBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<VoidBlockerTotemBlockEntity>> VOID_BLOCKER_TOTEM = register("void_blocker_totem", FracturedRealityModBlocks.VOID_BLOCKER_TOTEM, VoidBlockerTotemBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<StarseerSpawnerBlockEntity>> STARSEER_SPAWNER = register("starseer_spawner", FracturedRealityModBlocks.STARSEER_SPAWNER, StarseerSpawnerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LaunchPadBlockEntity>> LAUNCH_PAD = register("launch_pad", FracturedRealityModBlocks.LAUNCH_PAD, LaunchPadBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DiskBurnerBlockEntity>> DISK_BURNER = register("disk_burner", FracturedRealityModBlocks.DISK_BURNER, DiskBurnerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ForgottenBlockEntity>> FORGOTTEN = register("forgotten", FracturedRealityModBlocks.FORGOTTEN, ForgottenBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<VoidDrillBlockEntity>> VOID_DRILL = register("void_drill", FracturedRealityModBlocks.VOID_DRILL, VoidDrillBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HOOK_FABRICATOR.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRAPPLING_POINT.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, VOID_BLOCKER_TOTEM.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, STARSEER_SPAWNER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LAUNCH_PAD.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DISK_BURNER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FORGOTTEN.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, VOID_DRILL.get(), SidedInvWrapper::new);
	}
}