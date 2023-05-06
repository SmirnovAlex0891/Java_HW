package hw_25_04_2023.test;

import java.util.function.Supplier;

public class Test2 {
    public static void main(String[] args) {
        int a = -5;
        int b = -3;
        MathMethod.mult(a, b);
        MathMethod.sum(a);
        MathMethod.div(a);
        MathMethod.cube(a);
        MathMethod.abs(a);
    }
}

class MathMethod {

    static void mult(int a, int b) {
        Supplier<Integer> supplier = () -> {
            return a * b;
        };
        System.out.println(supplier.get());
    }

    static void sum(int a) {
        Supplier<Integer> supplier = () -> {
            return a * 3 + 5;
        };
        System.out.println(supplier.get());
    }

    static void div(int a) {
        Supplier<Double> supplier = () -> {
            return (double) 1 / a;
        };
        System.out.println(supplier.get());
    }

    static void cube(int a) {
        Supplier<Double> supplier = () -> {
            return Math.pow(a, 3);
        };
        System.out.println(supplier.get());
    }

    static void abs(int a) {
        Supplier<Integer> supplier = () -> {
            return Math.abs(a);
        };
        System.out.println(supplier.get());
    }
}
