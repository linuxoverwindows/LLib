package user.linux.lib.utils;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class EntityOperations {
    public static EntityType getEntityType(Entity entity) {
        return entity.getType();
    }

    public static void setEntityHealth(Entity entity, double health) {
        if (entity instanceof LivingEntity) {
            ((LivingEntity) entity).setHealth(health);
        }
    }

    public static double getEntityHealth(Entity entity) {
        if (entity instanceof LivingEntity) {
            return ((LivingEntity) entity).getHealth();
        }
        return -1;
    }

    public static void killEntity(Entity entity) {
        if (entity instanceof LivingEntity) {
            ((LivingEntity) entity).setHealth(0);
        }
    }

    public static Entity cloneEntity(Entity entity) {
        EntityType type = entity.getType();
        return entity.getWorld().spawnEntity(entity.getLocation(), type);
    }
}