package Lab05.Activity1;
/*Create a class ― Distance‖ with two constructors (no argument, and two argument), two data 
members ( feet and inches) . Create setter, getter and display method. Create a method that 
adds two Distance Objects and returns the added Distance Object.*/
public class Distance {
    private double feet;
    private double inches;
    
    public Distance(){
        this(1, 1);
    }
    public Distance(double feet, double inches){
        this.feet = feet;
        this.inches = inches;
    }
    public void setFeets(double feet){
        this.feet = feet;
    }
    public void setInches(double inches){
        this.inches = inches;
    }
    public double getFeets(){
        return this.feet;
    }
    public double getInches(){
        return this.inches;
    }
    public void displayDistance(){
        System.out.println("Distance: "+this.feet+"feet,"+this.inches+"inches");
    }
    public static double sumOfDistances(Distance d1, Distance d2){
        double sum;
        sum = d1.getFeets()+d2.getFeets()+d1.getInches()+d2.getInches();
        return sum;
    }
}

