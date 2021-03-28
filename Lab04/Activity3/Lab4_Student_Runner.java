/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04.Activity3;

/**
 *
 * @author ngobi
 * Runner:Create two objects of type Student and call the Average method.
 * Compare the Average of both Students and display which student has higher average.
 * Create a third student with name as object 1 and result array as object 2
 */
import java.util.*;
public class Lab4_Student_Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1,name2;
        int[] s1grades = new int[5];
        System.out.print("Enter name: ");
        name1 = input.nextLine();
        for (int i = 0; i < s1grades.length; i++) {
            s1grades[i] = (int)(Math.random() *100+1);
        }
        int[] s2grades = new int[5];
        System.out.print("Enter name: ");
        name2 = input.nextLine();
        for (int i = 0; i < s2grades.length; i++) {
            s2grades[i] = (int)(Math.random() *100+1);
        }
        Student s1 = new Student(name1, s1grades);
        Student s2 = new Student(name2, s2grades);
        System.out.println("Name:"+s1.getName()+"\nGrade Averge:"+s1.average());
        System.out.println();
        System.out.println("Name:"+s2.getName()+"\nGrade Averge:"+s2.average());
        System.out.println();
        Student s3 = new Student(name1,s2grades);
        System.out.println("Name:"+s3.getName()+"\nGrade Averge:"+s3.average());

        

        input.close();
    }
}
