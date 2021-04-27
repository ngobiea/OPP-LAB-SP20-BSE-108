package Lab09.Task03;
/*Create an Abstract class Student that contains a method take exam, implement the method 
in the child classes PhdStudent and GradStudent in which PhdStudent takes exam by 
giving his final defense presentation while the graduate student gives a written paper.*/
public class GradStudent extends Student {
    
    
    @Override
    public void takeExam(){

        System.out.println("Take exam by written paper");
    }
}
