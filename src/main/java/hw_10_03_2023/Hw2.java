package hw_10_03_2023;
/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hw2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(4, 1, 2, 1, 2));
        System.out.println("Element without duplicates: " + searchUniqueEl(list));
        System.out.println("Element without duplicates: " + searchUniqueElTwo(list));
        System.out.println("Element without duplicates: " + findNum(list));

    }

    public static int searchUniqueEl(List<Integer> list) {
        int point1 = 1;
        int tmp = list.get(0);

        while (point1 < list.size()) {
            tmp = tmp ^ list.get(point1);
            point1++;
        }
        return tmp;
    }

    public static int searchUniqueElTwo(List<Integer> list) {
        int firstPointer = 0;
        int secondPointer = 0;

        while (firstPointer < list.size()) {
            if (firstPointer == secondPointer && firstPointer == list.size() - 1) {
                break;
            }
            if (firstPointer == secondPointer && firstPointer != list.size() - 1) {
                secondPointer++;
            } else if (list.get(firstPointer) == list.get(secondPointer)) {
                firstPointer++;
                secondPointer = 0;
            } else if (secondPointer < list.size() - 1) {
                secondPointer++;
            } else {
                break;
            }
        }
        return list.get(firstPointer);
    }

    public static int findNum(List<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
