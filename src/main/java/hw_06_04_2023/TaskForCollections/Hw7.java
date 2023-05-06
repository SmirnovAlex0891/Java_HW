package hw_06_04_2023.TaskForCollections;

import java.util.Arrays;
import java.util.Stack;

/**
 * 7 Создать Stack, добавить в него несколько элементов.
 * ПРоверить есть ли в коллекции заданный элемент.
 * Если есть,то найти его глубину и вывести на экран.
 */
public class Hw7 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("aa");
        stack.push("ff");
        stack.push("hh");
        stack.push("nn");
        stack.push("ee");
        stack.push("yy");

        System.out.println(stack.search("nn"));
    }
}
