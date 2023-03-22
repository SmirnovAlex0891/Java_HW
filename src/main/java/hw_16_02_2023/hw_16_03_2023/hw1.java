package hw_16_02_2023.hw_16_03_2023;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Написать метод, который принимает на вход список (LinkedList) строк и возвращает
 * новый список, состоящий только из уникальных значений из первоначального списка.
 */
public class hw1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("ccc");
        list.add("bbb");
        list.add("aaa");
        System.out.println(uniqueStr(list));
    }

    public static List<String> uniqueStr(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        List<String> nList = new LinkedList<>();
        nList.addAll(set);
        return nList;
    }
}
