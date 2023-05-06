package hw_18_04_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Используя Java Stream API, найдите максимальное и минимальное значение в списке чисел одновременно.
 */
public class Task8 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 2, 7, 4, 5, 9));

        integerList.stream()
                .collect(() -> {
                            return new ArrayList<>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE));
                        },
                        (t, value) -> {
                            if (t.get(0) > value) t.set(0, value);
                            if (t.get(1) < value) t.set(1, value);
                        }, (t, u) -> {
                            if (t.get(0) > u.get(0)) t.set(0, u.get(0));
                            if (t.get(1) < u.get(1)) t.set(1, u.get(1));
                        })
                .forEach(System.out::println);
    }
}
