package com.mco.wackyguesses.entities.cloud.ai;

import com.mco.wackyguesses.entities.cloud.EntityCloud;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationAI;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;

public class AIHover extends AnimationAI<EntityCloud> {
    protected Animation animation;

    protected EntityLivingBase attackTarget;

    protected EntityCloud cloud;

    public AIHover(EntityCloud cloud, Animation animation) {
        super(cloud);
        setMutexBits(8);
        this.cloud = cloud;
        this.animation = animation;
        this.attackTarget = null;
    }

    public Animation getAnimation() {
        return this.animation;
    }

    public boolean isAutomatic() {
        return true;
    }

    public void startExecuting() {
        super.startExecuting();
        this.cloud.currentAnim = this;
        this.attackTarget = this.cloud.getAttackTarget();
    }

    public void updateTask() {
        super.updateTask();
        if (this.cloud.getAnimationTick() == 1)
            this.cloud.playSound("wackyguesses:entity.cloud.charge", 1.0F, 0.5F);
        if (this.cloud.getAnimationTick() > 33 && this.attackTarget != null && this.cloud.getAnimationTick() % 2 == 0) {
           // EntityLightningBolt lightning = new EntityLightningBolt(this.cloud.world, this.attackTarget.posX, this.attackTarget.posY, this.attackTarget.posZ, false);
           // this.cloud.world.addWeatherEffect((Entity)lightning);
            System.out.println("TEST");
        }
    }

    public void resetTask() {
        super.resetTask();
        this.cloud.currentAnim = null;
    }
}
