package Lab08.Assignment1;
/*tape, which adds a playing time in minutes. */
public class Tape extends Publication{
    private int playingTime;

    public Tape(){

    }
    public Tape(int playingTime){
        this.playingTime = playingTime;
    }
    public void setPlayingTime(int playingTime){
        this.playingTime = playingTime;
    }
    public int getPlayingTime(){
        return playingTime;
    }
    @Override
    public void display(){
        System.out.println("Title:"+getTitle()+"\nPrice:"+getPrice()+"\nPage count: " + getPlayingTime());
    }
}
