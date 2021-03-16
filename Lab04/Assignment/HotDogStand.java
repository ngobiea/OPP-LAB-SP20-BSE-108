/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author ngobi
 * Suppose you operate several hot dog stands distributed throughout town. Define an 
    Encapsulated class named HotDogStand that has an instance variable for the hot dog stand’s 
    ID number and an instance variable for how many hot dogs the stand has sold that day.
    Create a constructor that allows a user of the class to initialize both values. Also create a 
    method named justSold that increments by one the number of hot dogs the stand has sold. 
    The idea is that this method will be invoked each time the stand sells a hot dog so that you 
    can track the total number of hot dogs sold by the stand.
 */
public class HotDogStand {
    private int ID;
    private int totalHotDogs;
    private int NoSold;

    HotDogStand(int ID, int totalHotDog) {
        this.ID = ID;
        this.totalHotDogs = totalHotDog;
    }
    public int getNoSold(){
        return NoSold;
    }
    public int getId(){
        return ID;
    }
    public int getTotalHotDog(){
        return totalHotDogs;
    }
    public void justSold(){
        NoSold++; 
    }
}
