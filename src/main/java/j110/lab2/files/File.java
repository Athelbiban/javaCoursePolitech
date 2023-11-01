package j110.lab2.files;

public class File {
    private String fileName;
    private long size;

    public File(String fileName, long size) {
        setFileName(fileName);
        setSize(size);
    }

    public String getFileName() { return fileName; }
    public long getSize() { return size; }

    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setSize(long size) { this.size = size; }
}