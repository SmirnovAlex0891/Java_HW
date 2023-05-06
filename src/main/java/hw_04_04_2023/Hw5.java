package hw_04_04_2023;
/**
 * Задача: Вычислить среднее значение списка чисел.
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
 */

import java.util.Arrays;
import java.util.List;

public class Hw5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int tmp = 0;
        for (Integer i : numbers) {
            tmp = tmp + i;
        }
        System.out.println(tmp / numbers.size());
    }
}
