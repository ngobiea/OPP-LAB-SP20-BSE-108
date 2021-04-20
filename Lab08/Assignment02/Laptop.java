package Lab08.Assignment02;
/*Write a base class Computer that contains data members of wordsize(in bits), memorysize 
(in megabytes), storagesize (in megabytes) and speed (in megahertz). 
Derive a Laptop 
class that is a kind of computer but also specifies the object’s length, width, height, and 
weight. Member functions for both classes should include a default constructor, a 
constructor to inialize all components and a function to display data members*/
public class Laptop extends Computer {
    private double length;
    private double width;
    private double height;
    private double weight;
    
    public Laptop(){

    }
    public Laptop(double length, double width, double height, double weight){
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    double getLength(){
        return length;
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    double getWeight(){
        return weight;
    }
    void setLength(double d){
        length=d;
    }
    void setWidth(double d){
        width=d;
    }
    void setHeight(double d){
        height=d;
    }
    public void display(){
        System.out.println("Length: " + length+"cm\nWidth: " + width+"cm\nHeight: " + height+"cm\nWeight: " + weight+"kg");
    }

}
