package j110.lab2.university;

abstract public class Person {
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

    public void print() {
        String printName = name + " " + surname;
        String verb = this instanceof Teacher ? "teaches" : "studies";
        String pronoun = this.gender.getPronoun();
        String pronounPrit = this.gender.getPronounPrit();

        System.out.printf("This is %s. %s %s at %s\n",
                printName, pronoun, verb, department);

        if (this instanceof Teacher) {
            System.out.printf("%s has %s degree in %s.\n\n",
                    pronoun,
                    ((Teacher) this).getDegree(),
                    ((Teacher) this).getSpeciality());
        }
        else if (this instanceof Student) {
            System.out.printf("%s is %s'th year %s student.\n\n",
                    pronoun,
                    ((Student) this).getCourseNumber(),
                    ((Student) this).getStage());
        }
        else {
            System.out.printf("%s thesis title is \"%s\"\n\n",
                    pronounPrit,
                    ((GraduateStudent) this).getThesisTitle());
        }
    }

    public static void printAll(Person[] persons) {
        if (persons[0] == null) {
            System.out.println("Передан пустой массив");
        } else {
            for (Person person : persons) {
                person.print();
            }
        }
    }
}