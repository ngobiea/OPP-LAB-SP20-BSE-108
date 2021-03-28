/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04.Activity1;

/**
 *
 * @author ngobi
 */
public class Lab4_Mark_Runner {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.setChemistry(68);
        m1.setPhysics(83);
        m1.setBio(94);
        System.out.println("Chemistry: " + m1.getChemistry());
        System.out.println("Physics: " + m1.getPhysics());
        System.out.println("Bio: " + m1.getBio());
        System.out.println("Sum: " + m1.getTotalSum());
        System.out.println(Math.random() *10);
        

        



    }
}
