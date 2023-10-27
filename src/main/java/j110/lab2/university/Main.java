package j110.lab2.university;

public class Main {
    public static void main(String[] args) {
        BSC_MSC student1 = new BSC_MSC(
                "Stas", "Vostrov", Gender.MALE,
                "Computer science", 2, Stage.BSC
        );
        student1.print();
//        System.out.println(student1.getName());;
    }
}
