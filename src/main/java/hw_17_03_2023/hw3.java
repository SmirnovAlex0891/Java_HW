package hw_17_03_2023;

import java.util.HashMap;
import java.util.Map;

/**
 * Task 3. Дана строка. Вывести количество появлений каждого символа в этой строке.
 */
public class hw3 {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                " Integer eu feugiat tellus. Nam molestie diam sed" +
                " libero egestas pellentesque. Nulla.";

        everyCharacter(s);
    }
    public static void everyCharacter(String s) {
        char[] tmp = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : tmp) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println("Символ " + e.getKey() + " встречается " + e.getValue() + " раз.");
        }
    }
}
