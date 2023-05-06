package hw_18_04_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Переведите список строк в список чисел, содержащих длины этих строк, с использованием Java Stream API.
 */
public class Task4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aaa", "bbbb", "ccccc", "dddddd", "bbbb", "dddddd", "aaa"));

        List<Integer> integerList = list.stream().map(String::length).toList();
        System.out.println(integerList);
    }
}
