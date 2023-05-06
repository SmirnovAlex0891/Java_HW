package hw_06_04_2023.TaskForCollections.hw7;

import java.sql.Time;
import java.util.*;

/**
 * 7 Создать отображение LinkedHashMap, где ключом является объект Time (время), а значением - список строк.
 *   Затем добавить несколько строк в список для каждого времени и вывести все элементы отображения на консоль в порядке возрастания времени.
 */
public class Main {
    public static void main(String[] args) {
        Map<Time, List<String>> map = new LinkedHashMap<>();
        Random random = new Random();
        for (int i = 5; i >= 1; i--) {
            map.put(new Time(21, i * 2, 0), new ArrayList<>(Arrays.asList(Gen.generate(), Gen.generate(), Gen.generate())));
        }

        for (Map.Entry<Time, List<String>> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println("************************************");
        List<Time> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (Time t : list) {
            System.out.println(t + " : " + map.get(t));
        }
    }
}
class Gen {
    public static String generate() {
        Random random = new Random();
        int i = random.nextInt(1, 10);
        String s = "";
        while (i > 0) {
            s += (char) random.nextInt(97, 122);
            i--;
        }
        return s;
    }
}