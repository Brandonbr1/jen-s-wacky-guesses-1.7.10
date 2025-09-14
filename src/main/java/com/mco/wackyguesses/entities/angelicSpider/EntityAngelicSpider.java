package com.mco.wackyguesses.entities.angelicSpider;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.world.World;

public class EntityAngelicSpider extends EntitySpider
{

    public EntityAngelicSpider(World p_i1743_1_) {
        super(p_i1743_1_);
        this.setSize(1.4F, 0.9F);
        this.tasks.addTask(0, new EntityAILeapAtTarget(this, .8F));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(24.0D);
    }

    @Override
    public void onLivingUpdate() {

        if (!this.onGround && this.motionY < 0.0D)
        {
            // the flying effect is too hard to see at original value.
            this.motionY *= 0.65D;
        }

        super.onLivingUpdate();
    }



    @Override
    public void fall(float distance)
    {

    }

}
