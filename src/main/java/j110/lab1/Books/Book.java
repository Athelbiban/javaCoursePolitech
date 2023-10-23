package j110.lab1.Books;

import java.util.Arrays;

public class Book {
    private String name;
    private Publisher publisher;
    private int year;
    private String[] authors;
    static Book[] booksArr = new Book[5];

    public static void main(String[] args) {
        Publisher publisher1 = new Publisher("Проспект", "Москва");
        Publisher publisher2 = new Publisher("Питер", "Санкт-Петербург");
        Publisher publisher3 = new Publisher("БХВ", "Санкт-Петебург");
        Publisher publisher4 = new Publisher("Диалектика", "Киев");

        String[] book1Authors = {"Седжвик Роберт", "Уэйн Кевин"};
        String[] book2Authors = {"Вигерс Карл"};
        String[] book3Authors = {"Шилдт Герберт"};
        String[] book4Authors = {"Полубенцева М.И."};

        Book book1 = new Book("Computer Science: основы программирования на Java," +
                "ООП, алгоритмы и структуры данных", book1Authors, 2018, publisher2);
        Book book2 = new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное",
                book2Authors, 2019, publisher3);
        Book book3 = new Book("Полное руководство, 10-е издание", book3Authors, 2018, publisher4);
        Book book4 = new Book("C/C++. Процедурное программирование", book4Authors, 2017, publisher3);
        Book book5 = new Book("Конституция РФ", 2020, publisher1);
        booksArr[0] = book1;
        booksArr[1] = book2;
        booksArr[2] = book3;
        booksArr[3] = book4;
        booksArr[4] = book5;

        printAll();
    }

    Book(String name, int year, Publisher publisher) {
        setName(name);
        setYear(year);
        setPublisher(publisher);
    }
    Book(String name, String author, int year, Publisher publisher) {
        setName(name);
        String[] tempAuthors = {author};
        setAuthors(tempAuthors);
        setYear(year);
        setPublisher(publisher);
    }
    Book(String name, String[] authors, int year, Publisher publisher) {
       setName(name);
       setAuthors(authors);
       setYear(year);
       setPublisher(publisher);
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

    static void dataVerification(String data) {
        if (data.isEmpty()) throw new IllegalArgumentException("IllegalArgumentException: string not be empty");
    }
    static void dataVerification(int data) {
        if (data <= 0) throw new IllegalArgumentException("IllegalArgumentException: number must be > 0");
    }
    static void dataVerification(String[] data) {
        if (data.length != 0) {
            for (String str : data) {
                dataVerification(str);
            }
        }
        else {
            throw new IllegalArgumentException("IllegalArgumentException: array must not be empty");
        }
    }
    static void dataVerification(Publisher publisher) {
        if (publisher.getName() == null || publisher.getCity() == null) {
            throw new IllegalArgumentException("IllegalArgumentException: One of the attributes is an empty references");
        }
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

    public static void printAll() {
        for (Book book : booksArr) {
            book.print();
        }
    }
}

class Publisher {
    private String name;
    private String city;

    public String getName() { return name; }
    public String getCity() { return city; }

    public void setName(String name) {
        Book.dataVerification(name);
        this.name = name;
    }
    public void setCity(String city) {
        Book.dataVerification(city);
        this.city = city;
    }

    Publisher(String name, String city) {
        setName(name);
        setCity(city);
    }
}