package com.tiviacz.travelersbackpack.init;

import com.tiviacz.travelersbackpack.items.SleepingBagItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TravelersBackpack.MODID);
    public static final List<Item> BACKPACKS = new ArrayList<>();

    //Other Items
    public static final RegistryObject<Item> WHITE_SLEEPING_BAG = ITEMS.register("white_sleeping_bag", () -> new SleepingBagItem(ModBlocks.WHITE_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SLEEPING_BAG = ITEMS.register("orange_sleeping_bag", () -> new SleepingBagItem(ModBlocks.ORANGE_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_SLEEPING_BAG = ITEMS.register("magenta_sleeping_bag", () -> new SleepingBagItem(ModBlocks.MAGENTA_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_SLEEPING_BAG = ITEMS.register("light_blue_sleeping_bag", () -> new SleepingBagItem(ModBlocks.LIGHT_BLUE_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SLEEPING_BAG = ITEMS.register("yellow_sleeping_bag", () -> new SleepingBagItem(ModBlocks.YELLOW_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_SLEEPING_BAG = ITEMS.register("lime_sleeping_bag", () -> new SleepingBagItem(ModBlocks.LIME_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SLEEPING_BAG = ITEMS.register("pink_sleeping_bag", () -> new SleepingBagItem(ModBlocks.PINK_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_SLEEPING_BAG = ITEMS.register("gray_sleeping_bag", () -> new SleepingBagItem(ModBlocks.GRAY_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_SLEEPING_BAG = ITEMS.register("light_gray_sleeping_bag", () -> new SleepingBagItem(ModBlocks.LIGHT_GRAY_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SLEEPING_BAG = ITEMS.register("cyan_sleeping_bag", () -> new SleepingBagItem(ModBlocks.CYAN_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SLEEPING_BAG = ITEMS.register("purple_sleeping_bag", () -> new SleepingBagItem(ModBlocks.PURPLE_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SLEEPING_BAG = ITEMS.register("blue_sleeping_bag", () -> new SleepingBagItem(ModBlocks.BLUE_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_SLEEPING_BAG = ITEMS.register("brown_sleeping_bag", () -> new SleepingBagItem(ModBlocks.BROWN_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SLEEPING_BAG = ITEMS.register("green_sleeping_bag", () -> new SleepingBagItem(ModBlocks.GREEN_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SLEEPING_BAG = ITEMS.register("red_sleeping_bag", () -> new SleepingBagItem(ModBlocks.RED_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SLEEPING_BAG = ITEMS.register("black_sleeping_bag", () -> new SleepingBagItem(ModBlocks.BLACK_SLEEPING_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> BACKPACK_TANK = ITEMS.register("backpack_tank", () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> HOSE = ITEMS.register("hose", () -> new HoseItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HOSE_NOZZLE = ITEMS.register("hose_nozzle", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_UPGRADE = ITEMS.register("blank_upgrade", () -> new TierUpgradeItem(new Item.Properties(), Tiers.LEATHER));
    public static final RegistryObject<Item> IRON_TIER_UPGRADE = ITEMS.register("iron_tier_upgrade", () -> new TierUpgradeItem(new Item.Properties().stacksTo(16), Tiers.LEATHER));
    public static final RegistryObject<Item> GOLD_TIER_UPGRADE = ITEMS.register("gold_tier_upgrade", () -> new TierUpgradeItem(new Item.Properties().stacksTo(16), Tiers.IRON));
    public static final RegistryObject<Item> DIAMOND_TIER_UPGRADE = ITEMS.register("diamond_tier_upgrade", () -> new TierUpgradeItem(new Item.Properties().stacksTo(16), Tiers.GOLD));
    public static final RegistryObject<Item> NETHERITE_TIER_UPGRADE = ITEMS.register("netherite_tier_upgrade", () -> new TierUpgradeItem(new Item.Properties().stacksTo(16), Tiers.DIAMOND));
    }
