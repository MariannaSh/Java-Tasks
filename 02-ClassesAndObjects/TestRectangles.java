public class TestRectangles {
    public static void main(String[] args) {
        Rectangles rec=new Rectangles();
        rec.side1=3;
        rec.side2=4;

        rec.showDimensions();
        rec.showPerimetr();
        rec.showArea();

        Rectangles rec2=new Rectangles();
        rec2.side1=2;
        rec.side2=7;

        rec.showDimensions();
        rec.showPerimetr();
        rec.showArea();
    }
}
