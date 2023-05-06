package hw_06_04_2023.TaskForCollections.hw5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 5 Создать класс Book со свойствами title, author и year (год издания), затем создать список LinkedList, заполнить
 * его несколькими объектами Book и удалить из списка все книги, которые были изданы до 2000 года.
 */
public class Main {
    public static void main(String[] args) {
        List<Book> list = new LinkedList<>();
        list.add(new Book("About 1", "Jack B.", 2001));
        list.add(new Book("About 2", "Pol G.", 1999));
        list.add(new Book("About 3", "Nik L.", 2010));
        list.add(new Book("About 4", "Bob M.", 1991));

        System.out.println(list);
        Iterator<Book> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getYear() < 2000) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
