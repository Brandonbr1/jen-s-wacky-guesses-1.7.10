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


}
