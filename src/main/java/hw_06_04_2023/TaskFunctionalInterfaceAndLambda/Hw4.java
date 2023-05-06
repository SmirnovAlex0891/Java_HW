package hw_06_04_2023.TaskFunctionalInterfaceAndLambda;

/**
 * Напишите функциональный интерфейс для вычисления факториала числа.
 */
public class Hw4 {
    public static void main(String[] args) {
        Factorial factorial = x -> {
            int res = 1;
            for (int i = 1; i <= x; i++) {
                res = res * i;
            }
            return res;
        };

        System.out.println(factorial.factCalc(8));
    }
}
interface Factorial {
    int factCalc(int x);
}
