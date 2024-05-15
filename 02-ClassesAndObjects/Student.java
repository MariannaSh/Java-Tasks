//import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Student {
    String name;
    int age;
    String studentID;
    int semesterNumber;
    String averageGrade;
    boolean studentIdCardValid;


    void sayHello(){
            System.out.println("Hello from "+name+"\n");
    }

    void displayName(){
        System.out.println(name);
    }

    void displayAge(){
        System.out.println(age);
    }

    void displayInfo(){
        System.out.println(semesterNumber+"\n"+averageGrade+"\n"+studentID);
    }

    void displaysVaid(){
        String vaid = (studentIdCardValid == true)? "Card is valid" : "Card is invalid";
        System.out.println(vaid+"\n");
    }
}