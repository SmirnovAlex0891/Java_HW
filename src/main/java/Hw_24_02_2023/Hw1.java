package Hw_24_02_2023;

import java.util.Arrays;

public class Hw1 {
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
