package Lesson_9.BASIC_LAB9.LR;

public class Car {
    private int id;
    private String name;
    private String model;
    private int year;
    private String color;
    private double price;
    private String regNumber;

    public Car(int id, String name, String model, int year, String color, double price, String regNumber) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id = " + id +
                ", name = " + name +
                ", model =" + model +
                ", year = " + year +
                ", color = " + color +
                ", price = " + price +
                ", regNumber = " + regNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && year == car.year && price == car.price
                && name.equals(car.name) && model.equals(car.model)
                && color.equals(car.color) && regNumber.equals(car.regNumber);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + id;
        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + (model == null ? 0 : model.hashCode());
        result = 37 * result + year;
        result = 37 * result + (color == null ? 0 : color.hashCode());
        result = (int) (37 * result + Double.doubleToLongBits(price));
        result = 37 * result + (regNumber == null ? 0 : regNumber.hashCode());
        return result;
    }
}
