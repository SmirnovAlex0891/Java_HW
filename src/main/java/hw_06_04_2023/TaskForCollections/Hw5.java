package hw_06_04_2023.TaskForCollections;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * 5 Создать TreeMap, где ключом является строка, а значением - ее длина. Вывести на экран все элементы TreeMap.
 */
public class Hw5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            String tmp = Gen.generate();
            map.put(tmp, tmp.length());
        }

        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
class Gen {
    public static String generate() {
        Random random = new Random();
        int i = random.nextInt(1,10);
        String s = "";
        while (i > 0) {
            s += (char)random.nextInt(97, 122);;
            i--;
        }
        return s;
    }
}
