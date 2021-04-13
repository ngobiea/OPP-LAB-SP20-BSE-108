package Lab07.Assignment;

public class Lab07_PizzaOrder_Runner {
    public static void main(String[] args){
        Pizza p1 = new Pizza("large",1,1,2);
        // testing the first bought pizza
        System.out.println("Cost:$"+p1.calCost());
        Pizza p2 = new Pizza("medium",3,4,2);
        Pizza p3 = new Pizza("small",9,4,6);
        PizzaOrder po = new PizzaOrder(p1,p2,p3);
        System.out.println("Cost of the three ordered pizza:$"+po.calcTotal());
        
    }
}
