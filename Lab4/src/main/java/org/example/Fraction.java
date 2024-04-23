package org.example;

interface Fraction {

    Fraction add(Fraction fraction);

    Fraction subtract(Fraction fraction);

    Fraction multiply(Fraction fraction);

    Fraction divide(Fraction fraction);

    int getDenominator();

    int getNumerator();

}