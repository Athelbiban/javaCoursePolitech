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

    @Override
    public void print() {
        super.print();
        System.out.printf("%s thesis title is \"%s\"\n\n",
                gender.getPronounPrit(),
                getThesisTitle());
    }
}