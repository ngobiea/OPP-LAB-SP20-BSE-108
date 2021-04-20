package Lab08.Assignment02;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        int length,width,height,weight,wordsize,memorysize,storagesize;
        double speed;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height ");
        height=input.nextInt();
        System.out.println("Enter the length");
        length=input.nextInt();
        System.out.println("Enter the width");
        width=input.nextInt();
        System.out.println("Enter the weight");
        weight=input.nextInt();
        System.out.println("Enter the wordsize");
        wordsize=input.nextInt();
        System.out.println("Enter the memery size");
        memorysize=input.nextInt();
        System.out.println("Enter the storage size ");
        storagesize=input.nextInt();
        System.out.println("Enter the speed");
        speed=input.nextDouble();
        Laptop l = new Laptop(length,width,height,weight);
        l.setWordSize(wordsize);
        l.setMemorySize(memorysize);
        l.setSpeed(speed);
        l.setStorageSize(storagesize);

    
        l.display();
        input.close();
    }
}
