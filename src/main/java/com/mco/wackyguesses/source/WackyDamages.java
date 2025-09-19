package com.mco.wackyguesses.source;

import net.minecraft.util.DamageSource;

public class WackyDamages extends DamageSource
{

    public WackyDamages(String name)
    {
        super(name);
    }

    public static DamageSource dorito  = (new WackyDamages("dorito"));
    public static DamageSource bullet  = (new WackyDamages("bullet"));
    public static DamageSource banana  = (new WackyDamages("banana"));
    public static DamageSource octobot  = (new WackyDamages("octo"));
    public static DamageSource WBARROW = (new WackyDamages("wheelBarrow"));
    public static DamageSource URCHIN = (new WackyDamages("urchin"));
    public static DamageSource SPIKE = (new WackyDamages("spike"));
    public static DamageSource ASTEROID = (new WackyDamages("asteroid"));
    public static DamageSource NOODLE = (new WackyDamages("noodle"));
    public static DamageSource PEPPER = (new WackyDamages("pepper"));
    public static DamageSource POOF = (new WackyDamages("poof"));
    public static DamageSource CLAW =  (new WackyDamages("claw"));


}
