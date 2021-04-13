package Lab07.Activity02;
/*Create an Address class, which contains street#, house#, city and code. Create another class 
Person that contains an address of type Address. Give appropriate get and set functions for 
both classes. Test class person in main.*/
public class Address {
    private int streetNumber;
    private int houseNumber;
    private String city;
    private int code;

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getStreetNumber() {
        return streetNumber;
    }
    public int getHouseNumber() {
        return houseNumber;
    }
    public String getCity(){
        return city;
    }
    public int getCode() {
        return code;
    }
    public String getAddress(){
        return "    Address     "+"\nStreet Number:"+getStreetNumber()+"\nHouse Number:"+getHouseNumber()+"\nCity:"+getCity()+"\nCode:"+getCode();
    }
}
