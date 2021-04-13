package Lab07.Activity01;
/*Create an Address class, which contains street#, house#, city and code. Create another class 
Person that contains an address of type Address. Give appropriate get and set functions for 
both classes. Test class person in main.*/
public class Person {
    private Address address;
    private String name;
    private String phoneNumber;

    public Person(Address address){
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getName() {
        return name;
    }
    public Address getAddress(){
         return address;
    }
    public void printPersonDetails(){
        System.out.println("Name:"+getName()+"\nPhone:"+getPhoneNumber()+"\n\n"+getAddress().getAddress());
    }

    
}
