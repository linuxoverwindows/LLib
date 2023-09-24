package user.linux.lib.utils;

public class AdvancedMathOperations {
    public static double sin(double a) {
        return Math.sin(a);
    }

    public static double cos(double a) {
        return Math.cos(a);
    }

    public static double tan(double a) {
        return Math.tan(a);
    }

    public static double asin(double a) {
        return Math.asin(a);
    }

    public static double acos(double a) {
        return Math.acos(a);
    }

    public static double atan(double a) {
        return Math.atan(a);
    }

    public static double sinh(double a) {
        return Math.sinh(a);
    }

    public static double cosh(double a) {
        return Math.cosh(a);
    }

    public static double tanh(double a) {
        return Math.tanh(a);
    }

    public static double roundToDecimalPlaces(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}