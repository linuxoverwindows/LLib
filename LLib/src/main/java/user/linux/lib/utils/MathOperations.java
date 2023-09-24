package user.linux.lib.utils;

public class MathOperations {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        }
        return a / b;
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static double log(double a) {
        return Math.log(a);
    }

    public static double exp(double a) {
        return Math.exp(a);
    }

    public static long factorial(int a) {
        long result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int fibonacci(int a) {
        if (a <= 1) {
            return a;
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    public static float randomFloat(float min, float max) {
        return (float) (Math.random() * (max - min) + min);
    }

    public static double randomGaussian(double mean, double stdDev) {
        return mean + stdDev * Math.random();
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
}