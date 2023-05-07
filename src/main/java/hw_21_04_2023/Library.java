package hw_21_04_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<>(Arrays.asList(new Book("Джордж Оруэлл", "1984", 2020),
                new Book("Джейн Остен", "Гордость и предубеждение", 2001),
                new Book("Ф. С. Фицджеральд", "Великий Гэтсби", 2005),
                new Book("Луиза Мэй Олкотт", "Маленькие женщины", 2010),
                new Book("Рэй Брэдбери", "451° по Фаренгейту", 2019)));
        this.readers = new ArrayList<>(Arrays.asList(new Reader("Pol", "pol@gmail.com", true, new ArrayList<>(Arrays.asList(books.get(0), books.get(4)))),
                new Reader("Bob", "bob@gmail.com", true, new ArrayList<>(Collections.singletonList(books.get(4)))),
                new Reader("Ann", "ann@gmail.com", false, new ArrayList<>(Arrays.asList(books.get(0), books.get(3)))),
                new Reader("Nik", "nik@gmail.com", true, new ArrayList<>(Collections.singletonList(books.get(1)))),
                new Reader("Jack", "jack@gmail.com", true, new ArrayList<>(Arrays.asList(books.get(2), books.get(3), books.get(4))))));
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
