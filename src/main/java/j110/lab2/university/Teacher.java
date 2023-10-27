package j110.lab2.university;

public class Teacher extends Person {
    private Degree degree;
    private String speciality;

    Teacher(String name, String surname, Gender gender, String department,
            Degree degree, String speciality) {
        super(name, surname, gender, department);
        this.degree = degree;
        this.speciality = speciality;
    }
}

enum Degree {
    CANDIDATEOFSCIENCES,
    DOCTOROFSCIENCES,
    PHD
}