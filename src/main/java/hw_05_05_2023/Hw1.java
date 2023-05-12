package hw_05_05_2023;

import java.util.ArrayList;
import java.util.List;
/**
 * Task 2. Given a string containing just the characters '(' and ')',
 * return the length of the longest valid (well-formed) parentheses substring.
 *
 * Example 1:
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 *
 *
 * Example 2:
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 *
 *
 * Example 3:
 * Input: s = ""
 * Output: 0
 */
public class Hw1 {
    public static void main(String[] args) {
        String s = ")())";
        String s2 = ")()())";
        String s3 = "(()(())()";
        System.out.println(maxCorr(")()((((()"));
    }

    public static int maxCorr(String s) {
        List<Character> listCh = new ArrayList<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                listCh.add(s.charAt(i));
            }
            if (s.charAt(i) == ')' && listCh.contains('(')) {
                Character ch = '(';
                res = res + 2;
                listCh.remove(ch);
            }
        }
        return res;
    }
}
