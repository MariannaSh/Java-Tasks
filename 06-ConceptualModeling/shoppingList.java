import java.util.ArrayList;
import java.util.Scanner;

public class shoppingList {
    ArrayList<String> shopping=new ArrayList<>();

    public void display(){
        System.out.println(shopping);
    }

    public void numberProducts(){
        System.out.println(shopping.size());
    }

    public void addProducts(String product ){
        shopping.add(product);
    }

    public static void main(String[] args) {
        shoppingList l1=new shoppingList();
        Scanner sc = new Scanner(System.in);

        l1.display();
        l1.numberProducts();
        String product1=sc.nextLine();
        l1.addProducts(product1);
        String product2 = sc.nextLine();
        l1.addProducts(product2);
        String product3=sc.nextLine();
        l1.addProducts(product3);
        l1.display();
        l1.numberProducts();
        String product4=sc.nextLine();
        l1.addProducts(product4);
        l1.display();
        l1.numberProducts();
    }
}
