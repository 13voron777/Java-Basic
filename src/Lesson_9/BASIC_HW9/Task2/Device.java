package Lesson_9.BASIC_HW9.Task2;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
