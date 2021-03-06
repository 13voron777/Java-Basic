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

    public FractionComplex sum(FractionComplex fraction) {
        counter++;
        int resNumerator;
        int resDenominator;
        if (this.denominator > fraction.denominator) {
            if (this.denominator % fraction.denominator == 0) {
                resDenominator = this.denominator;
                resNumerator = this.numerator + fraction.numerator * (this.denominator / fraction.denominator);
            } else {
                resDenominator = this.denominator * fraction.denominator;
                resNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
            }
        } else if (this.denominator < fraction.denominator) {
            if (fraction.denominator % this.denominator == 0) {
                resDenominator = fraction.denominator;
                resNumerator = fraction.numerator + this.numerator * (fraction.denominator / this.denominator);
            } else {
                resDenominator = this.denominator * fraction.denominator;
                resNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
            }
        } else {
            resDenominator = this.denominator;
            resNumerator = this.numerator + fraction.numerator;
        }
        return new FractionComplex(resNumerator, resDenominator);
    }

    public FractionComplex diff(FractionComplex fraction) {
        counter++;
        int resNumerator;
        int resDenominator;
        if (this.denominator > fraction.denominator) {
            if (this.denominator % fraction.denominator == 0) {
                resDenominator = this.denominator;
                resNumerator = this.numerator - fraction.numerator * (this.denominator / fraction.denominator);
            } else {
                resDenominator = this.denominator * fraction.denominator;
                resNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
            }
        } else if (this.denominator < fraction.denominator) {
            if (fraction.denominator % this.denominator == 0) {
                resDenominator = fraction.denominator;
                resNumerator = this.numerator * (fraction.denominator / this.denominator) - fraction.numerator;
            } else {
                resDenominator = this.denominator * fraction.denominator;
                resNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
            }
        } else {
            resDenominator = this.denominator;
            resNumerator = this.numerator - fraction.numerator;
        }
        return new FractionComplex(resNumerator, resDenominator);
    }

    public FractionComplex mul(FractionComplex fraction) {
        counter++;
        return new FractionComplex(this.numerator * fraction.numerator, this.denominator * fraction.denominator);
    }

    public FractionComplex div(FractionComplex fraction) {
        counter++;
        return new FractionComplex(this.numerator * fraction.denominator, this.denominator * fraction.numerator);
    }
}
