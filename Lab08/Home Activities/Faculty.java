package Lab08.Activity01;
/*A faculty member has office hours and a rank.*/
public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(){

    }
    public Faculty(String officeHours,String rank){
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    public String getOfficeHours(){
        return officeHours;
    }
    public String getRank(){
        return rank;
    }
    @Override
    public void display(){
        System.out.println("Class Name: Faculty"+"\nName:"+getName());
    }
}
