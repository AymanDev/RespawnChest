package jp.aymandev.respawnchest;

import org.bukkit.plugin.java.JavaPlugin;

public class RespawnChest extends JavaPlugin {

  private static RespawnChest instance;

  @Override
  public void onEnable() {
    instance = this;
    getLogger().fine("[RespawnChest] Loading...");

    var text = "HELP!";
    getLogger().fine(text);
  }

  @Override
  public void onDisable() {}

  public static RespawnChest getInstance() {
    return instance;
  }
}
