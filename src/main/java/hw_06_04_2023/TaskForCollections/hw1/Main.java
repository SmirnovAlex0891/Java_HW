package hw_06_04_2023.TaskForCollections.hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1 Создать класс Student со свойствами name и grade (оценка), затем создать список ArrayList,
 * заполнить его несколькими объектами Student и отсортировать список по оценке в порядке убывания.
 */
public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Adam", 8));
        list.add(new Student("Pol", 6));
        list.add(new Student("Nik", 9));
        list.add(new Student("Helen", 7));
        list.add(new Student("Bob", 5));

        System.out.println(list);
        Collections.sort(list);
        System.out.println("*********** After sort *************");
        System.out.println(list);
    }
}
