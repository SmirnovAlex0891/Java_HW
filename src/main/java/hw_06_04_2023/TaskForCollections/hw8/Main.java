package hw_06_04_2023.TaskForCollections.hw8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 8 Создать множество HashSet и добавить в него несколько строк. Затем создать второе множество и добавить в него
 *   те же самые строки, но в другом порядке. Затем вывести на консоль только те строки, которые есть в обоих множествах.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("aaa", "ggg", "ttt", "rrr"));
        Set<String> set2 = new HashSet<>(Arrays.asList("ttt", "aaa", "rrr", "ggg"));

        for (String s : set1) {
            if (set2.contains(s)) {
                System.out.println(s);
            }
        }
    }
}
