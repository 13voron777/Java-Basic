package Lesson_3.BASIC_LAB3.EXTRA1;

public class Run {
    public static void main(String[] args) {
        Pet pet = new Pet("Gena", "Krokodil");
        Dog dog = new Dog("Sharik", "Dog");
        Cat cat = new Cat("Sam", "Cat");
        Hamster hamster = new Hamster("Elvin", "Hamster");
        Parrot parrot = new Parrot("Kesha", "Parrot");

        pet.sound();
        pet.show();
        pet.type();
        System.out.println();

        dog.sound();
        dog.show();
        dog.type();
        System.out.println();

        cat.sound();
        cat.show();
        cat.type();
        System.out.println();

        hamster.sound();
        hamster.show();
        hamster.type();
        System.out.println();

        parrot.sound();
        parrot.show();
        parrot.type();
    }
}
