import java.util.Scanner;

import javax.swing.Spring;

class Bank23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bank buys EUR: ");
        double buy = sc.nextDouble();
        System.out.print("Bank sells EUR: ");
        double sells=sc.nextDouble();
        double spread= sells-buy;
        System.out.printf("Spread: %.4f%n", spread );
    }
}
