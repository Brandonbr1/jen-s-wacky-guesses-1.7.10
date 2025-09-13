package com.mco.wackyguesses.entities.floatBeeGunner.bee;

import java.util.List;

import com.mco.wackyguesses.util.BasicAgressiveAttackingEntity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityBee extends BasicAgressiveAttackingEntity
{

    public EntityBee(World p_i1738_1_) {
        super(p_i1738_1_);
        this.setSize(.7F, 2F);
        this.experienceValue = 20;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.5D);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        if (super.attackEntityAsMob(entityIn))
        {
            if (entityIn instanceof EntityLivingBase)
            {
                int i = 0;

                if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL)
                {
                    i = 10;
                }
                else if (this.worldObj.difficultySetting == EnumDifficulty.HARD)
                {
                    i = 15;
                }

                if (i > 0)
                {
                    ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(Potion.poison.id, i * 20, 0));
                }
            }

            return true;
        } else
            return false;
    }

    @Override
    public void onLivingUpdate()
    {
        if(this.getAttackTarget()==null)
        {
            List<EntityPlayer> list = this.worldObj.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D,32.0D,32.0D));
            for(EntityPlayer entity : list)
            {
                if(entity!=null) {
                    this.setAttackTarget(entity);
                }
            }
        }
        // TODO: ADD SOUNDS
        //   if(this.ticksExisted % 10 == 0)
        //     this.playSound(WackySoundHandler.BUZZ, .4F, 1F);

        super.onLivingUpdate();
    }


    @Override
    protected void fall(float p_70069_1_)
    {

    }

}
