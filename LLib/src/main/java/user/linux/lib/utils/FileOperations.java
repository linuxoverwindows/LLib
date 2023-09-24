package user.linux.lib.utils;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileOperations {
    private final JavaPlugin plugin;

    public FileOperations(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public String readFile(String fileName) throws IOException {
        File file = new File(plugin.getDataFolder(), fileName);
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public void writeFile(String fileName, String content) throws IOException {
        File file = new File(plugin.getDataFolder(), fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        }
    }

    public void appendToFile(String fileName, String content) throws IOException {
        File file = new File(plugin.getDataFolder(), fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(content);
        }
    }

    public boolean deleteFile(String fileName) {
        File file = new File(plugin.getDataFolder(), fileName);
        return file.delete();
    }

    public boolean createDirectory(String dirName) {
        File dir = new File(plugin.getDataFolder(), dirName);
        return dir.mkdirs();
    }

    public List<String> listDirectory(String dirName) throws IOException {
        Path dirPath = Paths.get(plugin.getDataFolder().getPath(), dirName);
        return Files.readAllLines(dirPath, StandardCharsets.UTF_8);
    }

    public boolean deleteDirectory(String dirName) {
        File dir = new File(plugin.getDataFolder(), dirName);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (String child : children) {
                boolean success = deleteFile(Paths.get(dirName, child).toString());
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }
}