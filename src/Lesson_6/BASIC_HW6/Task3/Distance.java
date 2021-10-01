package Lesson_6.BASIC_HW6.Task3;

public class Distance {
    public double distance;

    public void print() {

    }

    static class Converter {
        public double mvkm(double metres) {
            return metres / 1000;
        }

        public double kmvmil(double km) {
            return km * 0.62;
        }
    }
}
