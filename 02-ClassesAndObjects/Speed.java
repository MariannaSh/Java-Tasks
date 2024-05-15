import java.util.Scanner;

import javax.sound.midi.Track;
class Speed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter vehicle speed: ");
        int speed = sc.nextInt();
        boolean t=true;
        boolean f=false;
        if (speed>40 && speed<140){
            System.out.println("Speed is valid: " +t);
        }
        else{
            System.out.println("Speed is valid: "+f);
        }

    }
}
