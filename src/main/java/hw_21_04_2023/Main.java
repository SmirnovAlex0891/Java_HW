package hw_21_04_2023;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Необходимо смоделировать библиотеку. Для каждой книги библиотечного фонда известны автор, название и год издания.
 * Для читателя библиотеки будем хранить ФИО и электронный адрес (объекты типа EmailAddress).
 * Каждый читатель может взять в библиотеке одну или несколько книг - их тоже сохраним.
 * Ещё нам понадобится флаг читательского согласия на уведомления по электронной почте.
 * Рассылки организуют сотрудники библиотеки: напоминают о сроке возврата книг, сообщают новости.
 * Разработайте соответствующие классы.
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        /**
         * Task 1. Получить список всех книг библиотеки, отсортированных по году издания.
         */
        List<Book> sortedList = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getYear))
                .toList();
        System.out.println(sortedList);
        System.out.println("*************************************");

        /**
         * Task 2. Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
         * При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
         */
        List<EmailAddress> emailsList = library.getReaders().stream()
                .map(Reader::getEmailAddress)
                .map(EmailAddress::new)
                .toList();
        System.out.println(emailsList);
        System.out.println("*************************************");

        /**
         * Task 3. Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей,
         * которые согласились на рассылку. Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
         */

        List<EmailAddress> emailList2 = library.getReaders().stream()
                .filter(Reader::isConsentToMailing)
                .filter(r -> r.getBookList().size() > 1)
                .map(Reader::getEmailAddress)
                .map(EmailAddress::new)
                .toList();
        System.out.println(emailList2);
        System.out.println("*************************************");

        /**
         * Task 4. Получить список всех книг, взятых читателями. Список не должен содержать дубликатов
         * (книг одного автора, с одинаковым названием и годом издания).
         */
        List<Book> bookList = library.getReaders().stream()
                .flatMap(r -> r.getBookList().stream())
                .distinct()
                .toList();
        System.out.println(bookList);
        System.out.println("*************************************");

        /**
         * Task 5. Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Оруэлла.
         */
        List<Reader> readerList = library.getReaders().stream()
                .filter(r -> {
                    return r.getBookList().stream()
                            .anyMatch(b -> b.getAuthor().equals("Джордж Оруэлл"));
                })
                .toList();
        System.out.println(readerList);

        boolean match = library.getReaders().stream()
                .flatMap(r -> r.getBookList().stream())
                .anyMatch(b -> b.getAuthor().equals("Джордж Оруэлл"));
        System.out.println(match);
        System.out.println("*************************************");

        /**
         * Task 6. Узнать наибольшее число книг, которое сейчас на руках у читателя.
         */
        int maxNumBook = library.getReaders().stream()
                .map(r -> r.getBookList().size())
                .max(Comparator.comparingInt(e -> e))
                .orElse(-1);
        System.out.println(maxNumBook);
        System.out.println("*************************************");

        /**
         * Task 7*. Вернёмся к нашим email-рассылкам. Теперь нужно не просто отправить письма всем,
         * кто согласился на рассылку, — будем рассылать разные тексты двум группам:
         */
        Map<String, List<EmailAddress>> map = library.getReaders().stream()
                .filter(Reader::isConsentToMailing)
                .collect(Collectors.groupingBy(r -> r.getBookList().size() > 2 ? "too_match" : "ok",
                        Collectors.mapping(r -> new EmailAddress(r.getEmailAddress()),
                                Collectors.toList())));
        for (Map.Entry<String, List<EmailAddress>> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
