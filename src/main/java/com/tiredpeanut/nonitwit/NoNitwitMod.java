package com.tiredpeanut.nonitwit;

import com.mojang.logging.LogUtils;
import com.tiredpeanut.nonitwit.event.VillagerEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(NoNitwitMod.MODID)
public class NoNitwitMod
{
    public static final String MODID = "tiredpeanut_nonitwit";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NoNitwitMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
