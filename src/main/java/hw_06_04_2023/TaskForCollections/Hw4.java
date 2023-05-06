package hw_06_04_2023.TaskForCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 4 Создать HashSet, добавить в него несколько строк и проверить, содержит ли он определенную строку.
 */
public class Hw4 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("aa", "ee", "ff", "gg", "rr", "ss", "ii", "tt", "pp", "uu"));
        System.out.println(set.contains("gg"));
    }
}
