package com.mco.wackyguesses.entities.cloud.ai;

import com.mco.wackyguesses.entities.cloud.EntityCloud;
import com.mco.wackyguesses.source.WackyDamages;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationAI;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class AIPoof extends AnimationAI<EntityCloud>{
    protected Animation animation;
    protected EntityLivingBase attackTarget;
    protected EntityCloud cloud;

    public AIPoof(EntityCloud entity, Animation animation) {
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
        int tick = this.cloud.getAnimationTick();
        if (this.attackTarget != null && tick == 1 && this.cloud.getDistanceToEntity(this.attackTarget) < 3.0F) {
            this.attackTarget.attackEntityFrom(WackyDamages.POOF, 6.0F);
            this.attackTarget.knockBack(this.attackTarget, 0.5F, MathHelper.sin(this.cloud.rotationYaw * 0.017453292F), (-MathHelper.cos(this.cloud.rotationYaw * 0.017453292F)));
        }

    }

    @Override
    public void resetTask() {
        super.resetTask();
        this.cloud.currentAnim = null;
    }

}
