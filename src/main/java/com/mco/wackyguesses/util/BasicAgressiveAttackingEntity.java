package com.mco.wackyguesses.util;

import java.util.List;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BasicAgressiveAttackingEntity extends EntityMob
{

    public BasicAgressiveAttackingEntity(World p_i1738_1_) {
        super(p_i1738_1_);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if(this.getAttackTarget()==null)
        {
            List<EntityPlayer> list = this.worldObj.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D, 32.0D,32.0D));
            for(EntityPlayer entity : list)
            {
                if(entity!=null && !entity.capabilities.isCreativeMode) {
                    this.setAttackTarget(entity);
                }
            }
        }

    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    protected void fall(float p_70069_1_) {
        super.fall(p_70069_1_);
    }


}
