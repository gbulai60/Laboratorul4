package org.example;

class FractionImpl implements Fraction {
    private int numerator;
    private  int denominator;

    public FractionImpl(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public Fraction add(Fraction fraction) {
        int commonDenominator = this.denominator * fraction.getDenominator();
        int newNumerator1 = this.numerator *  fraction.getDenominator();
        int newNumerator2 = fraction.getNumerator() * this.denominator;
        return new FractionImpl(newNumerator1 + newNumerator2, commonDenominator);
    }

    @Override
    public Fraction subtract(Fraction fraction) {
        int commonDenominator = this.denominator * fraction.getDenominator();
        int newNumerator1 = this.numerator * fraction.getDenominator();
        int newNumerator2 = fraction.getNumerator() * this.denominator;
        return new FractionImpl(newNumerator1 - newNumerator2, commonDenominator);
    }

    @Override
    public Fraction multiply(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getNumerator();
        int newDenominator = this.denominator * fraction.getDenominator();
        return new FractionImpl(newNumerator, newDenominator);
    }

    @Override
    public Fraction divide(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getDenominator();
        int newDenominator = this.denominator * fraction.getNumerator();
        return new FractionImpl(newNumerator, newDenominator);
    }

    @Override
    public int getDenominator() {
        return this.denominator;
    }

    @Override
    public int getNumerator() {
        return this.numerator;
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
