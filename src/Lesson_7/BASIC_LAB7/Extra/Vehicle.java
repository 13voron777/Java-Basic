package Lesson_7.BASIC_LAB7.Extra;

public enum Vehicle {
    OPEL(10) {
        @Override
        public String getColor() {
            return "White";
        }

        @Override
        public String getVehicle() {
            return "Opel";
        }
    }, AUDI(20) {
        @Override
        public String getColor() {
            return "Black";
        }

        @Override
        public String getVehicle() {
            return "Audi";
        }
    }, BMW(50) {
        @Override
        public String getColor() {
            return "Aquamarine";
        }

        @Override
        public String getVehicle() {
            return "BMW";
        }
    };
    int sum;

    Vehicle(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Vehicle = " + this.getVehicle() +
                "; sum = " + sum +
                "; color = " + this.getColor();
    }

    public abstract String getColor();
    public abstract String getVehicle();
}
