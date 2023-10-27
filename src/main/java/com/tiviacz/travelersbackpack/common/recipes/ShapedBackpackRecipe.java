package com.tiviacz.travelersbackpack.common.recipes;

import com.google.gson.JsonObject;
import com.tiviacz.travelersbackpack.blocks.SleepingBagBlock;
import com.tiviacz.travelersbackpack.items.SleepingBagItem;
import com.tiviacz.travelersbackpack.util.RecipeUtils;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.common.crafting.CraftingHelper;

import javax.annotation.Nullable;



                if(!ingredient.isEmpty() && ingredient.getItem() instanceof SleepingBagItem)
                {
                    output.getOrCreateTag().putInt("SleepingBagColor", getProperColor((SleepingBagItem)ingredient.getItem()));
                }
            }
        }
        return output;
    }

    public static int getProperColor(SleepingBagItem item)
    {
        if(item.getBlock() instanceof SleepingBagBlock sleepingBag)
        {
            return sleepingBag.getColor().getId();
        }
        return DyeColor.RED.getId();
    }

       }
    }
}
