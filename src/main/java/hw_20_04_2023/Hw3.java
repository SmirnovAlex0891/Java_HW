package hw_20_04_2023;

import java.util.ArrayList;
import java.util.List;

/**
 * 10) Дан список объектов Book, содержащий информацию о книгах, включая название, автора и список тегов.
 * Необходимо получить список всех уникальных тегов
 */
public class Hw3 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Разрушенный трон", "Виктория Авеярд", "Фэнтези"));
        bookList.add(new Book("Доктор Шифр", "Рома Ньюман", "Фэнтези"));
        bookList.add(new Book("Затмение", "Рагнар Йонассон", "Детективы"));
        bookList.add(new Book("Голдфингер", "Ян Флеминг", "Детективы"));
        bookList.add(new Book("PHP и MySQL. Разработка веб-приложений (6-е издание)", "Денис Колисниченко", "Компьютерная литература"));
        bookList.add(new Book("Изучаем Arduino. Руководство для начинающих", "Паоло Аливерти", "Компьютерная литература"));
        bookList.add(new Book("История. Тысячелетие обмана", "Дмитрий Строгов", "История"));
        bookList.add(new Book("Об управлении дворцом", "Гинкмар Архиепископ Реймсский", "История"));

        List<String> uniqTags = bookList.stream()
                .map(Book::getTags)
                .distinct()
                .toList();
        System.out.println(uniqTags);
    }
}
class Book {
    private String name;
    private String author;
    private String tags;

    public Book(String name, String author, String tags) {
        this.name = name;
        this.author = author;
        this.tags = tags;
    }

    public String getTags() {
        return tags;
    }
}
