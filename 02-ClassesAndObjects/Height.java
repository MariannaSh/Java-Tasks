import java.util.Scanner;

class Height{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        double feet=height/30.48;
        double inches=(height%30.48)/2.54;
        System.out.println("I am "+height+"cm tall, i.e. "+(int)Math.floor(feet)+ " feet and "+(int)Math.round(inches) +" inches");
    }
}