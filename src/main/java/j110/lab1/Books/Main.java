package j110.lab1.Books;

public class Main {
    public static void main(String[] args) {

        Book[] booksArr = new Book[5];

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

        booksArr[0] = book1;
        booksArr[1] = book2;
        booksArr[2] = book3;
        booksArr[3] = book4;
        booksArr[4] = book5;

        Book.printAll(booksArr);
        booksArr[1].getPublisher().setCity("Санкт-Петербург");
        Book.printAll(booksArr); // опечатка в названии города издательства "БХВ" исправлена через сеттер класса Publisher
    }
}