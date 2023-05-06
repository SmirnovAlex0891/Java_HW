package hw_04_04_2023;

import java.util.Arrays;
import java.util.List;

/**
 * Задача: Найти максимальный элемент в списке чисел.
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
 */
public class Hw3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int max = 0;
        for (Integer i : numbers) {
            if (i > max) max = i;
        }
        System.out.println(max);

    }
}
