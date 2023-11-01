package j110.lab2.files;

import j110.lab1.Books.Book;

public class Media extends File {
    private String format;
    private String description;
    private String duration;

    public Media(String fileName, long size, String format,
                 String description, String duration) {
        super(fileName, size);
        this.format = format;
        this.description = description;
        this.duration = duration;
    }

    public String getFormat() { return format; }
    public String getDescription() { return description; }
    public String getDuration() { return duration; }

    public void setFormat(String format) {
        Book.dataVerification(format);
        this.format = format;
    }
    public void setDescription(String description) {
        Book.dataVerification(description);
        this.description = description;
    }
    public void setDuration(String duration) {
        Book.dataVerification(duration);
        this.duration = duration;
    }
}