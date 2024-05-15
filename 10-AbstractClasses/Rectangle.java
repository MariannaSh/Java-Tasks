public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double area(){
        return a*b;
    }

    public double perimeter(){
        return 2*(a+b);
    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2, 3);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
