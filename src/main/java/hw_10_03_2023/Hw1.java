package hw_10_03_2023;

import java.util.*;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. *
 */
public class Hw1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 0, 1, 1, 1, 2, 2, 3, 3, 4));
        System.out.println("Number of non-repeating elements: " + editArray(list));
        System.out.println(list);
    }

    public static int editArray(List<Integer> list) {
        int point1 = 0;
        int point2 = 0;

        while (point2 < list.size()) {
            if (list.get(point1).equals(list.get(point2))) {
                point2++;
            } else {
                point1++;
                list.set(point1, list.get(point2));
            }
        }
        return ++point1;
    }
}
