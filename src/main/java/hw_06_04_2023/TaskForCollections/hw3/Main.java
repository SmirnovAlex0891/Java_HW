package hw_06_04_2023.TaskForCollections.hw3;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 3 Создать множество LinkedHashSet и добавить в него несколько объектов класса Person, у которых есть свойства name и age.
 *   Затем перебрать все элементы множества и вывести на консоль только тех людей, возраст которых меньше 30 лет.
 */
public class Main {
    public static void main(String[] args) {
        Set<Person> set = new LinkedHashSet<>();
        set.add(new Person("Bob", 29));
        set.add(new Person("Pol", 30));
        set.add(new Person("Helen", 21));
        set.add(new Person("Nik", 31));
        set.add(new Person("Jack", 24));
        set.add(new Person("Lisa", 25));

        for (Person p : set) {
            if (p.getAge() <30) {
                System.out.println(p);
            }
        }

//        set.stream()
//                .filter(person -> person.getAge() < 30)
//                .forEach(System.out::println);
    }
}
