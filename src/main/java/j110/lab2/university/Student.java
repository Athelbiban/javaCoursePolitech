package j110.lab2.university;

abstract public class Student extends Person {
    private Stage stage;
    private CourseNumber courseNumber;

    Student(String name, String surname, Gender gender,
           String department, CourseNumber courseNumber, Stage stage) {
        super(name, surname, gender, department);
        this.stage = stage;
        this.courseNumber = courseNumber;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("%s is %s'th year %s student.\n\n",
                gender.getPronoun(),
                getCourseNumber(),
                getStage());
    }

    public String getStage() { return stage.toString(); }
    public String getCourseNumber() { return courseNumber.toString(); }
}