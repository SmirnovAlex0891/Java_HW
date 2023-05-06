package hw_18_04_2023;

import java.util.Arrays;

/**
 * Реализуйте алгоритм поиска всех уникальных элементов в двух массивах и их объединение в новый массив с использованием Java Stream API.
 */
public class Task11 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9,11};
        int[] arr2 = {2,3,5,4,9,12};
        int[][] arr = {arr1, arr2};
        int[] newArr = Arrays.stream(arr)
                .flatMap(e -> Arrays.stream(e).boxed())
                .distinct()
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.stream(newArr).boxed().forEach(System.out::println);
    }
}
