package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * 4. Сложить два списка целых чисел поэлементно, используя интерфейс BinaryOperator:
 */
public class Hw4 {
    public static void main(String[] args) {
        BinaryOperator<List<Integer>> sum = (a, b) -> {
            List<Integer> tmp = new ArrayList<>();
            int pointA = 0;
            int pointB = 0;

            while (pointA < a.size() || pointB < b.size()) {
                if (pointA == a.size()) {
                    tmp.add(b.get(pointB));
                } else if (pointB == b.size()) {
                    tmp.add(a.get(pointA));
                } else {
                    tmp.add(a.get(pointA) + b.get(pointB));
                }

                if (pointA < a.size()) pointA++;
                if (pointB < b.size()) pointB++;
            }
            return tmp;
        };

        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));

        System.out.println(sum.apply(list1, list2));
    }
}
