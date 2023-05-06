package hw_18_04_2023;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamTask2 {
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


        // Создать коллекцию наименований телефонов у которых цена более 10
        List<String> listPh = itemList.stream()
                .filter(e -> e.getName().equals("Phone") && e.getPrice() > 10)
                .map(Item::getName)
                .toList();
        System.out.println(listPh);
        // рассмотреть два варианта - с дублированием названий и уникальные называния

    }
}

class Item {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public Item(String name, double price) {
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

}
