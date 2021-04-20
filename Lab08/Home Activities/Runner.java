package Lab08.Activity01;

public class Runner {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("John");
        p1.display();
        System.out.println();

        Student s1 = new Student("Junior");
        s1.setName("Paul");
        s1.display();
        System.out.println();

        Employee e1 = new Employee();
        e1.setName("Peter");
        e1.display();
        System.out.println();

        Faculty f1 = new Faculty();
        f1.setName("Jack");
        f1.display();
        System.out.println();
        
        Staff st = new Staff();
        st.setName("Rose");
        st.display();
        
    }
}
