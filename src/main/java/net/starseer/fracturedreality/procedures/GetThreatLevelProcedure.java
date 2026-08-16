package net.starseer.fracturedreality.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import java.util.Comparator;

public class GetThreatLevelProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return 0;
		double threatLevel = 0;
		double threatCount = 0;
		threatCount = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:low_threat")))) {
						threatCount = threatCount + 0.25;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:medium_threat")))) {
						threatCount = threatCount + 0.5;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:medium_threat")))) {
						threatCount = threatCount + 1;
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:low_threat")))) {
						threatCount = threatCount + 0.25;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:medium_threat")))) {
						threatCount = threatCount + 0.5;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:medium_threat")))) {
						threatCount = threatCount + 1;
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:low_threat")))) {
						threatCount = threatCount + 0.25;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:medium_threat")))) {
						threatCount = threatCount + 0.5;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:medium_threat")))) {
						threatCount = threatCount + 1;
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:low_threat")))) {
						threatCount = threatCount + 0.25;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:medium_threat")))) {
						threatCount = threatCount + 0.5;
					} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:medium_threat")))) {
						threatCount = threatCount + 1;
					}
				}
			}
		}
		if (threatCount >= 8) {
			threatLevel = 5;
		} else if (threatCount >= 4) {
			threatLevel = 4;
		} else if (threatCount >= 2) {
			threatLevel = 3;
		} else if (threatCount >= 1) {
			threatLevel = 2;
		} else if (threatCount >= 0.25) {
			threatLevel = 1;
		} else {
			threatLevel = 0;
		}
		return threatLevel;
	}
}