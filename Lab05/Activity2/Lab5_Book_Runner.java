package Lab05.Activity2;

public class Lab5_Book_Runner {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("John", new String[310]);
        b1.setAuthor("Paul");
        b1.setChapterNames(new String[410]);
        System.out.println(Book.compareBooks(b1, b2));
        Book b3  = Book.compareChapterNames(b1, b2);
        System.out.println("The book author with the highest chapter is: "+b3.getAuthor());
        
    }
}
