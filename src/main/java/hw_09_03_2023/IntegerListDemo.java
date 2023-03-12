package hw_09_03_2023;
/**
 * 1) В классе IntegerListDemo создайте список целых чисел.
 * Продемонстрируйте как:
 * добавить в список элемент (в начало и в конец)
 * узнать длину списка
 * удалить элемент из списка (по индексу и без)
 * узнать пустой список или нет
 * обойти список и вывести на консоль каждый элемент.
 */

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 4, 6, 2, 4, 8, 77, 12, 9));
        System.out.println(list);
        list.add(0, 100);
        list.add(999);
        System.out.println("After add elements: " + list);
        System.out.println("Length of list:  " + list.size());
        list.remove(0);

        list.remove((Integer) (999));
        System.out.println("After remove elements: " + list);
        System.out.println("Empty list or not: " + list.isEmpty());
        System.out.print("List: ");
        for (Integer el : list) {
            System.out.print(el + ", ");
        }
    }
}
