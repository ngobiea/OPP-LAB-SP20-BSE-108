package Lab07.Activity01;

public class Runner {
    public static void main(String[] args) {
        Address ad1 = new Address();
        //Address ad2 = new Address();
       // Address ad3 = new Address();
        ad1.setHouseNumber(32);
        ad1.setCity("Islamabad");
        ad1.setStreetNumber(4);
        ad1.setCode(2509);

        Person p1 = new Person(ad1);
        p1.setName("Augutine");
        p1.setPhoneNumber("+92-335-5976460");
        p1.printPersonDetails();
    }
}
