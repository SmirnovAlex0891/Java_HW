package hw_18_04_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Используя Java Stream API, выполните операцию "свертки" (reduce) на списке чисел, чтобы найти сумму, произведение или другую агрегатную функцию.
 */
public class Task10 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,3,6,8,2,7,4,5,9));

        System.out.println(integerList.stream()
                .reduce(0, (ak, e) -> ak + e));
    }
}
