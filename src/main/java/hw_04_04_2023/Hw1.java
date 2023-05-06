package hw_04_04_2023;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Задача: Отсортировать список строк в порядке убывания длины строк.
 * List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
 */
public class Hw1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");

        System.out.println(words);
        words.sort(((o1, o2) -> {
            return o2.length() - o1.length();
        }));
        System.out.println("***************************");
        System.out.println(words);

    }
}
