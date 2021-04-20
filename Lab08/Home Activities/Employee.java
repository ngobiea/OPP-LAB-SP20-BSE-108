package Lab08.Activity01;
import java.util.*;
/*An employee has an office, salary, and date hired. Use the Date class to create an object 
for date hired.*/
public class Employee  extends Person{
    private String office;
    private double salary;
    private Date date;
    
    public Employee(){
        date = new Date();
    }
    public Employee(String office,double salary){
        this.office = office;
        this.salary = salary;
        date = new Date();
    }
    public void setOffice(String office){
        this.office = office;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getOffice(){
        return office;
    }
    public double getSalary(){
        return salary;
    }
    public Date getDate(){
        return date;
    }
    @Override
    public void display(){
        System.out.println("Class Name: Employee"+"\nName:"+getName());
    }


}
