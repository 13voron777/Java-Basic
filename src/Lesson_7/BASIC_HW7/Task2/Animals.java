package Lesson_7.BASIC_HW7.Task2;

public enum Animals {
    DOG(15) {
        @Override
        public String getAnimal() {
            return "Dog";
        }
    }, CAT(10) {
        @Override
        public String getAnimal() {
            return "Cat";
        }
    }, CROCODILE(50) {
        @Override
        public String getAnimal() {
            return "Crocodile";
        }
    };

    int age;

    Animals(int age) {
        this.age = age;
    }

    public abstract String getAnimal();

    @Override
    public String toString() {
        return "Animal = " + this.getAnimal() + "; age = " + age;
    }
}
