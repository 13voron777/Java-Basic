package Lesson_9.BASIC_HW9.Task4;

import java.util.Objects;

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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " +
                "manufacturer = " + getManufacturer() +
                ", price = " + getPrice() +
                ", serialNumber = " + getSerialNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return this.getPrice() == device.getPrice()
                && this.getManufacturer().equals(device.getManufacturer())
                && this.getSerialNumber().equals(device.getSerialNumber());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 37 * result + Float.floatToIntBits(getPrice());
        result = 37 * result + (getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        return result;
    }
}
