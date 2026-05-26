package net.starseer.fracturedreality.entity;

import net.starseer.fracturedreality.procedures.*;
import net.starseer.fracturedreality.init.FracturedRealityModEntities;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class FollowerEntity extends Monster {
	public final AnimationState animationState0 = new AnimationState();

	public FollowerEntity(EntityType<FollowerEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Player.class, (float) 6, 1.4, 1.2) {
			@Override
			public boolean canUse() {
				double x = FollowerEntity.this.getX();
				double y = FollowerEntity.this.getY();
				double z = FollowerEntity.this.getZ();
				Entity entity = FollowerEntity.this;
				Level world = FollowerEntity.this.level();
				return super.canUse() && IsDaytimeProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = FollowerEntity.this.getX();
				double y = FollowerEntity.this.getY();
				double z = FollowerEntity.this.getZ();
				Entity entity = FollowerEntity.this;
				Level world = FollowerEntity.this.level();
				return super.canContinueToUse() && IsDaytimeProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, (float) 64) {
			@Override
			public boolean canUse() {
				double x = FollowerEntity.this.getX();
				double y = FollowerEntity.this.getY();
				double z = FollowerEntity.this.getZ();
				Entity entity = FollowerEntity.this;
				Level world = FollowerEntity.this.level();
				return super.canUse() && IsDaytimeProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = FollowerEntity.this.getX();
				double y = FollowerEntity.this.getY();
				double z = FollowerEntity.this.getZ();
				Entity entity = FollowerEntity.this;
				Level world = FollowerEntity.this.level();
				return super.canContinueToUse() && IsDaytimeProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(3, new OpenDoorGoal(this, true));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, true, false) {
			@Override
			public boolean canUse() {
				double x = FollowerEntity.this.getX();
				double y = FollowerEntity.this.getY();
				double z = FollowerEntity.this.getZ();
				Entity entity = FollowerEntity.this;
				Level world = FollowerEntity.this.level();
				return super.canUse() && IsNighttimeProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = FollowerEntity.this.getX();
				double y = FollowerEntity.this.getY();
				double z = FollowerEntity.this.getZ();
				Entity entity = FollowerEntity.this;
				Level world = FollowerEntity.this.level();
				return super.canContinueToUse() && IsNighttimeProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(6, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(7, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(8, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));
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

		PresenterEntityIsHurtProcedure.execute(world, x, y, z);
		return super.hurt(damagesource, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		PresenterEntityDiesProcedure.execute(source.getDirectEntity());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		FollowerOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
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
		event.register(FracturedRealityModEntities.FOLLOWER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return FollowerSpawnEnablerProcedure.execute(world);
		}, RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.35);
		builder = builder.add(Attributes.MAX_HEALTH, 40);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.STEP_HEIGHT, 1);
		return builder;
	}
}