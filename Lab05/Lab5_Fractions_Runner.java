package Lab05.Assignment;

public class Lab5_Fractions_Runner {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(75,3);
        f1.setRatio(75,3);
        f1.displayRatio();
        f2.displayRatio();
        
        System.out.println(f1.equals(f2));
    }
}
   
