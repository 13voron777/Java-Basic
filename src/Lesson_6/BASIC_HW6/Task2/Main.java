public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Wheel wheel = new Vehicle.Wheel();
        Vehicle.Door door = new Vehicle.Door();

        vehicle.print();
        wheel.print();
        door.print();
    }
}
