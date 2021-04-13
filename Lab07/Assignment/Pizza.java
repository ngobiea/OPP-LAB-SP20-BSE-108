package Lab07.Assignment;
/* Create a class named Pizza that stores information about a single pizza. It should contain the 
following:
 Private instance variables to store the size of the pizza (either small, medium, or 
large), the number of cheese toppings, the number of pepperoni toppings, and the 
number of ham toppings.
 Constructor(s) that set all of the instance variables.
 Public methods to get and set the instance variables.
 A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:s
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
 public method named getDescription( ) that returns a String containing the pizza size, 
quantity of each topping.*/
public class Pizza {
    private String size;
    private int NumberOfCheeseToppings;
    private int NumberOfPepperoniToppings;
    private int NumberOfHamToppings;
    public Pizza(String size, int NumberOfCheeseToppings, int NumberOfPepperoniToppings, int NumberOfHamToppings){
        this.size = size;
        this.NumberOfCheeseToppings = NumberOfCheeseToppings;
        this.NumberOfPepperoniToppings = NumberOfPepperoniToppings;
        this.NumberOfHamToppings = NumberOfHamToppings;
    }
    public void set(String size){
        this.size = size;
    }
    public void setNumberOfCheeseToppings(int NumberOfCheeseToppings){
        this.NumberOfCheeseToppings = NumberOfCheeseToppings;
    }
    public void setNumberOfPepperoniToppings(int NumberOfPepperoniToppings){
        this.NumberOfPepperoniToppings = NumberOfPepperoniToppings;
    }
    public void setNumberOfHamToppings(int NumberOfHamToppings){
        this.NumberOfHamToppings = NumberOfHamToppings;
    }
    public String getSize(){
        return size;
    }
    public int getNumberOfCheeseToppings(){
        return NumberOfCheeseToppings;
    }
    public int getNumberOfPepperoniToppings(){
        return NumberOfPepperoniToppings;
    }
    public int getNumberOfHamToppings(){
        return NumberOfHamToppings;
    }
    public double calCost(){
        double cost;
        if(size.equals("small")){
            cost = 10 + (2*(getNumberOfCheeseToppings()+getNumberOfPepperoniToppings()+getNumberOfHamToppings()));
        }
        else if(size.equals("medium")){
            cost = 12 + (2*(getNumberOfCheeseToppings()+getNumberOfPepperoniToppings()+getNumberOfHamToppings()));
        }
        else{
            cost = 14 + (2*(getNumberOfCheeseToppings()+getNumberOfPepperoniToppings()+getNumberOfHamToppings()));
        }
        return cost;
    }
    public String getDescription(){
        return "Pizza size:"+getSize()+"\nCheese Toppings:"+getNumberOfCheeseToppings()+"\nPepperoni Toppings:"+getNumberOfPepperoniToppings()+"\nHam Toppings:"+getNumberOfHamToppings();
    }
}
