package com.rdm.gennalith;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Gennalith.MODID)
public class Gennalith {
    public static final String MODID = "gennalith";
    public static final String MOD_NAME = "Gennalith";
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public Gennalith() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
