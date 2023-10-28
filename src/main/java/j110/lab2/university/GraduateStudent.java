package j110.lab2.university;

public class GraduateStudent extends Person {
    private String thesisTitle;

    GraduateStudent(String name,
                    String surname,
                    Gender gender,
                    String department,
                    String thesisTitle) {
        super(name, surname, gender, department);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() { return thesisTitle; }
}