package com.mco.wackyguesses.entities.cloud.ai;

import com.mco.wackyguesses.entities.cloud.EntityCloud;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationAI;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;

public class AIHover extends AnimationAI<EntityCloud>{
    protected Animation animation;
    protected EntityLivingBase attackTarget;
    protected EntityCloud cloud;

    public AIHover(EntityCloud cloud, Animation animation) {
        super(cloud);
        this.setMutexBits(8);
        this.cloud = cloud;
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
            // TODO: ADD SOUND
            //  this.cloud.playSound(WackySoundHandler.CHARGE, 1.0F, 0.5F);
        }

        if (this.cloud.getAnimationTick() > 33 && this.attackTarget != null && this.cloud.getAnimationTick() % 2 == 0) {
            EntityLightningBolt lightning = new EntityLightningBolt(this.cloud.worldObj, this.attackTarget.posX, this.attackTarget.posY, this.attackTarget.posZ);
            this.cloud.worldObj.addWeatherEffect(lightning);
        }

    }

    @Override
    public void resetTask() {
        super.resetTask();
        this.cloud.currentAnim = null;
    }

}
