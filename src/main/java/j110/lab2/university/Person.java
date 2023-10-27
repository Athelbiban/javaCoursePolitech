package j110.lab2.university;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private String department;

    Person(String name, String surname, Gender gender, String department) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.department = department;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public Gender getGender() { return gender; }
    public String getDepartment() { return department; }

    public void print() {
        String printName = name + " " + surname;
        String verb = "teaches";
        String pronoun = "he";
        System.out.printf("This is %s. %s %s at %s\n",
                printName, pronoun, verb, department);
    }
}

enum Gender {
    MALE,
    FEMALE
}