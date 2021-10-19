package Lesson_7.BASIC_LAB7.LR_;

public class Run {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Газета");
            }
        };

        Printable[] array = new Printable[]{new Book(), new Magazine(), printable};
        for (Printable elem : array) {
            elem.print();
        }
    }
}
