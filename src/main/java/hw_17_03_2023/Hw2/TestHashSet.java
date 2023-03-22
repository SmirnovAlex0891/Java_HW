package hw_17_03_2023.Hw2;

import java.util.HashSet;

/**
 * Task 2. Что выведет фрагмент кода? Объяснить.
 * Результат будет 4, т.к. хэш-коды у p2 и p4 разные,
 * а уникальность элементов в HashSet определяется по хэш-коду
 * и т.к. это разные образцы класса Person хэш-коды по умолчанию разные (стр. 22)
 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        Person p1 = new Person("Иван");
        Person p2 = new Person("Мария");
        Person p3 = new Person("Пётр");
        Person p4 = new Person("Мария");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(p2.hashCode() + " " + p4.hashCode());
        System.out.print(set.size());
    }
}
