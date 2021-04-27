package Lab09.Task02;
import java.util.*;
public class CustomStringTokenizer {
    public static void main(String[] args) {
      
    StringTokenizer s1 = new StringTokenizer("I drive two to three miles to the unviversity");
    StringTokenizer s2 = new StringTokenizer("I drive 2 to 3 miles to the unviversity");
            
    int count = countTokens(s1);
    System.out.println("Number of Tokens in string 1: "+ count);
    
    count = countTokens(s2);
    System.out.println("Number of Tokens in string 2: "+ count);
    }

    public static int countTokens(StringTokenizer s){
        int count=s.countTokens(), finalCount=0;
        String temp;
        boolean flag;
        double dValue;
        
        for(int i=0;i<count;i++){
            flag=true;
            temp=s.nextToken();
           
            try{
                dValue = Double.parseDouble(temp);
            }
            catch(NumberFormatException e){
                flag=false;
            }
          
            if(!flag)
                finalCount++;
        }
        return finalCount;
    }
}
