package net.pixeldreamstudios.valor_dungeons.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.pixeldreamstudios.valor_dungeons.ValorDungeons;

public class ItemRegistry {
  public static final Item SKULL_HAVEN_KEY =
      register(new Item(new Item.Properties().stacksTo(1)), "skull_haven_key");
  public static final Item TOMB_OF_ANUBIS_KEY =
      register(new Item(new Item.Properties().stacksTo(1)), "tomb_of_anubis_key");
  public static final Item JAGUAR_TEMPLE_KEY =
      register(new Item(new Item.Properties().stacksTo(1)), "jaguar_temple_key");
  public static final Item SKULL_HAVEN_SOUL =
      register(new Item(new Item.Properties().stacksTo(1)), "skull_haven_soul");
  public static final Item TOMB_OF_ANUBIS_SOUL =
      register(new Item(new Item.Properties().stacksTo(1)), "tomb_of_anubis_soul");
  public static final Item JAGUAR_TEMPLE_SOUL =
      register(new Item(new Item.Properties().stacksTo(1)), "jaguar_temple_soul");

  public static Item register(Item item, String id) {
    ResourceLocation itemID = ResourceLocation.fromNamespaceAndPath(ValorDungeons.MOD_ID, id);
    Item registeredItem = Registry.register(BuiltInRegistries.ITEM, itemID, item);

    return registeredItem;
  }

  public static void init() {
    ValorDungeons.LOGGER.info("Registering items");
  }
}
