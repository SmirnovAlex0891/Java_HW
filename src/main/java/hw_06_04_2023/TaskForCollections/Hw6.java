package hw_06_04_2023.TaskForCollections;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 6 Создать PriorityQueue из 10 элементов типа Integer, добавить несколько элементов, извлечь минимальный элемент и вывести на экран.
 */
public class Hw6 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Arrays.asList(2, 4, 1, 5, 0, 6, 8, 9, 7, 3));
        int min = Integer.MAX_VALUE;
        for (Integer i : queue) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
