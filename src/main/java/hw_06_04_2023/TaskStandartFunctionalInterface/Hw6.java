package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 6. Найти среднее арифметическое из списка чисел, используя интерфейсы Function и Consumer:
 */
public class Hw6 {
    public static void main(String[] args) {
        Function<List<Integer>, Integer> avg = list -> {
            Integer tmp = 0;
            for (Integer el : list) {
                tmp += el;
            }
            return tmp /= list.size();
        };
        Consumer<Integer> print = el -> System.out.println("Average : " + el);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(2,4,7,3,5,9));

        print.accept(avg.apply(integerList));
    }
}
