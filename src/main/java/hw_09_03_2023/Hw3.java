package hw_09_03_2023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int temp;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
            temp = list.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Working hours: " + (finish - start));

        System.out.println("-------перебрать for-each loop-------");
        start = System.currentTimeMillis();
        for (Integer el : list) {
            temp = el;
        }
        finish = System.currentTimeMillis();
        System.out.println("Working hours: " + (finish - start));

        System.out.println("-------classic for и вызываем list.size() для каждой итерации-------");
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("Working hours: " + (finish - start));

        System.out.println("-------classic for, но list.size() определяем в переменную-------");
        int size = list.size();
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            temp = list.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("Working hours: " + (finish - start));

        System.out.println("-------classic for, list.size() определяем в переменную, перебираем с конца (i--)-------");
        int size2 = list.size() - 1;
        start = System.currentTimeMillis();
        for (int i = size2; i >= 0; i--) {
            temp = list.get(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("Working hours: " + (finish - start));

        System.out.println("-------Itertor-------");
        Iterator<Integer> it = list.iterator();
        start = System.currentTimeMillis();
        while (it.hasNext())
            temp = it.next();
        finish = System.currentTimeMillis();
        System.out.println("Working hours: " + (finish - start));

        System.out.println("-------ListIterator-------");
        Iterator<Integer> listIt = list.listIterator();
        start = System.currentTimeMillis();
        while (listIt.hasNext())
            temp = listIt.next();
        finish = System.currentTimeMillis();
        System.out.println("Working hours: " + (finish - start));
    }
}
