package hw_04_04_2023;

import java.util.Arrays;
import java.util.List;

/**
 * Задача: Фильтровать список строк по заданному условию.
 * List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
 */
public class Hw4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
        words.stream().filter(e -> e.length() > 5).forEach(System.out::println);
    }
}
