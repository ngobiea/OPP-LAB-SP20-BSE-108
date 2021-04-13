package Lab07.Activity03;
/*Design a class Point with two data members x-cord and y-cord. This class should have an 
arguments constructor, setters, getters and a display function. 
Now create another class ―Line‖, which contains two Points ―startPoint‖ and ―endPoint‖. It 
should have a function that finds the length of the line.
Hint: formula is: sqrt((x2-x1)2
+ (y2-y1)2)
Create two line objects in runner and display the length of each line.*/
public class Point {
    private double x_cord;
    private double y_cord;

    public Point(double x, double y){
        this.x_cord = x;
        this.y_cord = y;
    }
    public void setX(double x){
        this.x_cord = x;
    }
    public void setY(double y){
        this.y_cord = y;
    }
    public double getX(){
        return x_cord;
    }
    public double getY(){
        return y_cord;
    }
    public void display(){
        System.out.printf("Coordinate(x = %.2f, y = %.2f)",getX(),getY());
    }

}
