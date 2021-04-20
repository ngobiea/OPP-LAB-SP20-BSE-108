package Lab08.Assignment02;
/*Write a base class Computer that contains data members of wordsize(in bits), memorysize 
(in megabytes), storagesize (in megabytes) and speed (in megahertz). 
Derive a Laptop class that is a kind of computer but also specifies the object’s length, width, height, and 
weight. Member functions for both classes should include a default constructor, a 
constructor to inialize all components and a function to display data members*/
public class Computer {
    private double wordSize;
    private double memorySize;
    private double storageSize;
    private double speed;

    public Computer(){

    }
    public Computer(double wordSize, double memorySize, double storageSize, double speed){
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }
    public double getWordSize(){
        return wordSize;
    }
    public double getMemorySize(){
        return memorySize;
    }
    public double getStorageSize(){
        return storageSize;
    }
    public double getSpeed(){
        return speed;
    }
    public void setWordSize(double d){
        wordSize=d;
    }
    public void setMemorySize(double d){
        memorySize=d;
    }
    public void setStorageSize(double d){
        storageSize=d;
    }
    public void setSpeed(double d){
        speed=d;
    }
    public void display(){
        System.out.println("Word size: " + this.wordSize+"bits\nMemory size: " + this.memorySize+"Mb\nStorages: " + this.storageSize+"Mb\nSpeed: " + this.speed+"Mhz");
    }

}
