public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] result=new int[]{getSeats(),maxSpeed};
        return result;
    }

    public static void main(String[] args) {
        Vehicle v1=new Vehicle(4);
        Car car1=new Car(v1.getSeats(), 250);
        
       // System.out.println(car1.spec()[0]);
        int[] carSpec=car1.spec();
        System.out.println("Number of seats: "+carSpec[0]+"\nMax speed: "+carSpec[1]);
    }

    

}
