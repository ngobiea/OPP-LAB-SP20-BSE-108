package Lab05.Activity1;

public class Lab5_Distance_Runner {
    public static void main(String[] args) {
        Distance d1 = new Distance(34.2, 64.9);
        Distance d2 = new Distance();
        d2.setFeets(45.4);
        d2.setInches(87.5);
        d1.displayDistance();
        d2.displayDistance();

        System.out.println("Sum = "+Distance.sumOfDistances(d1, d2));
      
    }
    
    
}
