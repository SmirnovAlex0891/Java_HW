package hw_06_04_2023.TaskFunctionalInterfaceAndLambda;

/**
 * Напишите функциональный интерфейс для вычисления суммы двух целых чисел.
 */
public class Hw2 {
    public static void main(String[] args) {
        TwoNumber sumNum;
        sumNum = (a, b) -> a + b;

        System.out.println(sumNum.sum(12, 22));
    }
}
interface TwoNumber {
    int sum(int a, int b);
}
