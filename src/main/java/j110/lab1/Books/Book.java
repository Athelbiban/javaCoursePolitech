package j110.lab1.Books;

import java.util.Arrays;

public class Book {
    private String name;
    private Publisher publisher;
    private int year;
    private String[] authors;

    Book(String name, int year, Publisher publisher) {
        setName(name);
        setYear(year);
        setPublisher(publisher);
    }
    Book(String name, String author, int year, Publisher publisher) {
        this(name, year, publisher);
        String[] tempAuthors = {author};
        setAuthors(tempAuthors);
    }
    Book(String name, String[] authors, int year, Publisher publisher) {
        this(name, year, publisher);
        setAuthors(authors);
    }

    public String getName() { return name; }
    public Publisher getPublisher() { return publisher; }
    public int getYear() { return year; }
    public String[] getAuthors() { return authors; }
    public int getNumberAuthorsBook() { return authors.length; }
    public String getAuthorsByIndex(int index) { return authors[index]; }

    public void setName(String name) {
        dataVerification(name);
        this.name = name;
    }
     public void setPublisher(Publisher publisher) {
        dataVerification(publisher);
        this.publisher = publisher;
    }
    public void setYear(int year) {
        dataVerification(year);
        this.year = year;
    }
    public void setAuthors(String[] authors) {
        dataVerification(authors);
        this.authors = authors;
    }

    public static void dataVerification(String data) {
        if (data == null || data.isEmpty()) throw new IllegalArgumentException("IllegalArgumentException: string not be empty");
    }
    public static void dataVerification(int data) {
        if (data <= 0) throw new IllegalArgumentException("IllegalArgumentException: number must be > 0");
    }
    public static void dataVerification(String[] data) {
        if (data != null && data.length != 0) {
            for (String str : data) {
                dataVerification(str);
            }
        }
        else {
            throw new IllegalArgumentException("IllegalArgumentException: array must not be empty");
        }
    }
    public static void dataVerification(Publisher publisher) {
        if (publisher == null || publisher.getName() == null || publisher.getCity() == null) {
            throw new IllegalArgumentException("IllegalArgumentException: One of the attributes is an empty references");
        }
    }
    public static void dataVerification(Object[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("IllegalArgumentException: array must not be empty");
        }
    }
    // метод для j110/lab2/files/File.setSize()
    public static void dataVerification(long data) {
        if (data < 0) throw new IllegalArgumentException("IllegalArgumentException: number must be > 0");
    }

    public void print() {
        System.out.printf("Название: %s\n", name);
        if (authors == null) { System.out.printf("Год издания: %d\n", year); }
        else {
            System.out.printf("Автор(ы): %s\nГод издания: %d\n", Arrays.toString(authors)
                    .replace("[", "")
                    .replace("]", ""), year);
        }
        System.out.printf("Издательство: %s %s\n\n", publisher.getName(), publisher.getCity());
    }

    public static void printAll(Book[] booksArr) {
        dataVerification(booksArr);
        for (Book book : booksArr) {
            book.print();
        }
    }
}