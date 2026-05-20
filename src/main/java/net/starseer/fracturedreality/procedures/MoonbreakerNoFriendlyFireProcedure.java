package net.starseer.fracturedreality.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MoonbreakerNoFriendlyFireProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:voidbeings")));
	}
}