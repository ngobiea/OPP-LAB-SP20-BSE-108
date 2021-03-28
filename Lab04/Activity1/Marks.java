/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04.Activity1;

/**
 *
 * @author ngobi
 * Create an Encapsulated class Marks with three data members to store three marks. 
 * Create set and get methods for all data members. Test the class in runner
 */
class Marks {
    private double chemistry;
    private double physics;
    private double biology;
    Marks(){

    }
    Marks(int newChemistry, int newPhysics, int newBio){
        chemistry = newChemistry;
        physics = newPhysics;
        biology = newBio;
    }
    public void setChemistry(double newChemistry){
        chemistry = newChemistry;
    }
    public void setPhysics(double newPhysics){
        physics = newPhysics;
    }
    public void setBio(double newBio){
        biology = newBio;
    }
    public double getChemistry(){
        return chemistry;
    }
    public double getPhysics(){
        return physics;
    }
    public double getBio(){
        return biology;
    }
    public double getTotalSum(){
        return biology + physics +chemistry;
    }
    public double getAverage(){
        return (biology + chemistry +physics)/3;
    }

}
