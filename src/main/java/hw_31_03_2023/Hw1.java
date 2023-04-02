package hw_31_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Hw1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Highload", "High", "Load", "Highload", "High"));
        String s = "High";

        int countEl = (int) list.stream()
                .filter(str -> str.equals(s))
                .count();
        System.out.println(countEl);
    }
}
