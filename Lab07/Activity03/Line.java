package Lab07.Activity03;
/*Design a class Point with two data members x-cord and y-cord. This class should have an 
arguments constructor, setters, getters and a display function. 
Now create another class ―Line‖, which contains two Points ―startPoint‖ and ―endPoint‖. It 
should have a function that finds the length of the line.
Hint: formula is: sqrt((x2-x1)2
+ (y2-y1)2)
Create two line objects in runner and display the length of each line.*/
public class Line {
    private Point startPoint;
    private Point endPoint;
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public Line(){
        this(null,null);
    }
    public double getLength(){
        return Math.sqrt(Math.pow((endPoint.getX() - startPoint.getX()),2)+ Math.pow((endPoint.getY() - startPoint.getY()),2));
    }
}
