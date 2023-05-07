package hw_21_04_2023;

import java.util.List;

class Reader {
    private String fullName;
    private String emailAddress;
    private boolean consentToMailing;
    private List<Book> bookList;

    public Reader(String fullName, String emailAddress, boolean consentToMailing, List<Book> bookList) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.consentToMailing = consentToMailing;
        this.bookList = bookList;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public boolean isConsentToMailing() {
        return consentToMailing;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", consentToMailing=" + consentToMailing +
                ", bookList=" + bookList +
                '}';
    }
}
