package com.mco.wackyguesses.entities.cloud.ai;

import com.mco.wackyguesses.entities.cloud.EntityCloud;
import com.mco.wackyguesses.source.WackyDamages;
import com.mco.wackyguesses.util.WackySounds;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationAI;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class AIStand extends AnimationAI<EntityCloud>{
    protected Animation animation;
    protected EntityLivingBase attackTarget;
    protected EntityCloud cloud;

    public AIStand(EntityCloud entity, Animation animation) {
        super(entity);
        this.setMutexBits(8);
        this.cloud = entity;
        this.animation = animation;
        this.attackTarget = null;
    }

    @Override
    public Animation getAnimation() {
        return this.animation;
    }

    @Override
    public boolean isAutomatic() {
        return true;
    }

    @Override
    public void startExecuting() {
        super.startExecuting();
        this.cloud.currentAnim = this;
        this.attackTarget = this.cloud.getAttackTarget();
    }

    @Override
    public void updateTask() {
        super.updateTask();
        if (this.cloud.getAnimationTick() == 1) {
            // TODO: ADD SOUNDS
            //  this.cloud.playSound(WackySounds.SCREECH, 1.0F, 1.5F);
        }

        if (this.attackTarget != null && this.shouldAttack()) {
            this.cloud.teleportTo(this.attackTarget.posX, this.attackTarget.posY, this.attackTarget.posZ);
            this.attackTarget.hurtResistantTime = 7;
            this.attackTarget.attackEntityFrom(WackyDamages.CLAW, 3.0F);
        }

    }

    private boolean shouldAttack() {
        int tick = this.cloud.getAnimationTick();
        double distance = this.cloud.getDistanceToEntity(this.attackTarget);
        return (tick == 19 || tick == 22 || tick == 25 || tick == 28 || tick == 31 || tick == 34) && distance <= 5.0D;
    }

    @Override
    public void resetTask() {
        super.resetTask();
        this.cloud.currentAnim = null;
    }

}
