package Lesson_4.BASIC_LAB4.LR_2;

public class Run {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{new Rectangle(5, 4), new Circle(2),
                new Rect_triangle(4, 4), new Trapezoid(7, 5, 4)};

        for (Figure figure: figures) {
            System.out.println(figure.square());
        }
    }
}
