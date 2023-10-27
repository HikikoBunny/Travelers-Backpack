package com.tiviacz.travelersbackpack.init;

import com.tiviacz.travelersbackpack.TravelersBackpack;
import com.tiviacz.travelersbackpack.blocks.SleepingBagBlock;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TravelersBackpack.MODID);

    //Other Blocks
    public static final RegistryObject<Block> WHITE_SLEEPING_BAG = BLOCKS.register("white_sleeping_bag", () -> new SleepingBagBlock(DyeColor.WHITE, Block.Properties.of().mapColor(MapColor.SNOW).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ORANGE_SLEEPING_BAG = BLOCKS.register("orange_sleeping_bag", () -> new SleepingBagBlock(DyeColor.ORANGE, Block.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MAGENTA_SLEEPING_BAG = BLOCKS.register("magenta_sleeping_bag", () -> new SleepingBagBlock(DyeColor.MAGENTA, Block.Properties.of().mapColor(MapColor.COLOR_MAGENTA).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LIGHT_BLUE_SLEEPING_BAG = BLOCKS.register("light_blue_sleeping_bag", () -> new SleepingBagBlock(DyeColor.LIGHT_BLUE, Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YELLOW_SLEEPING_BAG = BLOCKS.register("yellow_sleeping_bag", () -> new SleepingBagBlock(DyeColor.YELLOW, Block.Properties.of().mapColor(MapColor.COLOR_YELLOW).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LIME_SLEEPING_BAG = BLOCKS.register("lime_sleeping_bag", () -> new SleepingBagBlock(DyeColor.LIME, Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_SLEEPING_BAG = BLOCKS.register("pink_sleeping_bag", () -> new SleepingBagBlock(DyeColor.PINK, Block.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GRAY_SLEEPING_BAG = BLOCKS.register("gray_sleeping_bag", () -> new SleepingBagBlock(DyeColor.GRAY, Block.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LIGHT_GRAY_SLEEPING_BAG = BLOCKS.register("light_gray_sleeping_bag", () -> new SleepingBagBlock(DyeColor.LIGHT_GRAY, Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CYAN_SLEEPING_BAG = BLOCKS.register("cyan_sleeping_bag", () -> new SleepingBagBlock(DyeColor.CYAN, Block.Properties.of().mapColor(MapColor.COLOR_CYAN).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_SLEEPING_BAG = BLOCKS.register("purple_sleeping_bag", () -> new SleepingBagBlock(DyeColor.PURPLE, Block.Properties.of().mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BLUE_SLEEPING_BAG = BLOCKS.register("blue_sleeping_bag", () -> new SleepingBagBlock(DyeColor.BLUE, Block.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BROWN_SLEEPING_BAG = BLOCKS.register("brown_sleeping_bag", () -> new SleepingBagBlock(DyeColor.BROWN, Block.Properties.of().mapColor(MapColor.COLOR_BROWN).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_SLEEPING_BAG = BLOCKS.register("green_sleeping_bag", () -> new SleepingBagBlock(DyeColor.GREEN, Block.Properties.of().mapColor(MapColor.COLOR_GREEN).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_SLEEPING_BAG = BLOCKS.register("red_sleeping_bag", () -> new SleepingBagBlock(DyeColor.RED, Block.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BLACK_SLEEPING_BAG = BLOCKS.register("black_sleeping_bag", () -> new SleepingBagBlock(DyeColor.BLACK, Block.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.WOOL).strength(0.2F).noOcclusion().pushReaction(PushReaction.DESTROY)));
}
