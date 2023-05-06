package hw_06_04_2023.TaskForCollections.hw6;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 6 Создать множество TreeSet и добавить в него несколько объектов класса Point, у которых есть свойства x и y.
 * Затем перебрать все элементы множества и вывести на консоль только те точки, у которых x > y.
 */
public class Main {
    public static void main(String[] args) {
        Set<Point> set = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(new Point(random.nextInt(100), random.nextInt(100)));
        }
        System.out.println(set + "\n");

        for (Point p : set) {
            if (p.getX() > p.getY()) {
                System.out.println(p);
            }
        }
    }
}
