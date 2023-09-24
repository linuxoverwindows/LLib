package user.linux.lib.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdvancedListOperations {
    public static <T> List<T> rotateList(List<T> list, int positions) {
        int size = list.size();
        positions = positions % size;

        List<T> rotatedList = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            int newPos = (i + positions) % size;
            rotatedList.add(list.get(newPos));
        }
        return rotatedList;
    }

    public static <T> List<List<T>> partitionList(List<T> list, int chunkSize) {
        List<List<T>> partitions = new ArrayList<>();

        for (int i = 0; i < list.size(); i += chunkSize) {
            partitions.add(new ArrayList<>(list.subList(i, Math.min(i + chunkSize, list.size()))));
        }
        return partitions;
    }

    public static <T> List<T> deduplicateList(List<T> list) {
        Set<T> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }

    public static String listToCSV(List<?> list) {
        StringBuilder sb = new StringBuilder();
        for (Object item : list) {
            sb.append(item.toString()).append(",");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    public static List<String> csvToList(String csv) {
        List<String> list = new ArrayList<>();
        String[] items = csv.split(",");
        for (String item : items) {
            list.add(item);
        }
        return list;
    }
}