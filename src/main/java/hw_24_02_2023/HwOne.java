package hw_24_02_2023;

import java.util.Arrays;

/**
 * Дан массив nums целых чисел и целое число target, найдите индексы двух элементов массива,
 * чтобы сумма этих значений была равна target. Предполагается, что существует всегда только
 * одно решение и нельзя использовать один и тот же элемент массива дважды. Example 1:
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2: Input: nums = [3,2,4], target = 6 Output: [1,2]
 * Example 3: Input: nums = [3,3], target = 6 Output: [0,1]
 */
public class HwOne {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 3, 5, 9, 11, 14, 8};
        int target = 21;

        System.out.println("Search items: " + Arrays.toString(searchPairsNum(arr, target)));
    }

    public static int[] searchPairsNum(int[] arr, int target) {
        int[] res = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target && i < arr.length - 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }
            }
        }

        return res;
    }
}
