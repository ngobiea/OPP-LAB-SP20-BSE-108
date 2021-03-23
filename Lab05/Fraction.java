package Lab05.Assignment;
/*Define a class called Fraction. This class is used to represent a ratio of two integers. Create 
two constructors, set, get and display function. Include an additional method, equals, that 
takes as input another Fraction and returns true if the two fractions are identical and false if 
they are not.*/
public class Fraction {
    private double ratio;

    public Fraction(){
    
    }
    public Fraction(int num1, int num2){
        ratio = num1/num2;
    }
    public void setRatio(int num1, int num2){
        ratio = num1/num2;
    }
    public void displayRatio(){
        System.out.println("Ratio "+this.ratio);
    }
    public double getRatio(){
        return this.ratio;
    }
    public boolean equals(Fraction f){
        if(this.ratio==f.ratio){
            return true;
        }
        else{
            return false;
        }
    }
    
}
