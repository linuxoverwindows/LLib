package user.linux.lib.utils;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;

public class WorldOperations {
    public static void spawnEntity(World world, Location location, EntityType entityType) {
        world.spawnEntity(location, entityType);
    }

    public static void removeEntity(org.bukkit.entity.Entity entity) {
        entity.remove();
    }

    public static void changeWeather(World world, String weatherType, int duration) {
        switch (weatherType.toLowerCase()) {
            case "clear":
                world.setStorm(false);
                break;
            case "rain":
                world.setStorm(true);
                break;
            case "thunder":
                world.setStorm(true);
                world.setThundering(true);
                break;
        }
        world.setWeatherDuration(duration);
    }

    public static void setTimeOfDay(World world, long time) {
        world.setTime(time);
    }
}