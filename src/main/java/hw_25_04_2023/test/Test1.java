package hw_25_04_2023.test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer, List<String>> mapHistory1 = new HashMap<>();
        mapHistory1.put(21, new ArrayList<>(Arrays.asList("Milk", "Apples", "Bread")));
        Map<Integer, List<String>> mapHistory2 = new HashMap<>();
        mapHistory2.put(15, new ArrayList<>(Arrays.asList("Meat", "Flour", "Bread")));
        Map<Integer, List<String>> mapHistory3 = new HashMap<>();
        mapHistory3.put(10, new ArrayList<>(Arrays.asList("Milk", "Flour", "Fish")));
        Map<Integer, List<String>> mapHistory4 = new HashMap<>();
        mapHistory4.put(35, new ArrayList<>(Arrays.asList("Oranges", "Apples", "Fish")));
        CustomerPurHistory history1 = new CustomerPurHistory("Jack", mapHistory1);
        CustomerPurHistory history2 = new CustomerPurHistory("Jonn", mapHistory2);
        CustomerPurHistory history3 = new CustomerPurHistory("Pol", mapHistory3);
        CustomerPurHistory history4 = new CustomerPurHistory("Adam", mapHistory4);
        List<CustomerPurHistory> list = new ArrayList<>(Arrays.asList(history1, history2, history3, history4));

        list.stream()
                .flatMap(e -> e.getHistory().entrySet().stream())
                .filter(x -> x.getKey() < 30)
                .flatMap(e -> e.getValue().stream())
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
}
class CustomerPurHistory {
    private String customerName;
    private Map<Integer, List<String>> history;

    public CustomerPurHistory(String customerName, Map<Integer, List<String>> history) {
        this.customerName = customerName;
        this.history = history;
    }

    public Map<Integer, List<String>> getHistory() {
        return history;
    }
}
