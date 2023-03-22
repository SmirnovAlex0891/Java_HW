package hw_16_03_2023.Hw7;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;

    @Override
    public int compareTo(Book book) {
        return book.price - this.price;
    }
}
