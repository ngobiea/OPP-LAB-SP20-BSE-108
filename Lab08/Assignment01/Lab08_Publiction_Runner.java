package Lab08.Assignment1;
/*Write a main() program to test the book and tape class by creating instances of them, 
asking the user to fill in their data and then displaying the data with display().*/
import java.util.*;
public class Lab08_Publiction_Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the title of the book:");
        String titleOfBook = input.nextLine();

        System.out.print("Enter the title of the tape:");
        String titleOfTape = input.nextLine();

        System.out.print("Enter cost  of the book:");
        double priceOfBook = input.nextDouble();

        System.out.print("Enter cost  of the tape:");
        double priceOfTape = input.nextDouble();

        System.out.print("Enter the number of the page:");
        int numberOfPage = input.nextInt();

        System.out.print("Enter the playing time:");
        int playingTime = input.nextInt();
        
        Book book = new Book();
        Tape tape = new Tape();

        tape.setTitle(titleOfTape);
        book.setTitle(titleOfBook);
        book.setPrice(priceOfBook);
        tape.setPrice(priceOfTape);
        book.setPageCount(numberOfPage);
        tape.setPlayingTime(playingTime);
        book.display();
        System.out.println();
        tape.display();
        input.close();
    }
}
