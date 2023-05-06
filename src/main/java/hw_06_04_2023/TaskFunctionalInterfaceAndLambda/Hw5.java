package hw_06_04_2023.TaskFunctionalInterfaceAndLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Напишите функциональный интерфейс для вычисления среднего значения списка чисел.
 */
public class Hw5 {
    public static void main(String[] args) {
        AVG avg = list -> {
            double res = 0;
            for (Integer e : list) {
                res += e;
            }
            return res /= list.size();
        };

        List<Integer> lst = new ArrayList<>(Arrays.asList(2,5,7,9,11));
        System.out.println(avg.avgCalc(lst));
    }
}
interface AVG {
    double avgCalc(List<Integer> list);
}
