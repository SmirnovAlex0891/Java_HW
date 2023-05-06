package hw_06_04_2023.TaskForCollections.hw2;

import java.util.*;

/**
 * 2 Создать отображение TreeMap, где ключом является объект Date (дата), а значением - список строк.
 * Затем добавить несколько строк в список для каждой даты и вывести все элементы отображения на консоль в порядке возрастания даты.
 */
public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        Map<Date, List<String>> map = new TreeMap<>();

        List<String> list1 = new ArrayList<>(Arrays.asList("aaa", "sss", "ddd"));
        List<String> list2 = new ArrayList<>(Arrays.asList("qqq", "www", "eee"));
        List<String> list3 = new ArrayList<>(Arrays.asList("rrr", "ttt", "yyy"));

        map.put(new Date(), list1);
        Thread.sleep(1000);
        map.put(new Date(), list2);
        Thread.sleep(1000);
        map.put(new Date(), list3);

        for (Map.Entry<Date, List<String>> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
