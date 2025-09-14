package com.mco.wackyguesses;

import com.mco.wackyguesses.entities.angelicSpider.EntityAngelicSpider;
import com.mco.wackyguesses.entities.bananaBoss.EntityBanana;
import com.mco.wackyguesses.entities.bananaBoss.bananaSmall.EntityBananaMinion;
import com.mco.wackyguesses.entities.bananaBoss.bananaThrowable.EntityBananaThrowable;
import com.mco.wackyguesses.entities.bananamobile.EntityBananamobile;
import com.mco.wackyguesses.entities.chocolate.box.EntityChocoBox;
import com.mco.wackyguesses.entities.chocolate.rectangle.EntityRectangularChoco;
import com.mco.wackyguesses.entities.chocolate.sphere.EntitySphericalChoco;
import com.mco.wackyguesses.entities.dorito.EntityDorito;
import com.mco.wackyguesses.entities.dorito.doritoThrowable.EntityDoritoThrowable;
import com.mco.wackyguesses.entities.egg.EntityEgg;
import com.mco.wackyguesses.entities.explodaCow.EntityExplodaCow;
import com.mco.wackyguesses.entities.floatBeeGunner.EntityFloatBeeGunner;
import com.mco.wackyguesses.entities.floatBeeGunner.bee.EntityBee;
import com.mco.wackyguesses.entities.floatBeeGunner.bullet.EntityBullet;
import com.mco.wackyguesses.entities.ironPapa.EntityIronPapa;
import com.mco.wackyguesses.entities.octobot.EntityOctobot;
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
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.world.biome.BiomeGenBase;

@Mod(modid = Wacky.MODID, version = Wacky.VERSION, name = Wacky.NAME)
public class Wacky {

    public static final String MODID = "wackyguesses";
    public static final String MODID_PREFIX = "wackyguesses:";
    public static final String NAME = "Jen's Wacky Guesses";
    public static final String VERSION = "@VERSION@";

    @SidedProxy(clientSide = "com.mco.wackyguesses.proxy.ClientProxy", serverSide = "com.mco.wackyguesses.proxy.CommonProxy")
    public static CommonProxy proxy;
    private int id = 1;

    public static Item monsterSpawner;
    public static Item itemDorito;
    public static Item itemBanana;
    public static Item itemBullet;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Config.load(event);
        monsterSpawner = new WackyItemMonsterPlacer();

        itemDorito = new ItemFood(1, 1, false).setCreativeTab(wackyTab).setUnlocalizedName("item_dorito").setTextureName(Wacky.MODID_PREFIX + "item_dorito");
        itemBanana = new ItemFood(4, 4, false).setUnlocalizedName("item_banana").setCreativeTab(wackyTab).setTextureName(Wacky.MODID_PREFIX + "item_banana");
        itemBullet = new Item().setUnlocalizedName("item_bullet").setTextureName(Wacky.MODID_PREFIX + "item_bullet");

        this.addItemName(monsterSpawner, "Spawn");
        this.addItemName(itemDorito, "Dorito");
        this.addItemName(itemBanana, "Banana");
        this.addItemName(itemBullet, "Bullet");

        this.addMob(EntityPatHead.class, true, "Pat's Head", 0x03193d, 0x000000, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityEgg.class, true, "Egg", 0xffee00, 0xffffff, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityIronPapa.class, true, "Iron Papa", 0x00000, 0x00000e, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityDorito.class, true, "Mr. Señor Dorito", 0xff3200, 0xff6a00, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityBananamobile.class, true, "Banana Mobile", 0xffee00, 0xffffff, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityFloatBeeGunner.class, true, "Float Bee Gunner", 0xffee00, 0x000000, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityBee.class, true, "Bee", 0x000000, 0xffee00, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntitySphericalChoco.class, true, "Spherical Chocolate", 0x1a1501, 0xffffff, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityRectangularChoco.class, true, "Rectangular Chocolate", 0x1a1501, 0xffffff, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityChocoBox.class, true, "Chocolate Boss", 0xe2b900, 0x1c1701, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityBanana.class, true, "Banana Boss", 0xe2b900, 0x1c1701, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);
        this.addMob(EntityBananaMinion.class, true, "Banana Minion", 0xe2b900, 0x1c1701, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);


        this.addMob(EntityAngelicSpider.class, true, "Angelic Spider", 0xe2b900, 0x1c1701, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityExplodaCow.class, true, "Exploda Cow", 0xe2b900, 0x1c1701, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);


        this.addMob(EntityOctobot.class, true, "OctoBot(W.I.P)", 0xe2b900, 0x1c1701, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);


        this.addNonLivingMob(EntityDoritoThrowable.class, "Dorito");
        this.addNonLivingMob(EntityBullet.class, "Bullet");
        this.addNonLivingMob(EntityBananaThrowable.class, "Banana");

    }


    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }

    @SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
    private void addMob(Class entityClass, boolean withEgg, String entityName, int backgroundEggColour, int foregroundEggColour, int weightedProb, int min, int max, EnumCreatureType typeOfCreature, BiomeGenBase... biomes)
    {
        EntityRegistry.registerModEntity(entityClass, entityName, this.id ++, this, 128, 1, true);
        if (withEgg == true)
        {
            WackyList.addMapping(entityClass, entityName, this.id++, backgroundEggColour, foregroundEggColour);
        }
        EntityRegistry.addSpawn(entityClass, weightedProb, min, max, typeOfCreature, biomes);
        LanguageRegistry.instance().addStringLocalization("entity." + entityName + ".name", "en_US", entityName);
        LanguageRegistry.instance().addStringLocalization("entity." + "wackyguesses." + entityName + ".name", "en_US", entityName);

    }
    @SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
    private void addNonLivingMob(Class entityClass, String entityName)
    {
        EntityRegistry.registerModEntity(entityClass, entityName, this.id ++, this, 128, 1, true);
        LanguageRegistry.instance().addStringLocalization("entity." + entityName + ".name", "en_US", entityName);

    }

    @SuppressWarnings("deprecation")
    private void addItemName(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
        LanguageRegistry.addName(item, name);
    }


    public static CreativeTabs wackyTab = new CreativeTabs(Wacky.MODID + "wackyTab")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Wacky.itemBanana;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel() {
            return "Wacky Tab";
        }
    };

}
