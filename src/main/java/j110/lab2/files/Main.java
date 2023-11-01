package j110.lab2.files;

public class Main {
    public static void main(String[] args) {
        File file = new File("file1", 42L);
        System.out.println(file.getFileName());
        Image image1 = new Image("imageName1", 12346, ".jpg",
                640, 480);
        System.out.println(image1.getLength());

        ImageSize imageSize1 = new ImageSize(1280, 1024);
        System.out.println(imageSize1.getLength());

        System.out.println(image1.getHeight());
        image1.setHeight(500);
        System.out.println(image1.getHeight());
    }
}
