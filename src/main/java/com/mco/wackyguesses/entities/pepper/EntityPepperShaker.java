package com.mco.wackyguesses.entities.pepper;

import com.mco.wackyguesses.entities.pepper.proj.EntityPepper;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityPepperShaker extends EntityMob
{

    public EntityPepperShaker(World world)
    {
        super(world);
        this.setSize(1.25F, 2.3F);
        this.experienceValue = 25;
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false    ));
    }

    @Override
    protected boolean isAIEnabled() {
        return false;
    }

    @Override
    public int getTotalArmorValue() {
        return 12;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0D);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.ticksExisted % 10 == 0 && this.getAttackTarget() != null)
        {
            this.shootPepper(this.getAttackTarget());
            this.shootPepper(this.getAttackTarget());
            this.shootPepper(this.getAttackTarget());
        }

    }

    public void shootPepper(EntityLivingBase target) {
        if (target == null)
            return;
        EntityPepper entityPepper = new EntityPepper(this.worldObj, this);
        double d0 = target.posY + target.getEyeHeight() - 1.100000023841858D;
        double d1 = target.posX - this.posX;
        double d2 = d0 - entityPepper.posY;
        double d3 = target.posZ - this.posZ;
        float f = MathHelper.sqrt_double(d1 * d1 + d3 * d3) * 0.2F;
        entityPepper.setThrowableHeading(d1, d2 + f, d3, 1.6F, 6.0F);
        //TODO PLAY SOUND
        //   this.playSound(WackySoundHandler.PEPPER, 5.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entityPepper);
    }



}
