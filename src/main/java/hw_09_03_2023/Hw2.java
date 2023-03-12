package hw_09_03_2023;

import java.util.*;

/**
 * Могут ли реализации интерфейса java.util.List хранить одинаковые
 * элементы (дубликаты)? Напишите код программы, который демонстрирует ответ на этот вопрос.
 */
public class Hw2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(0, 0, 0, 1, 1, 1, 2, 2, 2));
        System.out.println("arrayList: " + arrayList);
        List<Integer> linkedList = new LinkedList<>(List.of(0, 0, 0, 1, 1, 1, 2, 2, 2));
        System.out.println("linkedList: " + linkedList);
        List<Integer> vector = new Vector<>(List.of(0, 0, 0, 1, 1, 1, 2, 2, 2));
        System.out.println("vector: " + vector);
        List<Integer> stack = new Stack<>();
        stack.addAll(arrayList);
        System.out.println("stack: " + stack);
    }
}
