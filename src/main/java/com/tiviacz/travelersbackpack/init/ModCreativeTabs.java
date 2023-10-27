package com.tiviacz.travelersbackpack.init;

import com.tiviacz.travelersbackpack.TravelersBackpack;
import com.tiviacz.travelersbackpack.config.TravelersBackpackConfig;
import com.tiviacz.travelersbackpack.inventory.Tiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TravelersBackpack.MODID);

    public static RegistryObject<CreativeModeTab> TRAVELERS_BACKPACK = CREATIVE_MODE_TABS.register("travelersbackpack", () -> CreativeModeTab.builder()
            .icon(ModCreativeTabs::createTabStack)
            .title(Component.translatable("itemGroup.travelersbackpack")).displayItems(ModCreativeTabs::displayItems).build());

    public static void displayItems(CreativeModeTab.ItemDisplayParameters displayParameters, CreativeModeTab.Output output)
    {

        //Bags
        output.accept(ModItems.WHITE_SLEEPING_BAG.get());
        output.accept(ModItems.ORANGE_SLEEPING_BAG.get());
        output.accept(ModItems.MAGENTA_SLEEPING_BAG.get());
        output.accept(ModItems.LIGHT_BLUE_SLEEPING_BAG.get());
        output.accept(ModItems.YELLOW_SLEEPING_BAG.get());
        output.accept(ModItems.LIME_SLEEPING_BAG.get());
        output.accept(ModItems.PINK_SLEEPING_BAG.get());
        output.accept(ModItems.GRAY_SLEEPING_BAG.get());
        output.accept(ModItems.LIGHT_GRAY_SLEEPING_BAG.get());
        output.accept(ModItems.CYAN_SLEEPING_BAG.get());
        output.accept(ModItems.PURPLE_SLEEPING_BAG.get());
        output.accept(ModItems.BLUE_SLEEPING_BAG.get());
        output.accept(ModItems.BROWN_SLEEPING_BAG.get());
        output.accept(ModItems.GREEN_SLEEPING_BAG.get());
        output.accept(ModItems.RED_SLEEPING_BAG.get());
        output.accept(ModItems.BLACK_SLEEPING_BAG.get());
    }
}
