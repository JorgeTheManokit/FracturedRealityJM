package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;
import net.starseer.fracturedreality.init.FracturedRealityModBlocks;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LoadAbyssStructuresProcedure {
	public static void execute(LevelAccessor world) {
		if (FracturedRealityModVariables.MapVariables.get(world).GenerateAbyssStruct) {
			FracturedRealityModVariables.MapVariables.get(world).GenerateAbyssStruct = false;
			FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("fractured_reality", "throne_of_ragnarok"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(-36, 61, -13), new BlockPos(-36, 61, -13), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			world.setBlock(new BlockPos(0, 67, 37), FracturedRealityModBlocks.MOLTEN_SPAWN.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(0, 74, 90), FracturedRealityModBlocks.RAGNAROK_SPAWN.get().defaultBlockState(), 3);
		}
	}
}