package Lesson_2.BASIC_HW2.Task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Blue");
        Car car3 = new Car(250);
        Car car4 = new Car("Aquamarine", 3);
        Car car5 = new Car(2000, 220);
        Car car6 = new Car("White", 7, 2300);
        Car car7 = new Car("Silver", 2, 300);
        Car car8 = new Car("Black", 4, 2500, 200.0);
        Car car9 = new Car("Red", 250.0, 4, 2400);

        Car[] cars = new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9};
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car" + (i + 1) + ": Color: " + cars[i].getColor() + "\t Speed: " + cars[i].getSpeed()
                    + "\t Age: " + cars[i].getAge() + "\t Weight: " + cars[i].getWeight());
        }
    }
}