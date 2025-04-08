package net.pixeldreamstudios.valor_dungeons.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.pixeldreamstudios.valor_dungeons.ValorDungeons;

public class CreativeModeTabRegistry {
  public static final ResourceKey<CreativeModeTab> VALOR_DUNGEONS_GROUP_KEY =
      ResourceKey.create(
          BuiltInRegistries.CREATIVE_MODE_TAB.key(),
          ResourceLocation.fromNamespaceAndPath(ValorDungeons.MOD_ID, "creative_mode_tab"));
  public static final CreativeModeTab VALOR_DUNGEONS_CREATIVE_MODE_TAB =
      FabricItemGroup.builder()
          .icon(() -> new ItemStack(ItemRegistry.SKULL_HAVEN_KEY))
          .title(Component.translatable("creative_mode_tab." + ValorDungeons.MOD_ID))
          .build();

  public static void init() {
    ValorDungeons.LOGGER.info("Registering creative mode tabs");

    Registry.register(
        BuiltInRegistries.CREATIVE_MODE_TAB,
        VALOR_DUNGEONS_GROUP_KEY,
        VALOR_DUNGEONS_CREATIVE_MODE_TAB);
    ItemGroupEvents.modifyEntriesEvent(VALOR_DUNGEONS_GROUP_KEY)
        .register(
            creativeModeTab -> {
              creativeModeTab.accept(ItemRegistry.SKULL_HAVEN_KEY);
              creativeModeTab.accept(ItemRegistry.TOMB_OF_ANUBIS_KEY);
              creativeModeTab.accept(ItemRegistry.JAGUAR_TEMPLE_KEY);
              creativeModeTab.accept(ItemRegistry.SKULL_HAVEN_SOUL);
              creativeModeTab.accept(ItemRegistry.TOMB_OF_ANUBIS_SOUL);
              creativeModeTab.accept(ItemRegistry.JAGUAR_TEMPLE_SOUL);
            });
  }
}
