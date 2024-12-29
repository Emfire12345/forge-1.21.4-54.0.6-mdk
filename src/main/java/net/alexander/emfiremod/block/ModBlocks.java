package net.alexander.emfiremod.block;

import net.alexander.emfiremod.EmfireMod;
import net.alexander.emfiremod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EmfireMod.MOD_ID);

    public static final RegistryObject<StairBlock> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            () -> new StairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_gray_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_gray_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_gray_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            () -> new StairBlock(Blocks.GRAY_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "gray_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "gray_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "gray_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            () -> new StairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "black_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "black_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "black_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            () -> new StairBlock(Blocks.BROWN_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "brown_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "brown_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "brown_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            () -> new StairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "red_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "red_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "red_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            () -> new StairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "orange_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "orange_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "orange_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            () -> new StairBlock(Blocks.YELLOW_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "yellow_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "yellow_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "yellow_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            () -> new StairBlock(Blocks.LIME_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "lime_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "lime_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "lime_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            () -> new StairBlock(Blocks.GREEN_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "green_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "green_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "green_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            () -> new StairBlock(Blocks.CYAN_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cyan_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cyan_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cyan_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_blue_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_blue_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_blue_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            () -> new StairBlock(Blocks.BLUE_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "blue_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "blue_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "blue_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            () -> new StairBlock(Blocks.PURPLE_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "purple_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "purple_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "purple_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            () -> new StairBlock(Blocks.MAGENTA_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "magenta_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "magenta_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "magenta_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            () -> new StairBlock(Blocks.PINK_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "pink_terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "pink_terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "pink_terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            () -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "terracotta_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "terracotta_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> TERRACOTTA_WALL = registerBlock("terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "terracotta_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            () -> new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_gray_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_gray_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_gray_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            () -> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "gray_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "gray_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "gray_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            () -> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "black_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "black_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "black_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            () -> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "brown_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "brown_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "brown_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            () -> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "red_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "red_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "red_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            () -> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "orange_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "orange_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "orange_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            () -> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "yellow_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "yellow_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "yellow_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            () -> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "lime_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "lime_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "lime_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            () -> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "green_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "green_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "green_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            () -> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cyan_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cyan_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cyan_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_blue_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_blue_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "light_blue_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            () -> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "blue_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "blue_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "blue_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            () -> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "purple_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "purple_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "purple_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            () -> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "magenta_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "magenta_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "magenta_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            () -> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "pink_concrete_stairs")))
                            .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "pink_concrete_slab")))
                    .strength(1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "pink_concrete_wall")))
                    .strength(1.8f).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            () -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "packed_mud_stairs")))
                            .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));
    public static final RegistryObject<SlabBlock> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "packed_mud_slab")))
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));
    public static final RegistryObject<WallBlock> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "packed_mud_wall")))
                    .strength(1f).requiresCorrectToolForDrops().sound(SoundType.PACKED_MUD)));
    public static final RegistryObject<StairBlock> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            () -> new StairBlock(Blocks.NETHERRACK.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "netherrack_stairs")))
                            .strength(0.4f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final RegistryObject<SlabBlock> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "netherrack_slab")))
                    .strength(0.4f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final RegistryObject<WallBlock> NETHERRACK_WALL = registerBlock("netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "netherrack_wall")))
                    .strength(0.4f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final RegistryObject<StairBlock> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "end_stone_stairs")))
                            .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "end_stone_slab")))
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "end_stone_wall")))
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(Blocks.CALCITE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "calcite_stairs")))
                            .strength(0.75f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<SlabBlock> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "calcite_slab")))
                    .strength(0.75f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<WallBlock> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "calcite_wall")))
                    .strength(0.75f).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
    public static final RegistryObject<StairBlock> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "dripstone_stairs")))
                            .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<SlabBlock> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "dripstone_slab")))
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<WallBlock> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "dripstone_wall")))
                    .strength(1.5f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<StairBlock> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "quartz_brick_stairs")))
                            .strength(0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "quartz_brick_slab")))
                    .strength(0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "quartz_brick_wall")))
                    .strength(0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "smooth_basalt_stairs")))
                            .strength(1.25f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
    public static final RegistryObject<SlabBlock> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "smooth_basalt_slab")))
                    .strength(1.25f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));
    public static final RegistryObject<WallBlock> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "smooth_basalt_wall")))
                    .strength(1.25f).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

    public static final RegistryObject<StairBlock> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "smooth_stone_stairs")))
                            .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "smooth_stone_wall")))
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            () -> new StairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cut_sandstone_stairs")))
                            .strength(0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cut_sandstone_wall")))
                    .strength(0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            () -> new StairBlock(Blocks.CUT_RED_SANDSTONE.defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create((Registries.BLOCK), ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cut_red_sandstone_stairs")))
                            .strength(0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "cut_red_sandstone_wall")))
                    .strength(0.8f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "stone_wall")))
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "polished_andesite_wall")))
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "polished_diorite_wall")))
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "polished_granite_wall")))
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "quartz_wall")))
                    .strength(0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "smooth_quartz_wall")))
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "smooth_sandstone_wall")))
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "smooth_red_sandstone_wall")))
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "prismarine_brick_wall")))
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "dark_prismarine_wall")))
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "purpur_wall")))
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WHITE_PAINTED_PLANKS = registerBlock("white_painted_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "alexandrite_block")))
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<StairBlock> WHITE_PAINTED_STAIRS = registerBlock("white_painted_stairs",
            () -> new StairBlock(ModBlocks.WHITE_PAINTED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_painted_stairs")))
                            .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<SlabBlock> WHITE_PAINTED_SLAB = registerBlock("white_painted_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_painted_slab")))
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<DoorBlock> WHITE_PAINTED_DOOR = registerBlock("white_painted_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_painted_door")))
                    .strength(3f).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.WOOD)));
    public static final RegistryObject<TrapDoorBlock> WHITE_PAINTED_TRAPDOOR = registerBlock("white_painted_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_painted_trapdoor")))
                    .strength(3f).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.WOOD)));
    public static final RegistryObject<FenceBlock> WHITE_PAINTED_FENCE = registerBlock("white_painted_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_painted_fence")))
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final RegistryObject<FenceGateBlock> WHITE_PAINTED_FENCE_GATE = registerBlock("white_painted_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, "white_painted_fence_gate")))
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(EmfireMod.MOD_ID, name)))));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}