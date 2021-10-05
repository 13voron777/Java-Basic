package Lesson_2.BASIC_LAB2.EXTRA2;

public class Run {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 4);

        System.out.println("Сумма дробей: " + fraction1.sum(fraction2));
        System.out.println("Разность дробей: " + fraction1.diff(fraction2));
        System.out.println("Умножение дробей: " + fraction1.mul(fraction2));
        System.out.println("Деление дробей: " + fraction1.div(fraction2));
        System.out.println();

        FractionComplex fraction3 = new FractionComplex(1, 2);
        FractionComplex fraction4 = new FractionComplex(1, 4);
        FractionComplex mul = fraction3.mul(fraction4);

        System.out.println("Сумма дробей: " + mul.getNumerator() + "/"
                + mul.getDenominator());
        System.out.println("Разность дробей: " + mul.getNumerator() + "/"
                + mul.getDenominator());
        System.out.println("Умножение дробей: " + mul.getNumerator() + "/"
                + mul.getDenominator());
        System.out.println("Деление дробей: " + mul.getNumerator() + "/"
                + mul.getDenominator());
        System.out.println("Counter: " + FractionComplex.getCounter());
    }
}
