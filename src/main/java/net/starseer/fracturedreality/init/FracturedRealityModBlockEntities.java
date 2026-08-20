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
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EnforcerDecorativeBlockEntity>> ENFORCER_DECORATIVE = register("enforcer_decorative", FracturedRealityModBlocks.ENFORCER_DECORATIVE, EnforcerDecorativeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TruthSeekerDecorativeBlockEntity>> TRUTH_SEEKER_DECORATIVE = register("truth_seeker_decorative", FracturedRealityModBlocks.TRUTH_SEEKER_DECORATIVE,
			TruthSeekerDecorativeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FollowerDecorativeBlockEntity>> FOLLOWER_DECORATIVE = register("follower_decorative", FracturedRealityModBlocks.FOLLOWER_DECORATIVE, FollowerDecorativeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<StarCoreDecorativeBlockEntity>> STAR_CORE_DECORATIVE = register("star_core_decorative", FracturedRealityModBlocks.STAR_CORE_DECORATIVE, StarCoreDecorativeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DoorBlockerMoltenBlockEntity>> DOOR_BLOCKER_MOLTEN = register("door_blocker_molten", FracturedRealityModBlocks.DOOR_BLOCKER_MOLTEN, DoorBlockerMoltenBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DoorBlockerRagnarokBlockEntity>> DOOR_BLOCKER_RAGNAROK = register("door_blocker_ragnarok", FracturedRealityModBlocks.DOOR_BLOCKER_RAGNAROK,
			DoorBlockerRagnarokBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<VoidGeneratorBlockEntity>> VOID_GENERATOR = register("void_generator", FracturedRealityModBlocks.VOID_GENERATOR, VoidGeneratorBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ShardLanternBlockEntity>> SHARD_LANTERN = register("shard_lantern", FracturedRealityModBlocks.SHARD_LANTERN, ShardLanternBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MoltenSpawnBlockEntity>> MOLTEN_SPAWN = register("molten_spawn", FracturedRealityModBlocks.MOLTEN_SPAWN, MoltenSpawnBlockEntity::new);

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
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENFORCER_DECORATIVE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TRUTH_SEEKER_DECORATIVE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FOLLOWER_DECORATIVE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, STAR_CORE_DECORATIVE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DOOR_BLOCKER_MOLTEN.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DOOR_BLOCKER_RAGNAROK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, VOID_GENERATOR.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SHARD_LANTERN.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MOLTEN_SPAWN.get(), SidedInvWrapper::new);
	}
}