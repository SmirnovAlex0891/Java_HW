package hw_06_04_2023.TaskForCollections;

import java.util.*;

/**
 * 10 Создать HashSet из нескольких элементов, создать LinkedList из тех же
 * элементов и вывести на экран элементы LinkedList в том порядке, в котором они были добавлены.
 */
public class Hw10 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("aa", "ee", "ff", "gg", "rr", "ss", "ii", "tt", "pp", "uu"));
        List<String> list = new LinkedList<>(Arrays.asList("aa", "ee", "ff", "gg", "rr", "ss", "ii", "tt", "pp", "uu"));

        System.out.println(set);
        System.out.println(list);
    }
}
