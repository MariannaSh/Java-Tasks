public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private String color;
    private double price;


 public Smartphone(String brand, String model, int storageCapacity, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.color = color;
        this.price = price;
    }

    public void makeCall(String number) {
        // Реализация метода совершения звонка
    }

    public void sendMessage(String recipient, String message) {
        // Реализация метода отправки сообщения
    }

    public void takePhoto() {
        // Реализация метода съемки фотографии
    }
}