package com.mco.wackyguesses.item;

import com.mco.wackyguesses.Wacky;
import com.mco.wackyguesses.entities.floatBeeGunner.bullet.EntityBullet;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFloatBeeGunnerGun extends Item {

    public ItemFloatBeeGunnerGun()
    {
        this.maxStackSize = 1;
        this.setMaxDamage(384);
    }


    @Override
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer entityplayer)
    {

         int j = 5;

        if (entityplayer.inventory.hasItem(Wacky.itemBullet))
        {
            float f = (float)j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;


            for (int i = 0; i < 7; i++) {
                EntityBullet bullet = new EntityBullet(world, entityplayer);

                if (i < 4) {
                    bullet.posX += 0.5;
                    bullet.posZ += 0.5;
                }

                if (i > 4) {
                    bullet.posX -= 0.5;
                    bullet.posZ -= 0.5;
                }

                world.playSoundAtEntity(entityplayer, "wackyguesses:entity.float_bee_gunner.fire", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                if (i == 6) {
                    entityplayer.inventory.consumeInventoryItem(Items.arrow);

                }
                if (!world.isRemote)
                {
                    world.spawnEntityInWorld(bullet);
                }
            }


        }
        return stack;
    }

    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 5;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer player)
    {
        if (player.capabilities.isCreativeMode || player.inventory.hasItem(Items.arrow))
        {
            player.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
        }

        return itemStackIn;
    }


    @Override
    public int getItemEnchantability()
    {
        return -1;
    }

}
