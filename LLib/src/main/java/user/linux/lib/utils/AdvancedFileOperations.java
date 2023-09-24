package user.linux.lib.utils;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class AdvancedFileOperations {
    private final JavaPlugin plugin;

    public AdvancedFileOperations(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean copyFile(String sourceFileName, String destFileName) {
        File sourceFile = new File(plugin.getDataFolder(), sourceFileName);
        File destFile = new File(plugin.getDataFolder(), destFileName);
        try {
            Files.copy(sourceFile.toPath(), destFile.toPath());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean moveFile(String sourceFileName, String destFileName) {
        File sourceFile = new File(plugin.getDataFolder(), sourceFileName);
        File destFile = new File(plugin.getDataFolder(), destFileName);
        try {
            Files.move(sourceFile.toPath(), destFile.toPath());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean renameFile(String oldFileName, String newFileName) {
        return moveFile(oldFileName, newFileName);
    }

    public long getFileSize(String fileName) {
        File file = new File(plugin.getDataFolder(), fileName);
        return file.length();
    }

    public long getLastModifiedTime(String fileName) {
        File file = new File(plugin.getDataFolder(), fileName);
        return file.lastModified();
    }
}