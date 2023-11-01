package j110.lab2.files;

import j110.lab1.Books.Book;

public class Document extends File {
    private String format;
    private int countPage;

    public Document(String fileName, long size, String format, int countPage) {
        super(fileName, size);
        this.format = format;
        this.countPage = countPage;
    }

    public String getFormat() { return format; }
    public int getCountPage() { return countPage; }

    public void setFormat(String format) {
        Book.dataVerification(format);
        this.format = format;
    }
    public void setCountPage(int countPage) {
        Book.dataVerification(countPage);
        this.countPage = countPage;
    }
}