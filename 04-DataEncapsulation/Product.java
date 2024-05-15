public class Product{
    private String name;
    private boolean vegetarian;

    public Product(String name, boolean vegetarian){
        this.name=name;
        this.vegetarian=vegetarian;
    }

    
    
    public void setName(String name) {
        this.name = name;
    }
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }


    public String getName() {
        return name;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }

    public String toString(){
        return "Na koncu mamy "+name+" ,ktory/a "+vegetarian;
    }



    public static void main(String1[] args) {
        Product p1=new Product("kurczak", false);
        System.out.println(p1.getName());
        System.out.println(p1.isVegetarian());
        p1.setName("mandarin");
        p1.setVegetarian(true);
        System.out.println(p1.toString());

    }
}