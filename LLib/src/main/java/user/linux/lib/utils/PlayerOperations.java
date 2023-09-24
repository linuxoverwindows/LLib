package user.linux.lib.utils;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerOperations {
    public static Location getPlayerLocation(Player player) {
        return player.getLocation();
    }

    public static void teleportPlayer(Player player, Location location) {
        player.teleport(location);
    }

    public static void healPlayer(Player player) {
        player.setHealth(player.getMaxHealth());
    }

    public static void damagePlayer(Player player, double amount) {
        player.damage(amount);
    }

    public static void feedPlayer(Player player) {
        player.setFoodLevel(20);
    }

    public static void setPlayerGameMode(Player player, GameMode gameMode) {
        player.setGameMode(gameMode);
    }

    public static ItemStack[] getPlayerInventory(Player player) {
        return player.getInventory().getContents();
    }

    public static void clearPlayerInventory(Player player) {
        player.getInventory().clear();
    }

    public static void addItemToInventory(Player player, ItemStack itemStack) {
        player.getInventory().addItem(itemStack);
    }
}