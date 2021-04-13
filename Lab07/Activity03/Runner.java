package Lab07.Activity03;

public class Runner {
    public static void main(String[] args) {
        Point start = new Point(Math.random()*100,Math.random()*100);
        Point end = new Point(Math.random()*100,Math.random()*100);
        start.display();
        System.out.println();
        end.display();
        System.out.println();
        Point start1 = new Point(Math.random()*100,Math.random()*100);
        Point end1 = new Point(Math.random()*100,Math.random()*100);
        start1.display();
        System.out.println();
        end1.display();
        System.out.println();
        
        Line line = new Line(start, end);
        System.out.printf("Length:%.2f",line.getLength());
        System.out.println();
        Line line1 = new Line(start1, end1);
        System.out.printf("Length:%.2f",line1.getLength());
    
    }
   

}
