package Lab06.Activity2;

public class CountObjectsRunner {
    public static void main(String[] args) {
        CountObjects c1 = new CountObjects();
        CountObjects c2 = new CountObjects();
        CountObjects c3 = new CountObjects();
        CountObjects c4 = new CountObjects();
        CountObjects c5 = new CountObjects();
        System.out.println("Number of objects:"+CountObjects.getNumberOfObjects());

        c1.finalize();
        c1 = null;
        c2.finalize();
        c2 = null;
        System.out.println("Number of objects:"+CountObjects.getNumberOfObjects());
        c3.finalize();
        c4.finalize();
        c5.finalize();
        
        System.out.println("Number of objects:"+CountObjects.getNumberOfObjects());
    }
}
