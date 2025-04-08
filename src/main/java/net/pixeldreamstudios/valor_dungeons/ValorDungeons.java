package net.pixeldreamstudios.valor_dungeons;

import net.fabricmc.api.ModInitializer;
import net.pixeldreamstudios.valor_dungeons.registry.CreativeModeTabRegistry;
import net.pixeldreamstudios.valor_dungeons.registry.ItemRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValorDungeons implements ModInitializer {
  public static final String MOD_ID = "valor_dungeons";
  public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    ItemRegistry.init();
    CreativeModeTabRegistry.init();
  }
}
