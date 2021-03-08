/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marks;

/**
 *
 * @author ngobi
 * Write a class Marks with three data members to store three marks. Create two constructors 
and a method to calculate and return the sum.
 */
public class Marks {
    int mark1;
    int mark2;
    int mark3;
    Marks(){
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }
    Marks(int mark1,int mark2,int mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    int getSum(){
        return (mark1+mark2+mark3);
    }
}
