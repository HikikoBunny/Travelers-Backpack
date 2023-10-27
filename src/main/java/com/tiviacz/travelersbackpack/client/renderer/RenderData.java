package com.tiviacz.travelersbackpack.client.renderer;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;

public class RenderData
{
    private final ItemStack stack;
    private final Player player;

    private final String COLOR = "Color";
    private final String SLEEPING_BAG_COLOR = "SleepingBagColor";

    public RenderData(Player player, ItemStack stack, boolean loadData)
    {
        this.player = player;
        this.stack = stack;

        if(loadData)
        {
            this.loadDataFromStack(stack);
        }
    }


    public int getSleepingBagColor()
    {
        if(this.stack.getOrCreateTag().contains(SLEEPING_BAG_COLOR))
        {
            return this.stack.getOrCreateTag().getInt(SLEEPING_BAG_COLOR);
        }
        return DyeColor.RED.getId();
    }
}
