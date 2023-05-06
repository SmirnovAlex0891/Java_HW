package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * 7. Отсортировать список строк в обратном алфавитном порядке, используя интерфейсы Comparator и Function(? Predicate):
 */
public class Hw7 {
    public static void main(String[] args) {
        Comparator<String> comparator = (e1, e2) -> e2.compareTo(e1);
        Function<List<String>, Boolean> sort = list -> {
            list.sort(comparator);
            return true;
        };

        List<String> stringList = new ArrayList<>(Arrays.asList("aaa", "fff", "sss", "ttt"));
        System.out.println(sort.apply(stringList));
        System.out.println(stringList);
    }
}
