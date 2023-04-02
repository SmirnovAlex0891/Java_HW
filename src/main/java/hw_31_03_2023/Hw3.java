package hw_31_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Hw3 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 0, 1};
        System.out.println(missingNum(nums));
    }

    public static int missingNum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!list.contains(i)) return i;
        }
        return -1;
    }
}
