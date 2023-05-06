package hw_06_04_2023.TaskFunctionalInterfaceAndLambda;

/**
 * Напишите функциональный интерфейс для вычисления корня квадратного из числа.
 */
public class Hw7 {
    public static void main(String[] args) {
        SQRT sqrtInt = Math::sqrt;

        int a = 121;
        System.out.println(sqrtInt.sqrt(a));
    }
}
interface SQRT {
    public double sqrt(int x);
}
