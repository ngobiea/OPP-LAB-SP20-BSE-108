package Lab08.Activity01;
//A staff member has a title.
public class Staff extends Employee{
    private String title;

    public Staff(){

    }
    public Staff(String title){
        this.title = title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    @Override
    public void display(){
        System.out.println("Class Name: Staff"+"\nName:"+getName());
    }
}
