package Lab06.Assignment;
import java.util.*;
public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, angle;
        System.out.print("Enter two numbers: ");
        num1 =input.nextDouble();
        num2 =input.nextDouble();
        System.out.println(num1+" + "+num2+" =: " + Calculator.sum(num1,num2));
        System.out.println(num1+" x "+num2+" =: " + Calculator.multiply(num1,num2));
        System.out.println(num1+" / "+num2+" =: " + Calculator.divide(num1,num2));
        System.out.println(num1+" % "+num2+" =: " + Calculator.modulus(num1,num2));
        System.out.print("Enter the angle: ");
        angle =input.nextDouble();
        System.out.println("sin of ("+angle+") =: "+Calculator.sin(angle));
        System.out.println("cos of ("+angle+") =: "+Calculator.cos(angle));
        System.out.println("tan of ("+angle+") =: "+Calculator.tan(angle));
        input.close();
    }
}
