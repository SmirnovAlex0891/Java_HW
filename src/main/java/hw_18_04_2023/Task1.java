package hw_18_04_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Найдите среднюю длину слов в списке строк, используя Java Stream API.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aaa", "bbbb", "ccccc", "dddddd"));
        System.out.println(list.stream()
                .map(e -> e.length())
                .collect(Collectors.averagingDouble(Integer::doubleValue)));

    }
}
