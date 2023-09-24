package user.linux.lib.utils;

public class AdvancedChatOperations {
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static String toUpperCase(String text) {
        return text.toUpperCase();
    }

    public static String toLowerCase(String text) {
        return text.toLowerCase();
    }
}