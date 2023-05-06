package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 8. Преобразовать список строк в список их длин, используя интерфейсы Function и Supplier:
 */
public class Hw8 {
    public static void main(String[] args) {
        Supplier<List<String>> supplier = () -> new ArrayList<>(Arrays.asList("aaa", "pppppp", "tt","e","hhhh","fffff"));
        Function<List<String>, List<Integer>> transf = list -> {
            List<Integer> res = new ArrayList<>();
            for (String s : list) {
                res.add(s.length());
            }
            return res;
        };

        System.out.println(transf.apply(supplier.get()));
    }
}
