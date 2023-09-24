package user.linux.lib.utils;

import java.util.HashMap;

public class EconomyOperations {
    private static final HashMap<String, Double> economyBalance = new HashMap<>();

    public static void setBalance(String playerName, double amount) {
        economyBalance.put(playerName, amount);
    }

    public static double getBalance(String playerName) {
        return economyBalance.getOrDefault(playerName, 0.0);
    }

    public static void addBalance(String playerName, double amount) {
        double currentBalance = getBalance(playerName);
        setBalance(playerName, currentBalance + amount);
    }

    public static void subtractBalance(String playerName, double amount) {
        double currentBalance = getBalance(playerName);
        setBalance(playerName, currentBalance - amount);
    }
}