package hw_06_04_2023.TaskForCollections.hw4;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 4 Создать очередь PriorityQueue и добавить в нее несколько элементов, у которых есть свойства name и priority.
 *   Затем извлечь элементы из очереди в порядке приоритета и вывести их на консоль.
 */
public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>();
        queue.add(new Person("Bob", 6));
        queue.add(new Person("Pol", 3));
        queue.add(new Person("Helen", 1));
        queue.add(new Person("Nik", 4));
        queue.add(new Person("Jack", 2));
        queue.add(new Person("Lisa", 5));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
