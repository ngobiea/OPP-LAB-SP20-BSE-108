package Lab07.Assignment;
/*Write test code to create several pizzas and output their descriptions. For example, a large 
pizza with one cheese, one pepperoni and two ham toppings should cost a total of $22.
Now Create a PizzaOrder class that allows up to three pizzas to be saved in an order. Each 
pizza saved should be a Pizza object. Create a method calcTotal() that returns the cost of 
order.
In the runner order two pizzas and return the total cost.*/
public class PizzaOrder {
    private Pizza p1;
    private Pizza p2;
    private Pizza p3;
    
    public PizzaOrder(Pizza p1, Pizza p2,Pizza p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double calcTotal(){
        return p1.calCost() + p2.calCost()+ p3.calCost();
    }
    

    
}
