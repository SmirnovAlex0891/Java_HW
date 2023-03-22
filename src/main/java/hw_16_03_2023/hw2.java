package hw_16_03_2023;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Найти количество уникальных слов в тексте с помощью коллекции HashSet:
 */
public class hw2 {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                " Integer eu feugiat tellus. Nam molestie diam sed" +
                " libero egestas pellentesque. Nulla.";

        System.out.println(uniqueWord(s));
    }

    public static int uniqueWord(String s) {
        String[] str = s.split("([,]\s)|([.]\s)|(\s)|([.])");
        Set<String> set = new HashSet<>(Arrays.asList(str));
        return set.size();
    }
}
