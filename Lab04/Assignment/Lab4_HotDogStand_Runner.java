/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author ngobi
 * Write a main method to test your class with at least three hot dog stands that each sell a 
variety of hot dogs. Use get function to display the hot dogs sold for each object.
 */
public class Lab4_HotDogStand_Runner {
    public static void main(String[] args) {
        HotDogStand stand1 = new HotDogStand(121,35);
        HotDogStand stand2 = new HotDogStand(131,44);
        HotDogStand stand3 = new HotDogStand(141,28);
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold();
        stand1.justSold();
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        System.out.println("Stand 1 has  sold "+stand1.getNoSold());
        System.out.println("Stand 2 has sold "+stand2.getNoSold());
        System.out.println("Stand 3 has sold "+stand3.getNoSold());
    }
}
