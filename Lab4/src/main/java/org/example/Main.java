package org.example;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new FractionImpl(1, 2);
        Fraction fraction2 = new FractionImpl(1, 3);
        Fraction fraction3 = new FractionImpl(2, 3);

        Fraction[] fractions = {fraction1, fraction2, fraction3};
        FractionArray fractionArray = new FractionArray(fractions);

        FractionImpl fraction = (FractionImpl) fraction1;
        System.out.println("Fractions in the array:");
        fractionArray.displayFractions();

        for (int i = 0; i < fractions.length - 1; i++) {
            Fraction currentFraction = fractions[i];
            Fraction nextFraction = fractions[i + 1];

            Fraction sum = currentFraction.add(nextFraction);
            System.out.println("Sum of " + currentFraction + " and " + nextFraction + ": " + sum);

            Fraction difference = currentFraction.subtract(nextFraction);
            System.out.println("Difference of " + currentFraction + " and " + nextFraction + ": " + difference);

            Fraction product = currentFraction.multiply(nextFraction);
            System.out.println("Product of " + currentFraction + " and " + nextFraction + ": " + product);

            Fraction quotient = currentFraction.divide(nextFraction);
            System.out.println("Quotient of " + currentFraction + " and " + nextFraction + ": " + quotient);
        }
    }
}