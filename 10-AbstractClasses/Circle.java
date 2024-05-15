public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return Math.PI*(radius+radius);
    }

    public static void main(String[] args) {
        Circle c1=new Circle(2);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
