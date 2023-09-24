package user.linux.lib.utils;

import org.bukkit.Bukkit;

public class ServerOperations {
    public static void shutdownServer() {
        Bukkit.shutdown();
    }

    public static void reloadServer() {
        Bukkit.reload();
    }
}
