package net.starseer.fracturedreality.entity;

import net.starseer.fracturedreality.procedures.*;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

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
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;

import javax.annotation.Nullable;

public class StarseerEntity extends Monster {
	public static final EntityDataAccessor<String> DATA_CurrentAttack = SynchedEntityData.defineId(StarseerEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_SwitchAttackCooldown = SynchedEntityData.defineId(StarseerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_AttackTimer = SynchedEntityData.defineId(StarseerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_GroundTickAgo = SynchedEntityData.defineId(StarseerEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Boolean> DATA_DoingMonologue = SynchedEntityData.defineId(StarseerEntity.class, EntityDataSerializers.BOOLEAN);
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();
	public final AnimationState animationState3 = new AnimationState();
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.PURPLE, ServerBossEvent.BossBarOverlay.PROGRESS);

	public StarseerEntity(EntityType<StarseerEntity> type, Level world) {
		super(type, world);
		xpReward = 32000;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_CurrentAttack, "None");
		builder.define(DATA_SwitchAttackCooldown, 0);
		builder.define(DATA_AttackTimer, 0);
		builder.define(DATA_GroundTickAgo, 0);
		builder.define(DATA_DoingMonologue, true);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
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
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1) {
			@Override
			public boolean canUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canContinueToUse() && StarseerNotMonologueProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(6, new FloatGoal(this) {
			@Override
			public boolean canUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
				return super.canUse() && StarseerNotMonologueProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = StarseerEntity.this.getX();
				double y = StarseerEntity.this.getY();
				double z = StarseerEntity.this.getZ();
				Entity entity = StarseerEntity.this;
				Level world = StarseerEntity.this.level();
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
	public void die(DamageSource source) {
		super.die(source);
		StarseerEntityDiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
		StarseerOnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putString("DataCurrentAttack", this.entityData.get(DATA_CurrentAttack));
		compound.putInt("DataSwitchAttackCooldown", this.entityData.get(DATA_SwitchAttackCooldown));
		compound.putInt("DataAttackTimer", this.entityData.get(DATA_AttackTimer));
		compound.putInt("DataGroundTickAgo", this.entityData.get(DATA_GroundTickAgo));
		compound.putBoolean("DataDoingMonologue", this.entityData.get(DATA_DoingMonologue));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataCurrentAttack"))
			this.entityData.set(DATA_CurrentAttack, compound.getString("DataCurrentAttack"));
		if (compound.contains("DataSwitchAttackCooldown"))
			this.entityData.set(DATA_SwitchAttackCooldown, compound.getInt("DataSwitchAttackCooldown"));
		if (compound.contains("DataAttackTimer"))
			this.entityData.set(DATA_AttackTimer, compound.getInt("DataAttackTimer"));
		if (compound.contains("DataGroundTickAgo"))
			this.entityData.set(DATA_GroundTickAgo, compound.getInt("DataGroundTickAgo"));
		if (compound.contains("DataDoingMonologue"))
			this.entityData.set(DATA_DoingMonologue, compound.getBoolean("DataDoingMonologue"));
	}

	@Override
	public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
		super.awardKillScore(entity, score, damageSource);
		StarseerThisEntityKillsAnotherOneProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
			this.animationState2.animateWhen(MoonBreakerAttackingCheckProcedure.execute(this), this.tickCount);
			this.animationState3.animateWhen(StarseerSmashCondProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		StarseerOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 1000);
		builder = builder.add(Attributes.ARMOR, 5);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 10);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5);
		return builder;
	}
}