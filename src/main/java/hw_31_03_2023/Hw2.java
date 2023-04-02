package hw_31_03_2023;

import java.util.function.Predicate;

public class Hw2 {
    public static void main(String[] args) {
        String s = "NOUNA";
        System.out.println(testSting(s));

    }

    public static boolean testSting(String s) {
        Predicate<Character> letJ = x -> x.equals('J');
        Predicate<Character> letN = x -> x.equals('N');
        Predicate<Character> letA = x -> x.equals('A');

        return letJ.test(s.charAt(0)) || letN.test(s.charAt(0)) && letA.test(s.charAt(s.length() - 1));
    }
}
