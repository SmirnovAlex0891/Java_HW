package hw_06_04_2023.TaskFunctionalInterfaceAndLambda;

/**
 * Напишите функциональный интерфейс для сравнения двух строк на основе их длины.
 */
public class Hw6 {
    public static void main(String[] args) {
        TwoString ts = (s1, s2) -> {
            if (s1.length() > s2.length()) return true;
            else return false;
        };

        String s1 = "aaaaaa";
        String s2 = "bbbb";
        boolean isFirst = ts.twoStr(s1, s2);
        System.out.println(isFirst);
    }
}
interface TwoString {
    public boolean twoStr(String s1, String s2);
}
