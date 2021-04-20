package Lab08.Assignment1;

public class Publication {
    private String title;
    private double price;

    public Publication(){
        
    }
    public Publication(String title, double price){
        this.title = title;
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public void display(){
        System.out.printf("Title:"+getTitle()+"\nPrice:$%.2f\n",getPrice());
    }
}
