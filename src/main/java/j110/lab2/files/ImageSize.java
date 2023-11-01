package j110.lab2.files;

import j110.lab1.Books.Book;

public class ImageSize {
    private int length;
    private int height;

    public ImageSize(int length, int height) {
        setLength(length);
        setHeight(height);
    }

    public int getLength() { return length; }
    public int getHeight() { return height; }

    public void setLength(int length) {
        Book.dataVerification(length);
        this.length = length;
    }
    public void setHeight(int height) {
        Book.dataVerification(height);
        this.height = height;
    }
}
