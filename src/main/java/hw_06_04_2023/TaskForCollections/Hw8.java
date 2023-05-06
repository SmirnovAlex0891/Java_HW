package hw_06_04_2023.TaskForCollections;

import java.util.ArrayDeque;

/**
 * 8 Создать ArrayDeque, добавить в него несколько элементов с каждой стороны, извлечь элементы с одной из сторон и вывести на экран.
 */
public class Hw8 {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();

        queue.add("dd");
        queue.add("ff");
        queue.add("gg");
        queue.addFirst("aa");
        queue.addFirst("bb");
        queue.addFirst("cc");

        while (!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }

    }
}
