package j110.lab1.Books;

public class Publisher {
    private String name;
    private String city;

    public String getName() { return name; }
    public String getCity() { return city; }

    public void setName(String name) {
        Book.dataVerification(name);
        this.name = name;
    }
    public void setCity(String city) {
        Book.dataVerification(city);
        this.city = city;
    }

    Publisher(String name, String city) {
        setName(name);
        setCity(city);
    }
}