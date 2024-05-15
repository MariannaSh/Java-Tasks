import java.util.Scanner;
class NewProg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x = sc.nextLine();
        String pomoshnik = sc.next();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Привет, "+x+", это твой помощник "+pomoshnik+".");
        System.out.println("У тебя "+y+" новых писем.");
    }
}
