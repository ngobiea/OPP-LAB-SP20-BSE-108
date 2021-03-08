/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distance;
/**
 *
 * @author ngobi
 */
public class TestDistance {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance((int)(Math.random()*100),(int)(Math.random()*100));
        d1.printFeet();
        d1.printInches();
        d2.printFeet();
        d2.printInches();

    }
}
