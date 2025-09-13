package com.mco.wackyguesses.source;

import net.minecraft.util.DamageSource;

public class WackyDamageSource extends DamageSource
{

    public WackyDamageSource(String name)
    {
        super(name);
    }

    public static DamageSource dorito  = (new WackyDamageSource("dorito"));
    public static DamageSource bullet  = (new WackyDamageSource("bullet"));


}
