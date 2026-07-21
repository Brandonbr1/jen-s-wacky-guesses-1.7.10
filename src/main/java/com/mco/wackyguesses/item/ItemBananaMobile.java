package com.mco.wackyguesses.item;

import com.mco.wackyguesses.entities.bananaBoss.EntityBanana;
import com.mco.wackyguesses.entities.bananaBoss.bananaSmall.EntityBananaMinion;
import com.mco.wackyguesses.entities.bananamobile.EntityBananamobile;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemBananaMobile extends Item {


    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float subX, float subY, float subZ) {

        if (!world.isRemote) {
        EntityBananamobile mobile = new EntityBananamobile(world);

        mobile.setLocationAndAngles(x + 1, y + 1, z + 1, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
        mobile.rotationYawHead = mobile.rotationYaw;
        mobile.renderYawOffset = mobile.rotationYaw;
        world.spawnEntityInWorld(mobile);

            if (!player.capabilities.isCreativeMode) {
                --itemStack.stackSize;
            }


        return true;
        }

        return true;
    }
}
