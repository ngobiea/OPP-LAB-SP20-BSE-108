package Lab09.Task01;
/*Implement a Clock class that simulates time in hr:min:sec, derive a child class that 
overrides the display method and displays the time in both AM/PM and 24 hour format.*/

public  class Clock {
    private int hr;
    private int min;
    private int sec;

    public Clock(int hr, int min, int sec){
        if(hr>=0 && hr<=23) this.hr = hr;
        if( sec>=0 && sec<=59)this.sec = sec;
        if(min>=0 && min<59)this.min = min;
    }
    public Clock(){
        
    }
    public void setHr(int hr){
        if(hr>=0 && hr<=23) this.hr = hr;
        else System.out.println("Invalid time");
    }
    public void setMin(int min){
        if(min>=0 && min<59)this.min = min;
        else System.out.println("Invalid time");
    }
    public void setSec(int sec){
        if( sec>=0 && sec<=59)this.sec = sec;
        else System.out.println("Invalid time");
    }
    public int getSec() {
        return sec;
    }
    public int getMin() {
        return min;
    }
    public int getHr() {
        return hr;
    }

    public void display(){
        System.out.println("Time: "+(getHr())+":"+getMin()+":"+getSec()+"GMT");
    }
    
}
