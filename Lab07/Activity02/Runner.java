package Lab07.Activity02;
/*
    Create a class Book that contains an author of type Person (Note: Use the Person class 
created in the first exercise). Other data members are bookName and publisher. Modify the 
address of the author in runner class.*/
public class Runner {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreetNumber(23);
        address.setHouseNumber(4);
        address.setCity("Punjab");
        address.setCode(1234);
        Person author = new Person(address);
        author.setName("John Doe");
        author.setPhoneNumber("+923359998050");
        Book b1 = new Book();
        b1.setAuthor(author);
        b1.setBookName("Java OOP");
        b1.setPublisher("Mary T. King and Co.");
        b1.DisplayBookDetails();
    }
}
