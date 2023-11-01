package j110.lab2.files;

import j110.lab1.Books.Book;

public class Video extends Media {
    private String pictureSize;

    public Video(String fileName, long size, String format,
                 String description, String duration, String pictureSize) {
        super(fileName, size, format, description, duration);
        this.pictureSize = pictureSize;
    }

    public String getPictureSize() { return pictureSize; }

    public void setPictureSize(String pictureSize) {
        Book.dataVerification(pictureSize);
        this.pictureSize = pictureSize;
    }
}