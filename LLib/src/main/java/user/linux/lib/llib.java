package user.linux.lib;

import org.bukkit.plugin.java.JavaPlugin;
import user.linux.lib.utils.EventHandlers;

public class llib extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new EventHandlers(), this);
        getLogger().info("MySpigotPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Your disable logic here
        getLogger().info("MySpigotPlugin has been disabled!");
    }
}