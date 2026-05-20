package net.starseer.fracturedreality.item;

import net.starseer.fracturedreality.FracturedRealityMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class Disk2193Item extends Item {
	public Disk2193Item() {
		super(new Item.Properties().stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(FracturedRealityMod.MODID, "disk_2193"))));
	}
}