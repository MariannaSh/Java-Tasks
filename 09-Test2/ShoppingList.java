import java.util.ArrayList;

public class ShoppingList {
    private ArrayList <Product> list= new ArrayList<>();

    public void add(Product product){
        list.add(product);
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
 //используем его для построения строки путем последовательного добавления символов

        for(Product product: list){
            result.append(product.getName());
            result.append(",");
        }

        if(!list.isEmpty()){
            result.deleteCharAt(result.length()-1);
        }
        return result.toString(); //етод преобразует объект в его строковое представление
    }

    public int total(){
        int count=0;
        for (Product product:list){
            count+=product.getQuantity();
        }
        return count;
    }

    public static void main(String[] args) {
        Product p1=new Product("Moloko", 2);
        Product p2=new Product("Apple", 6);

        ShoppingList list1=new ShoppingList();
        list1.add(p1);
        list1.add(p2);

        System.out.println(list1.toString());
        System.out.println("Total: "+list1.total());
    }

}
