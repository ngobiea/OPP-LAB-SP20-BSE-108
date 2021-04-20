package Lab08.Activity01;
/*
A person has a name, address, phone number, and email address.
*/
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    public Person(){

    }
    public Person(String name,String address,String phoneNumber,String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void display(){
        System.out.println("Class Name: Person"+"\nName:"+getName());
    }
    
}
