/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distance;

/**
 *
 * @author ngobi
 * Create a class ―Distance‖ with two constructors (no argument, and two argument), two data 
members (feet and inches). Also create display function which displays all data members.
.
 * 
 */
public class Distance {
    double feet;
    double inches;
    Distance(){
        feet = 0;
        inches = 0;
    }
    Distance(double feet, double inches){
        this.feet = feet;
        this.inches = inches;
    }
    void printFeet(){
        System.out.println(feet);
    }
    void printInches(){
        System.out.println(inches);
    }

}
