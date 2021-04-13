package Lab07.Activity02;
/*
    Create a class Book that contains an author of type Person (Note: Use the Person class 
created in the first exercise). Other data members are bookName and publisher. Modify the 
address of the author in runner class.*/
public class Book {
    private Person author;
    private String bookName;
    private String publisher;
    public Book(){
        this(null,null,null);
    }
    public Book(Person author, String bookName, String publisher){
        this.author = author;
        this.bookName = bookName;
        this.publisher = publisher;
    }
    public void setAuthor(Person author){
        this.author = author;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public Person getAuthor() {
        return author;
    }
    public String getBookName() {
        return bookName;
    }
    public String getPublisher() {
        return publisher;
    }
    public void DisplayBookDetails(){
        System.out.println("Book Name:"+getBookName());
        System.out.print("Author ");
        author.printPersonDetails();
        System.out.println("\nPublisher\n"+getPublisher());
    }

}
