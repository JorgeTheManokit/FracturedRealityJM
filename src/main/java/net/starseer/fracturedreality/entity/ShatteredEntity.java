package net.starseer.fracturedreality.entity;

import net.starseer.fracturedreality.procedures.StarseerNotMonologueProcedure;
import net.starseer.fracturedreality.procedures.StarseerEntityIsHurtProcedure;
import net.starseer.fracturedreality.procedures.ShatteredSpawnEnablerProcedure;
import net.starseer.fracturedreality.procedures.ShatteredOnInitialEntitySpawnProcedure;
import net.starseer.fracturedreality.init.FracturedRealityModEntities;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;

import javax.annotation.Nullable;

public class ShatteredEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_Variant = SynchedEntityData.defineId(ShatteredEntity.class, EntityDataSerializers.INT);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();

	public ShatteredEntity(EntityType<ShatteredEntity> type, Level world) {
		super(type, world);
		xpReward = 1000;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_Variant, 3);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}

			@Override
			public boolean canUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(6, new FloatGoal(this) {
			@Override
			public boolean canUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ShatteredEntity.this.getX();
				double y = ShatteredEntity.this.getY();
				double z = ShatteredEntity.this.getZ();
				Entity entity = ShatteredEntity.this;
				Level world = ShatteredEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}
		});
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		StarseerEntityIsHurtProcedure.execute(world, damagesource, entity);
		if (damagesource.getDirectEntity() instanceof ThrownPotion || damagesource.getDirectEntity() instanceof AreaEffectCloud || damagesource.typeHolder().is(NeoForgeMod.POISON_DAMAGE))
			return false;
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		if (damagesource.is(DamageTypes.DRAGON_BREATH))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion(Explosion explosion) {
		return true;
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		ShatteredOnInitialEntitySpawnProcedure.execute(world, this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("DataVariant", this.entityData.get(DATA_Variant));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataVariant"))
			this.entityData.set(DATA_Variant, compound.getInt("DataVariant"));
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
			this.animationState2.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public boolean canDrownInFluidType(FluidType type) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	@Override
	public boolean isPushedByFluid() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(FracturedRealityModEntities.SHATTERED.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return ShatteredSpawnEnablerProcedure.execute(world);
		}, RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 100);
		builder = builder.add(Attributes.ARMOR, 5);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 10);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5);
		return builder;
	}
}