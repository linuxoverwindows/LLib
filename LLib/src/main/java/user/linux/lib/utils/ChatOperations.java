package user.linux.lib.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatOperations {
    public static String colorTranslate(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static void broadcastMessage(String message) {
        Bukkit.broadcastMessage(colorTranslate(message));
    }

    public static void privateMessage(Player sender, Player receiver, String message) {
        receiver.sendMessage(colorTranslate("&e(From &a" + sender.getName() + "&e) " + message));
    }
}
