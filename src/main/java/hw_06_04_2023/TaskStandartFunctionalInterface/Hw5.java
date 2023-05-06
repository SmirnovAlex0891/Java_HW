package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 5. Создать список строк, содержащий только уникальные элементы из двух списков, используя интерфейсы Function и Predicate(?):
 */
public class Hw5 {
    public static void main(String[] args) {
       Function<List<String>, List<String>> filter = (list1) ->{
            List<String> res = new ArrayList<>();
            for (String s : list1) {
                if (!res.contains(s)) res.add(s);
            }
            return res;
        };

        List<String> list1 = new ArrayList<>(Arrays.asList("aaa", "bbb", "ccc", "ddd"));
        List<String> list2 = new ArrayList<>(Arrays.asList("aaa", "eee", "ccc", "fff"));

        List<String> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println(list);
        System.out.println(filter.apply(list));
    }
}
