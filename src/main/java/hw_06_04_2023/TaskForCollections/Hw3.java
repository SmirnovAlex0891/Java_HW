package hw_06_04_2023.TaskForCollections;

import java.util.HashMap;
import java.util.Map;

/**
 * 3 Создать HashMap, где ключом является число типа Integer, а значением - его квадрат. Вывести на экран все элементы HashMap.
 */
public class Hw3 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < 11; i++) {
            map.put(i, i * i);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
