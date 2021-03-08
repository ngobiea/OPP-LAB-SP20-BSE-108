/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marks;

/**
 *
 * @author ngobi
 */
public class TestMarks {
    public static void main(String[] args){
        
    Marks m1 = new Marks();
    Marks m2 = new Marks((int)(Math.random()*100), (int)(Math.random()*100),(int)(Math.random()*100));
    System.out.println("Sum of the first marks = " + m1.getSum());
    System.out.println("Sum of the second marks = " + m2.getSum());
    }
}
