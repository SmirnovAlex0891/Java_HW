package hw_18_04_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Используя Java Stream API, найдите сумму всех чисел в списке, удовлетворяющих определенному условию.
 */
public class Task5 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,3,6,8,2,7,4,5,9));
        System.out.println(integerList.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum());
    }
}
