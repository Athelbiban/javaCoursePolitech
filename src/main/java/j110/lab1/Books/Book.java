package j110.lab1.Books;

import java.util.Arrays;

public class Book {
    private String name;
    private Publisher publisher;
    private int year;
    private String[] authors;
    static Book[] booksArr = new Book[5];

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

    public static void dataVerification(String data) {
        if (data.isEmpty()) throw new IllegalArgumentException("IllegalArgumentException: string not be empty");
    }
    public static void dataVerification(int data) {
        if (data <= 0) throw new IllegalArgumentException("IllegalArgumentException: number must be > 0");
    }
    public static void dataVerification(String[] data) {
        if (data.length != 0) {
            for (String str : data) {
                dataVerification(str);
            }
        }
        else {
            throw new IllegalArgumentException("IllegalArgumentException: array must not be empty");
        }
    }
    public static void dataVerification(Publisher publisher) {
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
        if (booksArr[0] == null) {
            Publisher publisher1 = new Publisher("Проспект", "Москва");
            Publisher publisher2 = new Publisher("Питер", "Санкт-Петербург");
            Publisher publisher3 = new Publisher("БХВ", "Санкт-Петебург");
            Publisher publisher4 = new Publisher("Диалектика", "Киев");

            String[] authorsArr1 = {"Седжвик Роберт", "Уэйн Кевин"};
            String[] authorsArr2 = {"Вигерс Карл"};
            String[] authorsArr3 = {"Шилдт Герберт"};
            String[] authorsArr4 = {"Полубенцева М.И."};

            Book book1 = new Book("Computer Science: основы программирования на Java," +
                    "ООП, алгоритмы и структуры данных", authorsArr1, 2018, publisher2);
            Book book2 = new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное",
                    authorsArr2, 2019, publisher3);
            Book book3 = new Book("Полное руководство, 10-е издание", authorsArr3, 2018, publisher4);
            Book book4 = new Book("C/C++. Процедурное программирование", authorsArr4, 2017, publisher3);
            Book book5 = new Book("Конституция РФ", 2020, publisher1);

            Book.booksArr[0] = book1;
            Book.booksArr[1] = book2;
            Book.booksArr[2] = book3;
            Book.booksArr[3] = book4;
            Book.booksArr[4] = book5;
        }

        for (Book book : booksArr) {
            book.print();
        }
    }
}