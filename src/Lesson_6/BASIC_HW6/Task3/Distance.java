package Lesson_6.BASIC_HW6.Task3;

public class Distance {
    public double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public void print() {
        System.out.println(this.distance + " m = " + new Converter().mvkm(this.distance) + " km");
        System.out.println(this.distance + " km = " + new Converter().kmvmil(this.distance) + " miles");
    }

    class Converter {
        public double mvkm(double metres) {
            return metres / 1000;
        }

        public double kmvmil(double km) {
            return km * 0.62;
        }
    }
}
