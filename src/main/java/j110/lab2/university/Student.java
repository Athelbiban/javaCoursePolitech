package j110.lab2.university;

public class Student {
}

class BSC_MSC extends Student {
    private StepOfTraining step;
    private int courseNumber;
}

class GraduateStudent extends Student {
    private String dissertationTopic;
}

enum StepOfTraining {
    BSC,
    MSC
}