package hw_27_03_2023;

import org.apache.commons.lang3.StringUtils;

import java.util.ListIterator;
import java.util.Stack;

/**
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 * <p>
 * <p>
 * <p>
 * An integer x - Record a new score of x.
 * <p>
 * '+' - Record a new score that is the sum of the previous two scores.
 * <p>
 * 'D' - Record a new score that is the double of the previous score.
 * <p>
 * 'C' - Invalidate the previous score, removing it from the record.
 * Return the sum of all the scores on the record after applying all the operations.
 */
public class Hw1 {
    public static void main(String[] args) {
        String[] arr = {"1", "C", "10", "D", "3", "D", "+", "20"};
        System.out.println(gameScore(arr));
    }

    private static int gameScore(String[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (String s : arr) {
            if (StringUtils.isNumeric(s)) {
                stack.push(Integer.parseInt(s));
            } else if (s.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("+")) {
                ListIterator<Integer> it = stack.listIterator(stack.size());
                int temp = 0;
                int sum = 0;
                while (temp < 2 && it.hasPrevious()) {
                    sum += it.previous();
                    temp++;
                }
                stack.push(sum);
            }
        }
        int sum = 0;
        for (Integer x : stack) {
            sum += x;
        }
        return sum;
    }
}

