package hw_06_04_2023.TaskForCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1 Создать ArrayList из 10 элементов, отсортировать его по возрастанию и вывести на экран.
 */
public class Hw1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 7, 2, 8, 5, 6, 9, 0));
        list.sort(((o1, o2) -> {
            return o1 - o2;
        }));
        System.out.println(list);
    }
}
