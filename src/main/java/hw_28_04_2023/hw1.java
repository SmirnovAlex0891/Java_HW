package hw_28_04_2023;

/**
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '' where:
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * <p>
 * Example 1:
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * <p>
 * <p>
 * Example 2:
 * Input: s = "aa", p = "a*"
 * Output: true
 * Explanation: '' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 * <p>
 * <p>
 * Example 3:
 * Input: s = "ab", p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 * <p>
 * <p>
 * Попытайтесь реализовать обработку регулярного выражения вручную, без использования Pattern, Matcher и т.п.
 */
public class hw1 {
    public static void main(String[] args) {
        String s1 = "aa";
        String p1 = "a";
        System.out.println(matchesStr(s1, p1));
        String s2 = "aaaaaa";
        String p2 = "a*";
        System.out.println(matchesStr(s2, p2));
        String s3 = "ab";
        String p3 = ".*";
        System.out.println(matchesStr(s3, p3));

    }

    public static boolean matchesStr(String s, String pat) {
        int pointerPatFirst = 0;
        int pointerPatSecond = 0;
        for (int i = 0; i < s.length(); i++) {
            if (pointerPatSecond > pat.length() - 1) {
                return false;
            } else if (s.charAt(i) == pat.charAt(pointerPatSecond) || pat.charAt(pointerPatSecond) == '.') {
                pointerPatSecond++;
                continue;
            } else if (pat.charAt(pointerPatSecond) == '*') {
                if (s.charAt(i) == pat.charAt(pointerPatFirst) || pat.charAt(pointerPatFirst) == '.') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
