package Lesson_8.BASIC_LAB8.LR1;

public class AnimalControlClass {
    private boolean collar;
    private boolean leash;
    private boolean scarf;
    private boolean sweater;

    public AnimalControlClass(boolean collar, boolean leash, boolean scarf, boolean sweater) {
        this.collar = collar;
        this.leash = leash;
        this.scarf = scarf;
        this.sweater = sweater;
    }

    public boolean isCollar() { // ошейник
        return this.collar;
    }

    public boolean isLeash() { // поводок
        return this.leash;
    }
    public boolean isScarf() { // шарф
        return this.scarf;
    }
    public boolean isSweater() { // свитер
        return this.sweater;
    }

    public void walk() throws AnimalException {
        if (isCollar() && isLeash() && isScarf() && isSweater()) {
            System.out.println("Всё по феншую, собака идет гулять!");
        } else {
            System.out.println("Сейчас будет исключение.");
            throw new AnimalException("Собака не по феншую одета!");
        }
    }
}
