package hw_24_02_2023;

import java.util.Arrays;

/**
 * Дано целое число, представленное его разрядами, которые записаны в массив.
 * Например, число 123 представляется массивом [1, 2, 3]. Получите массив, который
 * преставляет сумму исходного числа и 1.
 * Example 1: Input: digits = [1,2,3] Output: [1,2,4] Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124. Thus, the result
 */
public class HwTwo {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println(Arrays.toString(sum(num)));
    }

    public static int[] sum(int[] num) {
        int p;
        if (num[num.length - 1] + 1 > 9) {
            p = 1;
            for (int i = num.length - 1; i >= 0; i--) {
                if (num[i] + p > 9 && p == 1) {
                    num[i] = 0;
                } else if (p == 1) {
                    num[i]++;
                    p = 0;
                }
            }
            if (p == 1) {
                num = new int[num.length + 1];
                num[0] = p;
            }
        } else num[num.length - 1]++;

        return num;
    }
}
