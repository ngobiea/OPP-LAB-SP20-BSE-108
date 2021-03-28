/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04.Activity3;

/**
 *
 * @author ngobi
 * Create an Encapsulated class Student with following characteristics:
 * Data Members:
 * String Name 
 * Int [] Result_array[5] // Result array contains the marks for 5 subjects
 * Methods:Student ( String, int[]) // argument Constructor
 * Average () // it calculates and returns the average based on the marks in the array.
 * Runner:Create two objects of type Student and call the Average method.
 * Compare the Average of both Students and display which student has higher average.
 * Create a third student with name as object 1 and result array as object 2
 */
public class Student {
    private String name;
    private int[] Result_array = new int[5];
    Student(String name, int[] Result) {
        this.name = name;
        this.Result_array = Result;
    }
    public double average() {
        double sum = 0;
        for(int i = 0; i < Result_array.length; i++){
            sum+=Result_array[i];
        }
        return sum/Result_array.length;
    }
    public String getName() {
        return name;
    }
    
}
