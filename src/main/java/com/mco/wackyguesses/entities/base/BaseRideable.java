package com.mco.wackyguesses.entities.base;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BaseRideable extends EntityLiving{

    public BaseRideable(World p_i1685_1_) {
        super(p_i1685_1_);
        this.setSize(1.4F, 1.6F);
        this.stepHeight = 2.0F;
        this.isImmuneToFire = true;
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    public boolean allowLeashing() {
        return false;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        Entity entity = source.getEntity();
        return this.riddenByEntity != null && this.riddenByEntity.equals(entity) ? false : super.attackEntityFrom(source, amount);
    }

    @Override
    public boolean canBePushed() {
        return this.riddenByEntity == null;
    }


    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    @Override
    protected void fall(float p_70069_1_) {
    }


    @Override
    public boolean getCanSpawnHere() {
        return false;
    }


    @Override
    protected String getDeathSound() {
        return null;

    }

    @Override
    protected String getHurtSound() {
        return null;
    }


    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0F);
    }

    @Override
    public boolean canBeSteered() {
        return true;
    }

    @Override
    protected float getSoundVolume() {
        return 0.8F;
    }


    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    @Override
    public boolean interact(EntityPlayer p_70085_1_) {
        if (this.riddenByEntity == null) {
                this.mount(p_70085_1_);
                return true;

        }
            return super.interact(p_70085_1_);



    }

    private void mount(EntityPlayer p_110237_1_) {
        p_110237_1_.rotationYaw = this.rotationYaw;
        p_110237_1_.rotationPitch = this.rotationPitch;

        if (!this.worldObj.isRemote) {
            p_110237_1_.mountEntity(this);
        }
    }


    /**
     * Dead and sleeping entities cannot move
     */
    @Override
    protected boolean isMovementBlocked() {
        return this.riddenByEntity != null;
    }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    @Override
    public void moveEntityWithHeading(float p_70612_1_, float p_70612_2_) {
        if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityLivingBase) {
            this.prevRotationYaw = this.rotationYaw = this.riddenByEntity.rotationYaw;
            this.rotationPitch = this.riddenByEntity.rotationPitch * 0.5F;
            this.setRotation(this.rotationYaw, this.rotationPitch);
            this.rotationYawHead = this.renderYawOffset = this.rotationYaw;
            p_70612_1_ = ((EntityLivingBase)this.riddenByEntity).moveStrafing * 0.5F;
            p_70612_2_ = ((EntityLivingBase)this.riddenByEntity).moveForward;

            if (p_70612_2_ <= 0.0F) {
                p_70612_2_ *= 0.25F;
            }

            /**  if (this.onGround && this.jumpPower == 0.0F && this.isRearing() && !this.field_110294_bI) {
             p_70612_1_ = 0.0F;
             p_70612_2_ = 0.0F;
             }
             **/


            this.stepHeight = 1.0F;
            this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;

            if (!this.worldObj.isRemote) {
                this.setAIMoveSpeed((float)this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue());
                super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
            }


            this.prevLimbSwingAmount = this.limbSwingAmount;
            double d1 = this.posX - this.prevPosX;
            double d0 = this.posZ - this.prevPosZ;
            float f4 = MathHelper.sqrt_double(d1 * d1 + d0 * d0) * 4.0F;

            if (f4 > 1.0F) {
                f4 = 1.0F;
            }

            this.limbSwingAmount += (f4 - this.limbSwingAmount) * 0.4F;
            this.limbSwing += this.limbSwingAmount;
        } else {
            this.stepHeight = 0.5F;
            this.jumpMovementFactor = 0.02F;
            super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
        }
    }


    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    /**
     * returns true if this entity is by a ladder, false otherwise
     */
    @Override
    public boolean isOnLadder() {
        return false;
    }


}