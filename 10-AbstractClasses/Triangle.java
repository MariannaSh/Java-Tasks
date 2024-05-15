public class Triangle extends Shape{
    
    private double base;
    private double height;
    private int a;

    public Triangle(double base, double height,int a) {
        this.base = base;
        this.height = height;
        this.a=a;
    }

    @Override
    public double area(){
        return 0.5*base*height;
    }

    public double perimeter(){
        return a+base+a;
    }

    public static void main(String[] args) {
        Triangle t1=new Triangle(12, 10,2);
        System.out.println(t1.area());
        System.out.println(t1.perimeter());
    }

}
