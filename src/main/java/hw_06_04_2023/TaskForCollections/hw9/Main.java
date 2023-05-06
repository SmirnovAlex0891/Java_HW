package hw_06_04_2023.TaskForCollections.hw9;

import java.util.*;

/**
 * 9 Создать отображение HashMap, где ключом является объект класса Country, а значением - список строк
 *   (названия городов в этой стране). Затем добавить несколько городов для каждой страны и вывести
 *   все страны на консоль в алфавитном порядке.
 */
public class Main {
    public static void main(String[] args) {
        Map<Country, List<String>> map = new HashMap<>();
        Country c1 = new Country("USA");
        Country c2 = new Country("Poland");
        Country c3 = new Country("France");

        map.put(c1, new ArrayList<>(Arrays.asList("LA", "NY", "Washington")));
        map.put(c2, new ArrayList<>(Arrays.asList("Warsaw", "Lodz", "Gdansk")));
        map.put(c3, new ArrayList<>(Arrays.asList("Paris", "Marseilles", "Brest")));

        List<String> countrys = new ArrayList<>();
        for (Map.Entry<Country, List<String>> entry : map.entrySet()) {
            countrys.add(entry.getKey().getName());
        }
        Collections.sort(countrys);
        for (String s : countrys) {
            for (Map.Entry<Country, List<String>> e : map.entrySet()) {
                if (e.getKey().getName().equals(s)) {
                    System.out.println(e.getKey().getName() + " : " + e.getValue());
                }
            }
        }
    }
}
