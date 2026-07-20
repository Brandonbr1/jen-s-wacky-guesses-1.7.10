package com.mco.wackyguesses.entities.cloud.ai;

import com.mco.wackyguesses.entities.cloud.EntityCloud;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationAI;
import net.minecraft.entity.EntityLivingBase;

public class AIHover extends AnimationAI<EntityCloud> {
    protected Animation animation;
    protected EntityLivingBase attackTarget;
    protected EntityCloud cloud;

    public AIHover(EntityCloud cloud, Animation animation) {
        super(cloud);
    }


    @Override
    public Animation getAnimation() {
        return null;
    }
}
