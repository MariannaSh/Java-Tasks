public class Degrees {

    static String CelsiusToKelvin(float x){
        return x+273.15f+"K";
    }

    //Если метод должен возвращать значение, используйте "static". 
    //Если метод должен выполнить некоторые действия, но не возвращать значение, используйте "void"

    static String KelvinToCelsius(float x){
        return x-273.15f + "°C";
    }

    static String CelsiusToFahrenheit(float x) {
        return 1.8*x+32+"F";
    }

    static String FahrenheitToCelsius(float x) {
        return (x-32)/1.8f + "°C";
    }

    static String KelvinToFahrenheit(float x) {
        return 1.8*x-459.67 + "F";
    }

    static String FahrenheitToKelvin(float x) {
        return (x+459.67)/1.8 + "K";
    }

    public static void main(String[] args) {
        System.out.println(CelsiusToKelvin(25));
        System.out.println(CelsiusToFahrenheit(25)+"\n");

        System.out.println(FahrenheitToKelvin(100));
        System.out.println(FahrenheitToCelsius(100)+"\n");

        System.out.println(KelvinToCelsius(0));
        System.out.println(KelvinToFahrenheit(0));


    }
}
