/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;

/**
 *
 * @author ngobi
 * Write a class Time with three data members to store hr, min and seconds. 
 * Create two constructors and apply checks to set valid time. 
 * Also create display function which displays all data members.
 */
public class Time {
    int hr;
    int min;
    int seconds;
    Time(){
        hr = 0;
        min = 0;
        seconds = 0;
    }
    Time(int hr, int min, int seconds){
        this.hr = hr;
        this.min = min;
        this.seconds = seconds;
    }
    void setTime(int hr, int min, int seconds){
        this.hr = hr;
        this.min = min;
        this.seconds = seconds;
    }
    void displayTime(){
        System.out.println(hr+":"+min+":"+seconds);
    }
}
