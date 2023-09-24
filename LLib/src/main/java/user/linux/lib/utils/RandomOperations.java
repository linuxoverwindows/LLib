package user.linux.lib.utils;

import java.util.Random;

public class RandomOperations {
    private static final Random random = new Random();

    public static int getRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static double getRandomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }
}