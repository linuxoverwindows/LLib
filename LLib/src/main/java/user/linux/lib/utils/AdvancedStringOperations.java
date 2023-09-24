package user.linux.lib.utils;

import java.util.Base64;

public class AdvancedStringOperations {
    public static String padLeft(String str, int length, char paddingChar) {
        return String.format("%" + length + "s", str).replace(' ', paddingChar);
    }

    public static String padRight(String str, int length, char paddingChar) {
        return String.format("%-" + length + "s", str).replace(' ', paddingChar);
    }

    public static String removeSubstring(String str, String substring) {
        return str.replace(substring, "");
    }

    public static String sanitizeString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String encryptString(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    public static String decryptString(String encryptedStr) {
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedStr);
        return new String(decodedBytes);
    }
}
