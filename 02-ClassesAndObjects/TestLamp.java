public class TestLamp {
    public static void main(String[] args) {
        Lamps lamp1=new Lamps();
        lamp1.lampIsOn=true;

        Lamps lamp2=new Lamps();
        lamp2.lampIsOn=false;

        lamp1.info();
        lamp1.switchOnLamp();
        lamp1.switchOffLamp();

        lamp2.info();
        lamp2.switchOnLamp();
        lamp2.switchOffLamp();

    }
}
