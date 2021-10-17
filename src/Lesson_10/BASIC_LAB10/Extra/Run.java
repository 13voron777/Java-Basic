package Lesson_10.BASIC_LAB10.Extra;

public class Run {
    public static void main(String[] args) {
        MyClass.factoryMethod(4);
        MyClass.factoryMethod(4.5);
        MyClass.factoryMethod(4.7f);
        MyClass.factoryMethod("4");
        MyClass.factoryMethod('4');
        MyClass.factoryMethod(true);
        MyClass.factoryMethod(new MyClass());
    }
}
