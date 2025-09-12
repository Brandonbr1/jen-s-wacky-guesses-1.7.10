package com.mco.wackyguesses;

import com.mco.wackyguesses.entities.patHead.EntityPatHead;
import com.mco.wackyguesses.handlers.Config;
import com.mco.wackyguesses.item.WackyItemMonsterPlacer;
import com.mco.wackyguesses.item.WackyList;
import com.mco.wackyguesses.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;

@Mod(modid = Wacky.MODID, version = Wacky.VERSION, name = Wacky.NAME)
public class Wacky {

    public static final String MODID = "wackyguesses";
    public static final String NAME = "Jen's Wacky Guesses";
    public static final String VERSION = "@VERSION@";

    @SidedProxy(clientSide = "com.mco.wackyguesses.proxy.ClientProxy", serverSide = "com.mco.wackyguesses.proxy.CommonProxy")
    public static CommonProxy proxy;
    private int id = 1;

    public static Item monsterSpawner;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Config.load(event);
        monsterSpawner = new WackyItemMonsterPlacer();

        this.addItemName(monsterSpawner, "Spawn");

        this.addMob(EntityPatHead.class, "PatsHead", 0x03193d, 0x000000, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
    }


    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }

    @SuppressWarnings("deprecation")
    public void addMob(Class <? extends EntityLiving> entityClass, String entityName, int backgroundEggColour, int foregroundEggColour, int weightedProb, int min, int max, EnumCreatureType typeOfCreature, BiomeGenBase... biomes)
    {
        EntityRegistry.registerModEntity(entityClass, entityName, this.id ++, this, 128, 1, true);
        WackyList.addMapping(entityClass, entityName, this.id++, backgroundEggColour, foregroundEggColour);
        EntityRegistry.addSpawn(entityClass, weightedProb, min, max, typeOfCreature, biomes);
        LanguageRegistry.instance().addStringLocalization("entity." + entityName + ".name", "en_US", entityName);
    }

    @SuppressWarnings("deprecation")
    public void addItemName(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
        LanguageRegistry.addName(item, name);
    }


    public static CreativeTabs wackyTab = new CreativeTabs(Wacky.MODID + "wackyTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.baked_potato;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel() {
            return "Wacky Tab";
        }
    };
}
