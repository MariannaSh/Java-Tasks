public class StudentTest {
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        s.studentID = "123454";
        s.semesterNumber=1;
        s.averageGrade="4.5";

        Student a = new Student();
        a.name = "Anna";
        a.age = 19;
        a.studentID = "1231414";
        a.semesterNumber = 2;
        a.averageGrade = "5.0";

        Student c = new Student();
        c.name = "Klaudia";
        c.age = 20;
        a.studentID= "1231484";
        a.semesterNumber = 3;
        a.averageGrade = "3.0";

        s.sayHello();
        s.displayName();
        s.displayAge();
        s.displayInfo();
        s.displaysVaid();

        // System.out.println(a.name + " " + a.age);
        a.sayHello();
        a.displayName();
        a.displayAge();
        a.displayInfo();
        a.displaysVaid();

        // System.out.println(c.name + " " + c.age);
        c.sayHello();
        c.displayName();
        c.displayAge();
        c.displayInfo();
        c.displaysVaid();

    }
}


