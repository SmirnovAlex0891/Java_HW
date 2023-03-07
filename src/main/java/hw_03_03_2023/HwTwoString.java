package hw_03_03_2023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Пусть дан ArrayList нечетной длины. Используя только Iterator (не прибегая к индексам и длине списка),
 * вывести на экран элемент, находящийся ровно посередине списка.
 * Example 1:
 * Input: list = [1,2,4]
 * Output: 2
 * Example 2:
 * Input: list = [1,2,3,4,5]
 * Output: 3
 * Example 3:
 * Input: list = [1]
 * Output: 1
 */
public class HwTwoString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c", "d", "e"));

        String a1 = "";
        a1 = a1 + "b";
        String a2 = "";
        a2 = a2 + "a";

        list.add(a1);
        list.add(a2);
        System.out.println(list);
        printMiddleElement(list);
    }

    public static void printMiddleElement(List<String> list) {
        Iterator<String> itS = list.iterator();
        ListIterator<String> itF = list.listIterator(list.size());

        while (itS.hasNext() && itF.hasPrevious()) {
            if (itS.next() == itF.previous()) {
                System.out.println(itF.next());
            }
        }
    }
}
