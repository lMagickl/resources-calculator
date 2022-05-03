package com.lmagickl.resources_calculator;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ResourcesCalculator.MODID, version = ResourcesCalculator.VERSION)
public class ResourcesCalculator
{
    public static final String MODID = "resources-calculator";
    public static final String VERSION = "0.1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
