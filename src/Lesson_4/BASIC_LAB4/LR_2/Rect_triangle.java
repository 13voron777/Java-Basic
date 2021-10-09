package Lesson_4.BASIC_LAB4.LR_2;

public class Rect_triangle extends Figure {
    private double kat1;
    private double kat2;

    public Rect_triangle(double kat1, double kat2) {
        this.kat1 = kat1;
        this.kat2 = kat2;
    }

    @Override
    public double square() {
        return (kat1 * kat2) / 2;
    }
}
