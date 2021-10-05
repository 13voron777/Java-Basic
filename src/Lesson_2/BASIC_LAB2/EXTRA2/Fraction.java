package Lesson_2.BASIC_LAB2.EXTRA2;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public double sum(Fraction fraction) {
        return this.numerator / this.denominator + fraction.numerator / fraction.denominator;
    }

    public double diff(Fraction fraction) {
        return this.numerator / this.denominator - fraction.numerator / fraction.denominator;
    }

    public double mul(Fraction fraction) {
        return (this.numerator / this.denominator) * (fraction.numerator / fraction.denominator);
    }

    public double div(Fraction fraction) {
        return (this.numerator / this.denominator) / (fraction.numerator / fraction.denominator);
    }
}
