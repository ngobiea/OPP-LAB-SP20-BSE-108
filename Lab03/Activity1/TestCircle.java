/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circle;

/**
 *
 * @author ngobi
 * Create a class circle class with radius as data member.
 * Create two constructors (no argument, and two arguments) 
 * and a method to calculate Circumference.
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(Math.random()*100);
        System.out.printf("Radius of circle1 = %.3f ",c1.radius);
        System.out.printf(" Circumference = %.3f ",c1.getCircumference());
        System.out.println();
        System.out.printf("Radius of circle2 = %.3f ",c2.radius);
        System.out.printf(" Circumference = %.3f ",c2.getCircumference());
        System.out.println();
    }
}


