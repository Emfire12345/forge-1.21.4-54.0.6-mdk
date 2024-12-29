package net.alexander.emfiremod.item;

import net.alexander.emfiremod.EmfireMod;
import net.alexander.emfiremod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIV_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmfireMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EMFIRE_BLOCKS_TAB = CREATIV_MODE_TABS.register("emfire_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.WHITE_TERRACOTTA_STAIRS.get()))
                    .title(Component.translatable("creativetab.emfiremod.emfire_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.WHITE_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.GRAY_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.BLACK_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.BROWN_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.RED_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.ORANGE_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.YELLOW_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.LIME_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.GREEN_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.CYAN_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.BLUE_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.PURPLE_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.PINK_TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.TERRACOTTA_SLAB.get());
                        output.accept(ModBlocks.WHITE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.RED_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.LIME_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.PINK_CONCRETE_SLAB.get());
                        output.accept(ModBlocks.PACKED_MUD_SLAB.get());
                        output.accept(ModBlocks.NETHERRACK_SLAB.get());
                        output.accept(ModBlocks.END_STONE_SLAB.get());
                        output.accept(ModBlocks.CALCITE_SLAB.get());
                        output.accept(ModBlocks.DRIPSTONE_SLAB.get());
                        output.accept(ModBlocks.SMOOTH_BASALT_SLAB.get());
                        output.accept(ModBlocks.QUARTZ_BRICK_SLAB.get());

                        output.accept(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.GRAY_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.BROWN_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.RED_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.LIME_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.GREEN_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.CYAN_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.BLUE_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.PINK_TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.TERRACOTTA_STAIRS.get());
                        output.accept(ModBlocks.WHITE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.RED_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.LIME_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.PINK_CONCRETE_STAIRS.get());
                        output.accept(ModBlocks.PACKED_MUD_STAIRS.get());
                        output.accept(ModBlocks.NETHERRACK_STAIRS.get());
                        output.accept(ModBlocks.END_STONE_STAIRS.get());
                        output.accept(ModBlocks.CALCITE_STAIRS.get());
                        output.accept(ModBlocks.DRIPSTONE_STAIRS.get());
                        output.accept(ModBlocks.SMOOTH_BASALT_STAIRS.get());
                        output.accept(ModBlocks.QUARTZ_BRICK_STAIRS.get());
                        output.accept(ModBlocks.SMOOTH_STONE_STAIRS.get());
                        output.accept(ModBlocks.CUT_SANDSTONE_STAIRS.get());
                        output.accept(ModBlocks.CUT_RED_SANDSTONE_STAIRS.get());

                        output.accept(ModBlocks.WHITE_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.GRAY_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.BLACK_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.BROWN_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.RED_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.ORANGE_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.YELLOW_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.LIME_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.GREEN_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.CYAN_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.BLUE_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.PURPLE_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.MAGENTA_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.PINK_TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.TERRACOTTA_WALL.get());
                        output.accept(ModBlocks.WHITE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_WALL.get());
                        output.accept(ModBlocks.BLACK_CONCRETE_WALL.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_WALL.get());
                        output.accept(ModBlocks.RED_CONCRETE_WALL.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_WALL.get());
                        output.accept(ModBlocks.LIME_CONCRETE_WALL.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_WALL.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_WALL.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_WALL.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_WALL.get());
                        output.accept(ModBlocks.PINK_CONCRETE_WALL.get());
                        output.accept(ModBlocks.PACKED_MUD_WALL.get());
                        output.accept(ModBlocks.NETHERRACK_WALL.get());
                        output.accept(ModBlocks.END_STONE_WALL.get());
                        output.accept(ModBlocks.CALCITE_WALL.get());
                        output.accept(ModBlocks.DRIPSTONE_WALL.get());
                        output.accept(ModBlocks.SMOOTH_BASALT_WALL.get());
                        output.accept(ModBlocks.QUARTZ_BRICK_WALL.get());
                        output.accept(ModBlocks.SMOOTH_STONE_WALL.get());
                        output.accept(ModBlocks.CUT_SANDSTONE_WALL.get());
                        output.accept(ModBlocks.CUT_RED_SANDSTONE_WALL.get());
                        output.accept(ModBlocks.STONE_WALL.get());
                        output.accept(ModBlocks.POLISHED_ANDESITE_WALL.get());
                        output.accept(ModBlocks.POLISHED_DIORITE_WALL.get());
                        output.accept(ModBlocks.POLISHED_GRANITE_WALL.get());
                        output.accept(ModBlocks.QUARTZ_WALL.get());
                        output.accept(ModBlocks.SMOOTH_QUARTZ_WALL.get());
                        output.accept(ModBlocks.SMOOTH_SANDSTONE_WALL.get());
                        output.accept(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get());
                        output.accept(ModBlocks.PRISMARINE_BRICK_WALL.get());
                        output.accept(ModBlocks.DARK_PRISMARINE_WALL.get());
                        output.accept(ModBlocks.PURPUR_WALL.get());

                        output.accept(ModBlocks.WHITE_PAINTED_PLANKS.get());
                        output.accept(ModBlocks.WHITE_PAINTED_STAIRS.get());
                        output.accept(ModBlocks.WHITE_PAINTED_SLAB.get());
                        output.accept(ModBlocks.WHITE_PAINTED_DOOR.get());
                        output.accept(ModBlocks.WHITE_PAINTED_TRAPDOOR.get());
                        output.accept(ModBlocks.WHITE_PAINTED_FENCE.get());
                        output.accept(ModBlocks.WHITE_PAINTED_FENCE_GATE.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIV_MODE_TABS.register(eventBus);
    }
}
