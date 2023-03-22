package hw_16_02_2023.hw_16_03_2023;

import java.util.LinkedList;
import java.util.List;

/**
 * Написать метод, который принимает на вход два списка (LinkedList) и возвращает
 * новый список, состоящий только из элементов, которые есть в обоих списках.
 */
public class hw5 {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>(List.of("aaa", "bbb", "ccc", "ddd"));
        List<String> list2 = new LinkedList<>(List.of("aaa", "ggg", "bbb", "fff", "hhh", "ccc"));

        System.out.println(elementsOfBothLists(list1, list2));
    }

    public static List<String> elementsOfBothLists(List<String> l1, List<String> l2) {
        List<String> tmp = new LinkedList<>();
        for (String s : l1) {
            if (l2.contains(s)) {
                tmp.add(s);
            }
        }
        return tmp;
    }
}
