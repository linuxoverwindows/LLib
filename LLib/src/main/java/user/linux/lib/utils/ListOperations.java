package user.linux.lib.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static double average(List<Integer> list) {
        return (double) sum(list) / list.size();
    }

    public static int min(List<Integer> list) {
        return Collections.min(list);
    }

    public static int max(List<Integer> list) {
        return Collections.max(list);
    }

    public static List<Integer> sort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static List<Integer> reverse(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static List<Integer> shuffle(List<Integer> list) {
        List<Integer> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        return shuffledList;
    }

    public static List<Integer> concatenate(List<Integer> list1, List<Integer> list2) {
        List<Integer> concatenatedList = new ArrayList<>(list1);
        concatenatedList.addAll(list2);
        return concatenatedList;
    }

    public static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        List<Integer> intersectionList = new ArrayList<>(list1);
        intersectionList.retainAll(list2);
        return intersectionList;
    }

    public static List<Integer> union(List<Integer> list1, List<Integer> list2) {
        List<Integer> unionList = new ArrayList<>(list1);
        for (int num : list2) {
            if (!unionList.contains(num)) {
                unionList.add(num);
            }
        }
        return unionList;
    }

    public static List<Integer> difference(List<Integer> list1, List<Integer> list2) {
        List<Integer> differenceList = new ArrayList<>(list1);
        differenceList.removeAll(list2);
        return differenceList;
    }
}
