package hw_06_04_2023.TaskFunctionalInterfaceAndLambda;

/**
 * Напишите функциональный интерфейс для проверки, является ли строка палиндромом.
 */
public class Hw3 {
    public static void main(String[] args) {
        TestPal strPal = str -> {
            char[] tmp = str.toCharArray();
            int first = 0;
            int last = tmp.length - 1;
            while (first < last) {
                if (tmp[first] != tmp[last]) return false;
                first++;
                last--;
            }
            return true;
        };

        String s = "madam";
        System.out.println(strPal.test(s));
    }
}
interface TestPal {
    boolean test(String s);
}
