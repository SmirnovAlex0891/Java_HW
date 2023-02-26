package Hw_24_02_2023;

import java.util.Arrays;

public class Hw2 {
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
