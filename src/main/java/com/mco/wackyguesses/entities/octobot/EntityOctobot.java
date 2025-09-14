package com.mco.wackyguesses.entities.octobot;

import java.util.List;
import java.util.Random;

import com.mco.wackyguesses.source.WackyDamages;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

public class EntityOctobot extends EntityMob
{
    private boolean shouldRenderLasers = false;
    private int chargeTicks;
    private int chargeBonus;
    private boolean shouldRandomize = true;

    public EntityOctobot(World p_i1738_1_) {
        super(p_i1738_1_);
        this.setSize(2F, 3F);
        this.experienceValue = 50;
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32F));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(.2);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(75);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.getAttackTarget() == null)
        {
            List<EntityPlayer> list = this.worldObj.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D,32.0D,32.0D));
            for (EntityPlayer entity : list)
            {
                if (entity != null)
                {
                    this.setAttackTarget(entity);
                }
            }
        }

        if(this.ticksExisted % 50 == 0 && this.shouldRandomize)
        {
            Random random = new Random();
            this.chargeBonus = random.nextInt(50);
            this.shouldRandomize = false;
        }

        if (this.getAttackTarget() != null && (this.getAttackTarget() instanceof EntityPlayerSP || this.getAttackTarget() instanceof EntityPlayerMP))
        {
            this.chargeTicks++;
            if(this.getAttackTarget() instanceof EntityPlayer)
            {
                if(this.chargeTicks > 10 && this.chargeTicks < 101)
                {
                    if(this.chargeTicks == 11)
                    {
                        // TODO: PLAY SOUND
                        //   this.playSound(WackySoundHandler.LASER, 1F, 1F);
                    }

                    if(this.chargeTicks == 55)
                    {
                        this.getAttackTarget().attackEntityFrom(WackyDamages.octobot, 10 + (this.chargeBonus/10));
                        this.shouldRenderLasers = true;
                    }
                }
            }

            if(this.chargeTicks > 56)
            {
                this.shouldRenderLasers = false;
            }

            if(this.chargeTicks > 101)
            {
                this.chargeTicks = 0;
            }
        }
    }


    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    public boolean shouldRenderLasers()
    {
        return this.shouldRenderLasers;
    }

    @Override
    public float getEyeHeight()
    {
        return 1.25F;
    }


}
