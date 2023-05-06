package hw_06_04_2023.TaskStandartFunctionalInterface;

import java.util.*;
import java.util.function.Predicate;

/**
 * 2. Отфильтровать список строк, оставив только те, которые начинаются с определенной буквы, используя интерфейс Predicate:
 */
public class Hw2 {
    public static void main(String[] args) {
        Predicate<String> letter = el -> el.startsWith("A", 0);

        List<String> list = new LinkedList<>(Arrays.asList("Aaa", "Bbb", "Abb", "Caa"));

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!letter.test(it.next())) it.remove();
        }
        System.out.println(list);
    }
}
