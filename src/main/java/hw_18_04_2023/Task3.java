package hw_18_04_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Найдите количество уникальных элементов в списке, используя Java Stream API.
 */
public class Task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aaa", "bbbb", "ccccc", "dddddd", "bbbb", "dddddd", "aaa"));

        System.out.println(list.stream()
                .distinct()
                .count());
    }
}
