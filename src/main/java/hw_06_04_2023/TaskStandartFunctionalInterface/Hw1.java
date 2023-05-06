package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 1. Найти максимальный элемент в списке целых чисел, используя интерфейс Function:
 */
public class Hw1 {
    public static void main(String[] args) {
        Function<List<Integer>, Integer> max = x -> {
            int tmp = Integer.MIN_VALUE;
            for (Integer el : x) {
                if (el > tmp) {
                    tmp = el;
                }
            }
            return tmp;
        };

        List<Integer> list = Arrays.asList(1, 3, 5, 7, 11, 2, 4, 9, 10);
        System.out.println(max.apply(list));
    }
}

