package hw_16_02_2023.hw_16_03_2023.Hw7;

import com.github.javafaker.Faker;

import java.util.Set;
import java.util.TreeSet;

/**
 * Создать класс Book с полями title, author и price. Создать TreeSet с объектами класса Book
 * и отсортировать его по цене в порядке убывания
 */
public class hw7 {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        Faker faker = new Faker();
        for (int i = 0; i < 15; i++) {
            books.add(new Book("Title " + i, faker.name().fullName(), faker.number().numberBetween(150, 500)));
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
