package j110.lab1.Books;

public class Main {
    public static void main(String[] args) {
        Book.printAll();
        Book.booksArr[1].getPublisher().setCity("Санкт-Петербург");
        Book.printAll(); // опечатка в названии города издательства "БХВ" исправлена через сеттер класса Publisher
    }
}