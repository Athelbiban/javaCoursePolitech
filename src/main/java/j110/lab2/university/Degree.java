package j110.lab2.university;

public enum Degree {
    MSC("MSc"),
    DSC("DSc"),
    PHD("PhD");

    private String string;

    Degree(String string) { this.string = string; }

    public String toString() { return string; }
}
