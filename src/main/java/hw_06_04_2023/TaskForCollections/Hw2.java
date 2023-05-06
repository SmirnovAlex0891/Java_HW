package hw_06_04_2023.TaskForCollections;

import java.util.*;

/**
 * 2 Создать LinkedList из 10 элементов,
 * удалить элементы с индексами, которые хранятся другой коллекции в Set
 * и вывести на экран, то что останется от List.
 */
public class Hw2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("aa", "ee", "ff", "gg", "rr", "ss", "ii", "tt", "pp", "uu"));
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 3, 5, 7));

        System.out.println(list);
        System.out.println("*************************");
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(i)) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
