package hw_17_03_2023;

import java.util.HashMap;
import java.util.Map;

/**
 *  Task 1. Given a string s, find the first non-repeating character
 *  in it and return its index. If it does not exist, return -1.
 */
public class hw1 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println("Index of unique letter: " + uniqueLetter(s));
    }
    public static int uniqueLetter(String s) {
        String[] tmp = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String str : tmp) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            if (map.get(tmp[i]) == 1) return i;
        }
        return -1;
    }
}
