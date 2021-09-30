public class Vehicle {
    public void print() {
        System.out.println(this.getClass().getSimpleName());
    }

    public static class Wheel {
        public void print() {
            System.out.println(this.getClass().getSimpleName());
        }
    }

    public static class Door {
        public void print() {
            System.out.println(this.getClass().getSimpleName());
        }
    }
}
