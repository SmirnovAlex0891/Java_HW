package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * 3. Изменить список строк, заменив все символы в нижнем регистре на символы в верхнем регистре, используя интерфейс UnaryOperator:
 */
public class Hw3 {
    public static void main(String[] args) {
        UnaryOperator<List<String>> up = el -> {
            List<String> tmp = new ArrayList<>();
            for (String s : el) {
                tmp.add(s.toUpperCase());
            }
            el = tmp;
            return el;
        };

        List<String> list = new ArrayList<>(Arrays.asList("Aaa", "Fff", "Hhh"));
        System.out.println(list);
        System.out.println(up.apply(list));
    }
}
