package j110.lab2.university;

public class Student extends Person {
    Student(String name, String surname, Gender gender, String department) {
        super(name, surname, gender, department);
    }
}

class BSC_MSC extends Student {
    private Stage stage;
    private int courseNumber;

    BSC_MSC(String name,
            String surname,
            Gender gender,
            String department,
            int courseNumber, Stage stage) {
        super(name, surname, gender, department);
        this.stage = stage;
        this.courseNumber = courseNumber;
    }
}

class GraduateStudent extends Student {
    private String thesisTitle;

    GraduateStudent(String name,
            String surname,
            Gender gender,
            String department,
            String thesisTitle) {
        super(name, surname, gender, department);
        this.thesisTitle = thesisTitle;
    }
}

enum Stage {
    BSC,
    MSC
}