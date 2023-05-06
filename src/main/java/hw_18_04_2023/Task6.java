package hw_18_04_2023;

import java.util.ArrayList;
import java.util.List;

/**
 * Отфильтруйте список объектов, исключив из него все объекты, не соответствующие определенному критерию, с использованием Java Stream API.
 */
public class Task6 {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("New", 33.5));
        itemList.add(new Item("City", 14));
        itemList.add(new Item("Window", 13));
        itemList.add(new Item("Phone", 43));
        itemList.add(new Item("Milk", 15));
        itemList.add(new Item("Bun", 1));
        itemList.add(new Item("Table", 30));
        itemList.add(new Item("Sun", 11));
        itemList.add(new Item("Door", 14));
        itemList.add(new Item("Paper", 43));
        itemList.add(new Item("Phone", 31));

        itemList.stream()
                .filter(e -> e.getPrice() < 15)
                .forEach(e -> System.out.println("name: " + e.getName() + ", price: "+ e.getPrice()));
    }
}
