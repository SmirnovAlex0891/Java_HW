package hw_05_05_2023;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 2. Given a string containing just the characters '(' and ')',
 * return the length of the longest valid (well-formed) parentheses substring.
 * <p>
 * Example 1:
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 * <p>
 * <p>
 * Example 2:
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 * <p>
 * <p>
 * Example 3:
 * Input: s = ""
 * Output: 0
 */
public class Hw1 {
    public static void main(String[] args) {
        System.out.println(maxCorr(")())"));
        System.out.println(maxCorr(")()())"));
        System.out.println(maxCorr("(()(())()"));
        System.out.println(maxCorr(")()((((()"));
        System.out.println(maxCorr(")("));
        System.out.println(maxCorr(""));
    }

    public static int maxCorr(String s) {
        List<Character> listCh = new ArrayList<>();
        int res = 0;
        Character ch = '(';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                listCh.add(ch);
            }
            if (s.charAt(i) == ')' && listCh.contains(ch)) {
                res = res + 2;
                listCh.remove(ch);
            }
        }
        return res;
    }
}
