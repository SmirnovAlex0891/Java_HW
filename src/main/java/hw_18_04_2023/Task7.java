package hw_18_04_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Сгруппируйте список объектов по определенному полю, используя Java Stream API, и выполните определенную операцию на каждой группе.
 */
public class Task7 {
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

        itemList.stream()
                .collect(Collectors.groupingBy(ItemFofTask7::getName))
                .entrySet()
                .stream()
                .peek(e -> {
                    if(e.getKey().equals("Phone")) {
                        for (ItemFofTask7 it : e.getValue()) {
                            it.setPrice(it.getPrice() * 1.15);
                        }
                    }
                })
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

    }
}
class ItemFofTask7 {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public ItemFofTask7(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemFofTask7{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
