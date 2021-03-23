package Lab05.Activity2;
/* Create an Encapsulated class Book. Its data members are 
 author (String)
 chapterNames[100] (String[])
Create two overloaded constructors, one with no argument and one with two arguments. 
Create a method compareBooks that compares the author of two Books and returns true if 
both books have same author and false otherwise. (This method must manipulate two Book 
objects)
Create a method compareChapterNames that compares the chapter names of two Books and 
returns the book with larger chapters. Display the author of the book with greater chapters in 
main. 
Create a runner class that declares two objects of type Book. One object should be declared 
using no argument constructor and then the parameters should be set through the set() 
methods. The second object should be declared with argument constructor. Finally the 
CompareBooks()and compareChapterNames method should be called and the result should 
be displayed in the runner class.*/
public class Book {
    private String author;
    private String[] chapterNames;
    public Book(){

    }
    public Book(String author, String[] chapterNames){
        this.author = author;
        this.chapterNames = chapterNames;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setChapterNames(String[] chapterNames){
        this.chapterNames = chapterNames;
    }
    public String getAuthor() {
        return this.author;
    }
    public String[] getChapterNames() {
        return this.chapterNames;
    }
    public static boolean compareBooks(Book b1, Book b2){
        if(b1.author.equals(b2.author)){
            return true;
        }
        else{
            return false;
        }
    }
    public static Book compareChapterNames(Book b1, Book b2){
        if(b1.chapterNames.length > b2.chapterNames.length){
            return b1;
        }
        else{
            return b2;
        }
    }

}
