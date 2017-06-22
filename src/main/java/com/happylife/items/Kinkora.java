package com.happylife.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

/**
 * Created by WLH on 2015/7/19.
 */
public class Kinkora extends Item{
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        player.addChatComponentMessage(new ChatComponentText(ChatFormatting.GREEN.toString()+ChatFormatting.BOLD+"233333333333333333333333333"));
        return false;
    }
}
