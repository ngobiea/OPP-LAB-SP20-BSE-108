package Lab09.Task01;

public class ClockExtended extends Clock {
    

    public ClockExtended(int hr, int min, int sec){
        super(hr, min, sec);
    }
    @Override
    public void display() {
        System.out.println("Time in AM/PM");
        if(getHr()>12){
            System.out.println("Time: "+(getHr()-12)+":"+getMin()+":"+getSec()+"PM");
        }
        else{
            if(getHr()==0){
                System.out.println("Time: "+(getHr()+12)+":"+getMin()+":"+getSec()+"AM");
            }else{
                System.out.println("Time: "+(getHr()+1)+":"+getMin()+":"+getSec()+"AM");
            }
        }
        System.out.println();
        System.out.println("Time in 24Hour");
        super.display();

    }
}
