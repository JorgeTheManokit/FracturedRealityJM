/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starseer.fracturedreality.init;

import net.starseer.fracturedreality.entity.*;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class FracturedRealityModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, FracturedRealityMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<PresenterEntity>> PRESENTER = register("presenter",
			EntityType.Builder.<PresenterEntity>of(PresenterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.8f, 2.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeamSummonerEntity>> BEAM_SUMMONER = register("beam_summoner",
			EntityType.Builder.<BeamSummonerEntity>of(BeamSummonerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(1.8f, 3.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<SummonedProjectileBeamerEntity>> SUMMONED_PROJECTILE_BEAMER = register("summoned_projectile_beamer",
			EntityType.Builder.<SummonedProjectileBeamerEntity>of(SummonedProjectileBeamerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LightBeamEntity>> LIGHT_BEAM = register("light_beam",
			EntityType.Builder.<LightBeamEntity>of(LightBeamEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<FacelessEntity>> FACELESS = register("faceless",
			EntityType.Builder.<FacelessEntity>of(FacelessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)

					.sized(0.9f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MoonBreakerEntity>> MOON_BREAKER = register("moon_breaker",
			EntityType.Builder.<MoonBreakerEntity>of(MoonBreakerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3)

					.sized(1.9f, 6f));
	public static final DeferredHolder<EntityType<?>, EntityType<VoidMissileEntity>> VOID_MISSILE = register("void_missile",
			EntityType.Builder.<VoidMissileEntity>of(VoidMissileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<StarseerEntity>> STARSEER = register("starseer",
			EntityType.Builder.<StarseerEntity>of(StarseerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.5f, 6.25f));
	public static final DeferredHolder<EntityType<?>, EntityType<StarArmEntity>> STAR_ARM = register("star_arm",
			EntityType.Builder.<StarArmEntity>of(StarArmEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LightningStrikerEntity>> LIGHTNING_STRIKER = register("lightning_striker",
			EntityType.Builder.<LightningStrikerEntity>of(LightningStrikerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1f, 0.05f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnforcerEntity>> ENFORCER = register("enforcer",
			EntityType.Builder.<EnforcerEntity>of(EnforcerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).fireImmune()

					.sized(0.8f, 2.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShatteredEntity>> SHATTERED = register("shattered",
			EntityType.Builder.<ShatteredEntity>of(ShatteredEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2.5f, 6f));
	public static final DeferredHolder<EntityType<?>, EntityType<TruthseekerEntity>> TRUTHSEEKER = register("truthseeker",
			EntityType.Builder.<TruthseekerEntity>of(TruthseekerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1.9f, 6f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		PresenterEntity.init(event);
		BeamSummonerEntity.init(event);
		SummonedProjectileBeamerEntity.init(event);
		FacelessEntity.init(event);
		MoonBreakerEntity.init(event);
		StarseerEntity.init(event);
		StarArmEntity.init(event);
		LightningStrikerEntity.init(event);
		EnforcerEntity.init(event);
		ShatteredEntity.init(event);
		TruthseekerEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PRESENTER.get(), PresenterEntity.createAttributes().build());
		event.put(BEAM_SUMMONER.get(), BeamSummonerEntity.createAttributes().build());
		event.put(SUMMONED_PROJECTILE_BEAMER.get(), SummonedProjectileBeamerEntity.createAttributes().build());
		event.put(FACELESS.get(), FacelessEntity.createAttributes().build());
		event.put(MOON_BREAKER.get(), MoonBreakerEntity.createAttributes().build());
		event.put(STARSEER.get(), StarseerEntity.createAttributes().build());
		event.put(STAR_ARM.get(), StarArmEntity.createAttributes().build());
		event.put(LIGHTNING_STRIKER.get(), LightningStrikerEntity.createAttributes().build());
		event.put(ENFORCER.get(), EnforcerEntity.createAttributes().build());
		event.put(SHATTERED.get(), ShatteredEntity.createAttributes().build());
		event.put(TRUTHSEEKER.get(), TruthseekerEntity.createAttributes().build());
	}
}