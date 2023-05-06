package hw_06_04_2023.TaskForCollections;

import java.util.Map;
import java.util.TreeMap;

/**
 * 9 Создать TreeMap, где ключом является число типа Integer, а значением - его факториал. Вывести на экран все элементы TreeMap.
 */
public class Hw9 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, factorial(i));
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
    public static int factorial(int x) {
        int tmp = 1;
        while (x > 1) {
            tmp *= x;
            x--;
        }
        return tmp;
    }
}
