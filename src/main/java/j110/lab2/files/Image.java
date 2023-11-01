package j110.lab2.files;

public class Image extends File {
    private String format;
    private ImageSize imageSize;

    public Image(String fileName, long size, String format,
                 int length, int height) {
        super(fileName, size);
        setFormat(format);
        imageSize = new ImageSize(length, height);
    }

    public String getFormat() { return format; }
    public ImageSize getImageSize() { return imageSize; }
    public int getLength() { return imageSize.getLength(); }
    public int getHeight() { return imageSize.getHeight(); }

    public void setFormat(String format) { this.format = format; }
    public void setImageSize(ImageSize imageSize) { this.imageSize = imageSize; }
    public void setLength(int length) { this.imageSize.setLength(length);}
    public void setHeight(int height) { imageSize.setHeight(height);}
}