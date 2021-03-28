package Lab06.Activity2;
/*Write program to count the number of objects created and destroyed for a class using static data 
members and static member functions*/
public class CountObjects {
    private static int countObjects;

    public CountObjects(){
        System.out.println("New object created.");
        countObjects++;

    }
    public static int getNumberOfObjects(){
        return countObjects;
    }
    // java objects destructor methods
    protected void finalize(){
        System.out.println("Object is destroyed by the Garbage Collector");
        countObjects--;
    }
}
