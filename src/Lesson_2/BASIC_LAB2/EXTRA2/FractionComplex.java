package Lesson_2.BASIC_LAB2.EXTRA2;

public class FractionComplex {
    private int numerator;
    private int denominator;
    private static int counter;

    public FractionComplex(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static int getCounter() {
        return counter;
    }

    /*public FractionComplex sum(FractionComplex fraction) {
    counter++;
        return new FractionComplex();
    }

    public FractionComplex diff(FractionComplex fraction) {
    counter++;
        return new FractionComplex();
    }*/

    public FractionComplex mul(FractionComplex fraction) {
        counter++;
        return new FractionComplex(this.numerator * fraction.numerator, this.denominator * this.denominator);
    }

    /*public FractionComplex div(FractionComplex fraction) {
    counter++;
        return new FractionComplex();
    }*/
}
