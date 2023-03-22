package hw_16_02_2023.hw_16_03_2023;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Создать множество HashSet и вывести элементы, у которых длина строки больше 5 символов:
 */
public class hw3 {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                " Integer eu feugiat tellus. Nam molestie diam sed" +
                " libero egestas pellentesque. Nulla.";
        lengthWord(s);
    }

    public static void lengthWord(String s) {
        String[] str = s.split("([,]\s)|([.]\s)|(\s)|([.])");
        Set<String> set = new HashSet<>(Arrays.asList(str));
        for (String tmp : set) {
            if (tmp.length() > 5)
                System.out.println(tmp);
        }
    }
}
