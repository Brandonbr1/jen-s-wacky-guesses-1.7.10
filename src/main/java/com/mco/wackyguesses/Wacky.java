package com.mco.wackyguesses;

import com.mco.wackyguesses.entities.angelicSpider.EntityAngelicSpider;
import com.mco.wackyguesses.entities.bananaBoss.EntityBanana;
import com.mco.wackyguesses.entities.bananaBoss.bananaSmall.EntityBananaMinion;
import com.mco.wackyguesses.entities.bananaBoss.bananaThrowable.EntityBananaThrowable;
import com.mco.wackyguesses.entities.bananamobile.EntityBananamobile;
import com.mco.wackyguesses.entities.chocolate.box.EntityChocoBox;
import com.mco.wackyguesses.entities.chocolate.rectangle.EntityRectangularChoco;
import com.mco.wackyguesses.entities.chocolate.sphere.EntitySphericalChoco;
import com.mco.wackyguesses.entities.cloud.EntityCloud;
import com.mco.wackyguesses.entities.dorito.EntityDorito;
import com.mco.wackyguesses.entities.dorito.doritoThrowable.EntityDoritoThrowable;
import com.mco.wackyguesses.entities.egg.EntityEgg;
import com.mco.wackyguesses.entities.explodaCow.EntityExplodaCow;
import com.mco.wackyguesses.entities.fettucine.box.EntityBoxOfNoodles;
import com.mco.wackyguesses.entities.fettucine.noodle.EntityFettuccineNoodle;
import com.mco.wackyguesses.entities.fettucine.projectile.EntityNoodleProjectile;
import com.mco.wackyguesses.entities.floatBeeGunner.EntityFloatBeeGunner;
import com.mco.wackyguesses.entities.floatBeeGunner.bee.EntityBee;
import com.mco.wackyguesses.entities.floatBeeGunner.bullet.EntityBullet;
import com.mco.wackyguesses.entities.ironPapa.EntityIronPapa;
import com.mco.wackyguesses.entities.jupiter.EntityJupiter;
import com.mco.wackyguesses.entities.jupiter.asteroid.EntityAsteroid;
import com.mco.wackyguesses.entities.octobot.EntityOctobot;
import com.mco.wackyguesses.entities.patHead.EntityPatHead;
import com.mco.wackyguesses.entities.pepper.EntityPepperShaker;
import com.mco.wackyguesses.entities.pepper.proj.EntityPepper;
import com.mco.wackyguesses.entities.skeleGoose.EntityGoose;
import com.mco.wackyguesses.entities.sunUrchin.EntitySunUrchin;
import com.mco.wackyguesses.entities.sunUrchin.projectile.EntitySunSpike;
import com.mco.wackyguesses.entities.wheelbarrow.EntityWheelbarrow;
import com.mco.wackyguesses.entities.zombieJar.EntityZombieJar;
import com.mco.wackyguesses.handlers.Config;
import com.mco.wackyguesses.item.ItemBananaKey;
import com.mco.wackyguesses.item.ItemBananaMobile;
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
    public static Item itemPepper;
    public static Item itemEgg;
    public static Item bananaKey;
    public static Item bananaMobile;

    public static Item rectChoc;
    public static Item sphericalChoc;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Config.load(event);
        monsterSpawner = new WackyItemMonsterPlacer();

        itemDorito = new ItemFood(1, 1, false).setCreativeTab(wackyTab).setUnlocalizedName("item_dorito").setTextureName(Wacky.MODID_PREFIX + "item_dorito");
        itemBanana = new ItemFood(4, 4, false).setUnlocalizedName("item_banana").setCreativeTab(wackyTab).setTextureName(Wacky.MODID_PREFIX + "item_banana");
        itemEgg = new ItemFood(6, 4, false).setUnlocalizedName("item_egg").setCreativeTab(wackyTab).setTextureName(Wacky.MODID_PREFIX + "item_egg");
        itemBullet = new Item().setUnlocalizedName("item_bullet").setCreativeTab(wackyTab).setTextureName(Wacky.MODID_PREFIX + "item_bullet");
        itemPepper = new Item().setUnlocalizedName("item_pepper").setCreativeTab(wackyTab).setTextureName(Wacky.MODID_PREFIX + "item_pepper");
        bananaKey = new ItemBananaKey().setUnlocalizedName("item_banana_key").setCreativeTab(wackyTab).setTextureName(Wacky.MODID_PREFIX + "item_banana_key");
        bananaMobile = new ItemBananaMobile().setUnlocalizedName("item_bananamobile").setCreativeTab(wackyTab).setTextureName(Wacky.MODID_PREFIX + "item_bananamobile");
        rectChoc = new ItemFood(2, 1, false).setUnlocalizedName("item_rectangular_chocolate").setCreativeTab(wackyTab).setTextureName(Wacky.MODID_PREFIX + "item_rectangular_chocolate");
        sphericalChoc = new ItemFood(2, 1, false).setUnlocalizedName("item_spherical_chocolate").setCreativeTab(wackyTab).setTextureName(Wacky.MODID_PREFIX + "item_spherical_chocolate");


        addItemName(monsterSpawner, "Spawn");
        addItemName(itemDorito, "Dorito");
        addItemName(itemBanana, "Banana");
        addItemName(itemBullet, "Bullet");
        addItemName(itemEgg, "Egg");
        addItemName(itemPepper, "Pepper");
        addItemName(bananaKey, "Banana Key");
        addItemName(bananaMobile, "Banana Mobile");
        addItemName(rectChoc, "Rectangular Chocolate");
        addItemName(sphericalChoc, "Spherical Chocolate");

        addMob(EntityPatHead.class, true, "Pat's Head", 16724480, 16738816, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityEgg.class, true, "Egg", 16772608, 16777215, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityIronPapa.class, true, "Iron Papa", 0, 14, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityDorito.class, true, "Mr. Senor Dorito", 16724480, 16738816, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityBananamobile.class, false, "Banana Mobile", 0xffee00, 0xffffff, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityFloatBeeGunner.class, true, "Float Bee Gunner", 16772608, 0, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityBee.class, true, "Bee", 0, 16772608, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntitySphericalChoco.class, true, "Spherical Chocolate", 14858496, 1840897, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityRectangularChoco.class, true, "Rectangular Chocolate", 14858496, 1840897, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityChocoBox.class, true, "Chocolate Boss", 14858496, 1840897, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityBanana.class, true, "Banana Boss", 16776960, 3153939, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        addMob(EntityBananaMinion.class, true, "Banana Minion", 3153939, 16776960, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityAngelicSpider.class, true, "Angelic Spider", 16774535, 16776685, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityExplodaCow.class, true, "Exploda Cow", 8381573, 935697, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityOctobot.class, true, "OctoBot", 11909308, 1464237, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityZombieJar.class, true, "Zombie Jar", 3156082, 6000962, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityWheelbarrow.class, true, "Wheel Barrow", 8355711, 5848361, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityGoose.class, true, "Skele Goose", 4733494, 8421504, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntitySunUrchin.class, true, "Sun Urchin", 16711680, 16760576, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityJupiter.class, true, "Jupiter", 11300128, 16445144, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityFettuccineNoodle.class, true, "Feettuccine Noodle", 16768256, 16774317, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityBoxOfNoodles.class, true, "Box of Noddles", 3327, 16768256, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityPepperShaker.class, true, "Pepper", 14737632, 5855577, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);

        this.addMob(EntityCloud.class, true, "Cloud", 16777215, 10724259, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.plains);


        this.addNonLivingMob(EntityDoritoThrowable.class, "Dorito");
        this.addNonLivingMob(EntityBullet.class, "Bullet");
        this.addNonLivingMob(EntityBananaThrowable.class, "Banana");
        this.addNonLivingMob(EntitySunSpike.class, "Sun Spike");
        this.addNonLivingMob(EntityAsteroid.class, "Asteroid");
        this.addNonLivingMob(EntityNoodleProjectile.class, "Noodle Projectile");
        this.addNonLivingMob(EntityPepper.class, "Pepper Projectile");

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
   //     EntityRegistry.addSpawn(entityClass, weightedProb, min, max, typeOfCreature, biomes);
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
