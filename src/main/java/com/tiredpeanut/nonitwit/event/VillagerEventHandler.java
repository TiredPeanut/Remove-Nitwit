package com.tiredpeanut.nonitwit.event;

import com.tiredpeanut.nonitwit.NoNitwitMod;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerData;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.MobSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NoNitwitMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class VillagerEventHandler {

    @SubscribeEvent
    public static void onVillagerSpawn(MobSpawnEvent event)
    {
        if(event.getEntity() instanceof Villager villager) {
            VillagerData villagerData = villager.getVillagerData();

            // Check if the villager is a Nitwit
            if (villagerData.getProfession() == VillagerProfession.NITWIT) {
                //Change it to have no profession
                villager.setVillagerData(villager.getVillagerData().setType(villager.getVariant()).setProfession(VillagerProfession.NONE));

            }
        }

    }

}
