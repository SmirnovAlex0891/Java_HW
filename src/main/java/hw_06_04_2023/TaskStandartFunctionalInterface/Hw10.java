package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 10. Проверить, все ли элементы списка целых чисел являются положительными, используя интерфейсы Predicate и Function:
 */
public class Hw10 {
    public static void main(String[] args) {
        Predicate<Integer> number = e -> e >= 0;
        Function<List<Integer>, Boolean> testAllElements = list -> {
            for (Integer e : list) {
                if (!number.test(e)) return false;
            }
            return true;
        };
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,-2,6,7,8,9));
        System.out.println(testAllElements.apply(list));
    }
}
