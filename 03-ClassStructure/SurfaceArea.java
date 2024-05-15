public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }

    static float circle(float r){
        return (float) (Math.PI * 2 * r);
    }

    static float triangle(float a, float h){
        return (a*h)/2;
    }

    static float cuboid(int a, int b, int c){
        return 2*a*b+2*a*c+2*b*c;
    }

    static float sphere (float r) {
        // float pi= 3.14f;
        return (float) (4*(Math.PI)*r*r);
    } 

    static float cone (float r, float l) {
        return (float) (Math.PI*r*r+Math.PI*r*l);
    }

    public static void main(String[] args) {
        System.out.print("Rectangle area (5,2) is ");
        System.out.println(rectangle(5,2));
        System.out.print("Circle area (3) is ");
        System.out.println(circle(3));
        System.out.print("Triangle area (3,4) is ");
        System.out.println(triangle(3, 4));
        System.out.println("Area of cuboid: "+cuboid(1,2,3));
        System.out.println(sphere(4));
        System.out.println(cone(5,10));


    }
}


