package j110.lab2.university;

class Master extends Student {
    Master(String name, String surname, Gender gender,
           String department, CourseNumber courseNumber) {
        super(name, surname, gender, department,
                courseNumber, Stage.MASTER);
    }

    // здесь idea подчеркивает print() желтым и предлагает убрать
    // print() по следующей причине:
    // Method 'print()' is identical to its super method

    @Override
    public void print() {
        super.print();
    }

}