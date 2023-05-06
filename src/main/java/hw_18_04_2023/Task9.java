package hw_18_04_2023;

import java.util.ArrayList;
import java.util.List;

/**
 * Отобразите список объектов на новый список, применив к каждому объекту определенное преобразование, с использованием Java Stream API.
 */
public class Task9 {
    public static void main(String[] args) {
        List<ItemFofTask7> itemList = new ArrayList<>();
        itemList.add(new ItemFofTask7("Phone", 33.5));
        itemList.add(new ItemFofTask7("City", 14));
        itemList.add(new ItemFofTask7("Milk", 13));
        itemList.add(new ItemFofTask7("Phone", 43));
        itemList.add(new ItemFofTask7("Milk", 15));
        itemList.add(new ItemFofTask7("City", 1));
        itemList.add(new ItemFofTask7("Table", 30));
        itemList.add(new ItemFofTask7("Sun", 11));
        itemList.add(new ItemFofTask7("City", 14));
        itemList.add(new ItemFofTask7("Milk", 43));
        itemList.add(new ItemFofTask7("Phone", 31));

        List<ItemFofTask7> newItem = itemList.stream()
                .map(e -> new ItemFofTask7("New ".concat(e.getName()), e.getPrice() + 10))
                .toList();

        newItem.stream().forEach(System.out::println);
    }
}
