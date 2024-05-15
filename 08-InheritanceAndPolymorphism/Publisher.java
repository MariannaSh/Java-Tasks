public class Publisher {
    private String name, city;

    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public void display() {
        System.out.println("Name: "+name+"\n"+"City: "+city);
        System.out.println();
    }
    
}
