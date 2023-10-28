package j110.lab2.university;

public class Main {
    public static void main(String[] args) {
        Bachelor bachelor1 = new Bachelor(
                "Ivan", "Ivanov", Gender.M,
                "Computer science", CourseNumber.I);

        Teacher teacher1 = new Teacher(
                "Maria", "Petrova", Gender.F,
                "Jurisprudence", Degree.DSC, "Domestic arbitration"
        );

        GraduateStudent graduateStudent1 = new GraduateStudent(
                "Alexandr", "Pushkin", Gender.M,
                "World economy",
                "Word economy - it's very interesting"
        );

        Master master1 = new Master(
                "Elena", "Sidorova", Gender.F,
                "Computer science", CourseNumber.IV);

        bachelor1.print();
        teacher1.print();
        graduateStudent1.print();
        master1.print();
    }
}