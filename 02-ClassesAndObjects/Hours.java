import java.util.Scanner;

class Hours {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("hours = ");
        int hours=sc.nextInt();
        System.out.print("minutes = ");
        int minutes=sc.nextInt();
        System.out.printf("time: %d:%d%n", hours,minutes);
        int from_midnight=hours*60+minutes;
        System.out.printf("minutes from midnight: %d%n", from_midnight);
        int seconds_from_midnight=from_midnight*60;
        System.out.printf("seconds from midnight: %d", seconds_from_midnight);
    }
}
