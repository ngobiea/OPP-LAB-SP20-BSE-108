package Lab08.Activity01;
//A student has a status (String)
public class Student extends Person {

    private String status;
    
    public Student(String status){
        this.status = status;
    }
    public Student(){

    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
    @Override
    public void display(){
        System.out.println("Class Name: Student"+"\nName:"+getName());
    }
}
