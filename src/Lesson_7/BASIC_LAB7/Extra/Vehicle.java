package Lesson_7.BASIC_LAB7.Extra;

public enum Vehicle {
    OPEL(10) {
        @Override
        public String getColor() {
            return "White";
        }
    }, AUDI(20) {
        @Override
        public String getColor() {
            return "Black";
        }
    }, BMW(50) {
        @Override
        public String getColor() {
            return "Aquamarine";
        }
    };

    int sum;

    Vehicle(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Vehicle = " + this.name() +
                "; sum = " + sum +
                "; color = " + this.getColor();
    }

    public abstract String getColor();
}
