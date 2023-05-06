package hw_06_04_2023.TaskFunctionalInterfaceAndLambda;

/**
 * Напишите функциональный интерфейс для преобразования строки в верхний регистр.
 */
public class Hw1 {
    public static void main(String[] args) {
        ToUpperCase upperCase;
        upperCase = s -> s.toUpperCase();

        String s = "aaaaaaa";
        System.out.println(upperCase.up(s));
    }
}
interface ToUpperCase {
    String up(String s);
}
