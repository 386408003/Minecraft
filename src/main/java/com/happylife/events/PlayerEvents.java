package com.happylife.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

/**
 * Created by WLH on 2015/7/18.
 */

public class PlayerEvents {
    @SubscribeEvent
    public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event)
    {
        event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "addChatComponentMessage"));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "addChatMessage"));
    }
}
