package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GravityFluxOnEntityProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (FracturedRealityModVariables.MapVariables.get(world).DoGravityFlux) {
			if (FracturedRealityModVariables.MapVariables.get(world).GravityFlux > 0) {
				if (!(entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttribute(Attributes.GRAVITY).hasModifier(ResourceLocation.parse("fractured_reality:grav_flux_changer")))) {
					if (entity instanceof LivingEntity _entity) {
						AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("fractured_reality:grav_flux_changer"), (0 - 1 / FracturedRealityModVariables.MapVariables.get(world).GravityFlux),
								AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
						if (!_entity.getAttribute(Attributes.GRAVITY).hasModifier(modifier.id())) {
							_entity.getAttribute(Attributes.GRAVITY).addPermanentModifier(modifier);
						}
					}
					if (entity instanceof LivingEntity _entity) {
						AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("fractured_reality:grav_flux_changer"), (0 - 1 / FracturedRealityModVariables.MapVariables.get(world).GravityFlux),
								AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
						if (!_entity.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).hasModifier(modifier.id())) {
							_entity.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).addPermanentModifier(modifier);
						}
					}
					if (entity instanceof Player) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:gravflux_start")), SoundSource.HOSTILE, (float) 0.25, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:gravflux_start")), SoundSource.HOSTILE, (float) 0.25, 1, false);
							}
						}
					}
				}
			} else {
				if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttribute(Attributes.GRAVITY).hasModifier(ResourceLocation.parse("fractured_reality:grav_flux_changer"))) {
					if (entity instanceof LivingEntity _entity) {
						_entity.getAttribute(Attributes.GRAVITY).removeModifier(ResourceLocation.parse("fractured_reality:grav_flux_changer"));
					}
					if (entity instanceof LivingEntity _entity) {
						_entity.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).removeModifier(ResourceLocation.parse("fractured_reality:grav_flux_changer"));
					}
					if (entity instanceof Player) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:gravflux_end")), SoundSource.HOSTILE, (float) 0.25, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:gravflux_end")), SoundSource.HOSTILE, (float) 0.25, 1, false);
							}
						}
					}
				}
			}
		}
	}
}