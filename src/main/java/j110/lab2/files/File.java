package j110.lab2.files;

import j110.lab1.Books.Book;

public class File {
    private String fileName;
    private long size;

    public File(String fileName, long size) {
        setFileName(fileName);
        setSize(size);
    }

    public String getFileName() { return fileName; }
    public long getSize() { return size; }

    public void setFileName(String fileName) {
        Book.dataVerification(fileName);
        this.fileName = fileName;
    }
    public void setSize(long size) {
        Book.dataVerification(size);
        this.size = size;
    }
}