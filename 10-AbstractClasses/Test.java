public class Test {
    public static void main(String[] args) {
        User user1=new User("Jon", "Doe", "jondoe@gmail.com", "+375443546672");

        SMS sms1=new SMS("Hello!", user1);
        sms1.send();

        System.out.println();
        
        Email email1=new Email("Hello this email1", user1, "EMAIL1");
        email1.send();
    }
}
