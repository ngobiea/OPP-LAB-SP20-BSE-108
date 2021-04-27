package Lab09.Task03.Lab09_Student;

import Lab09.Task03.GradStudent;
import Lab09.Task03.PhdStudent;

public class Runner {
    public static void main(String[] args) {
        PhdStudent student1 = new PhdStudent();
        GradStudent student2 = new GradStudent();

        student1.takeExam();
        System.out.println();
        student2.takeExam();
    }
}
