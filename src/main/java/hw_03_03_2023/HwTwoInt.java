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
public class HwTwoInt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 2, 1));
        System.out.println(list);
        printMiddleElement(list);
    }

    public static void printMiddleElement(List<Integer> list) {
        List<Integer> listForMethod = new ArrayList<>(list);
        Iterator<Integer> itS = listForMethod.iterator();
        ListIterator<Integer> itF = listForMethod.listIterator(listForMethod.size());

        while (itS.hasNext() && itF.hasPrevious()) {
            int tmp = itS.next();
            if (tmp == itF.previous() && !itS.hasNext() && !itF.hasPrevious()) {
                System.out.println(tmp);
            } else {
                itS.remove();
                itF = listForMethod.listIterator(listForMethod.size());
                itF.previous();
                itF.remove();
                itS = listForMethod.iterator();
                itF = listForMethod.listIterator(listForMethod.size());
            }
        }
    }
}
