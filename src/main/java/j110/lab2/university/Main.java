package j110.lab2.university;

public class Main {
    public static void main(String[] args) {
        Person[] personArr1 = new Person[6];
        personArr1[0] = new Teacher("Ronald", "Turner",
                Gender.M, "Computer science", Degree.PHD,
                "Programming paradigms");
        personArr1[1] = new Teacher("Ruth", "Hollings",
                Gender.F, "Jurisprudence", Degree.MSC,
                "Domestic arbitration");
        personArr1[2] = new Bachelor("Leo", "Wilkinson",
                Gender.M, "Computer science", CourseNumber.III);
        personArr1[3] = new Bachelor("Anna", "Cunningham",
                Gender.F, "World economy", CourseNumber.I);
        personArr1[4] = new Master("Jill", "Lundqvist",
                Gender.F, "Jurisprudence", CourseNumber.I);
        personArr1[5] = new GraduateStudent("Ronald", "Correa",
                Gender.M, "Computer science",
                "Design of a functional programming language.");

        Person.printAll(personArr1);
    }
}