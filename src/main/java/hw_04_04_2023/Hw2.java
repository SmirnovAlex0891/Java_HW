package hw_04_04_2023;

import java.util.Arrays;
import java.util.List;

/**
 * Задача: Преобразовать список строк в список их длин.
 * List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
 */
public class Hw2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");
        int tmp;
        for (int i = 0; i < words.size(); i++) {
            tmp = words.get(i).length();
            words.set(i, Integer.toString(tmp));
        }

        System.out.println(words);
    }
}
