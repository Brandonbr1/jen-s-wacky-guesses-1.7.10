package com.mco.wackyguesses.entities.base;

import java.util.List;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BasicAgressiveAttackingEntity extends EntityMob
{

    public BasicAgressiveAttackingEntity(World p_i1738_1_) {
        super(p_i1738_1_);
    }


    @Override
    public void onUpdate() {
        super.onUpdate();
        if(this.getAttackTarget()==null)
        {
            List<EntityPlayer> list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D, 32.0D,32.0D));

            for (int i = 0; i < list.size(); i++) {
                EntityPlayer entity = list.get(i);
                if(entity!=null) {
                    this.setAttackTarget(entity);
                }
            }
        }
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if(this.getAttackTarget()==null)
        {
            List<EntityPlayer> list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D, 32.0D,32.0D));

            for (int i = 0; i < list.size(); i++) {
                EntityPlayer entity = list.get(i);
                if(entity!=null) {
                    this.setAttackTarget(entity);
                }
            }
        }
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

}
