/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circle;

/**
 *
 * @author ngobi
 */
public class Circle {
    double radius = 1.0;
    Circle(){
        radius = 1.0;
    }
    Circle(double newRadius){
        radius = newRadius<=0?1:newRadius;
    }
    double getCircumference(){
        return Math.PI*radius*2;
    }
}
