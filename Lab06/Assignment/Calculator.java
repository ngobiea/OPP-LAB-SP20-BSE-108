package Lab06.Assignment;
/*Create a Calculator class that has following methods:
sum, multiply, divide , modulus , sin , cos , tan 
The user should be able to call these methods without creating an object of Calculator class.*/
public class Calculator { 
    private Calculator(){

    }
    public static double sum(double x, double y) {
        return x + y;
    }
    public static double multiply(double x, double y){
        return x * y;
    }
    public static double divide(double x, double y){
        return x / y;
    }
    public static double modulus(double x, double y){
        return x % y;
    }
    public static double sin(double x){
        return Math.sin(x);
    }
    public static double cos(double x){
        return Math.cos(x);
    }
    public static double tan(double x){
        return Math.tan(x);
    }
}
