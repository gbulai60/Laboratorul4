package org.example;

class FractionArray {
    private final Fraction[] fractions;

    public FractionArray(Fraction[] fractions) {
        this.fractions = fractions;
    }

    public void displayFractions() {
        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }
    }
}