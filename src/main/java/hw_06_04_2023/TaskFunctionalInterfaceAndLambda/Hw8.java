package hw_06_04_2023.TaskFunctionalInterfaceAndLambda;

import java.math.BigInteger;

/**
 * Напишите функциональный интерфейс для проверки, является ли число простым.
 */
public class Hw8 {
    public static void main(String[] args) {
        PrimeNum pn = x -> {
            BigInteger bigInteger = BigInteger.valueOf(x);
            boolean res = bigInteger.isProbablePrime((int) Math.log(x));
            return res;
        };

        int x = 15;
        System.out.println(pn.prime(x));
    }
}
interface PrimeNum {
    public boolean prime(int x);
}
