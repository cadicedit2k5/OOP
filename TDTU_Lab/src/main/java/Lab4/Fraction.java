/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author ADMIN
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        int tu = this.numerator * f.denominator + this.denominator + f.numerator;
        int mau = this.denominator + f.denominator;

        return new Fraction(tu, mau);
    }

    public Fraction sub(Fraction otherFraction) {
        int newNum = this.numerator * otherFraction.denominator - otherFraction.numerator * this.denominator;
        int newDeno = this.denominator * otherFraction.denominator;
        return new Fraction(newNum, newDeno);
    }

    public Fraction mul(Fraction otherFraction) {
        int newNum = this.numerator * otherFraction.numerator;
        int newDeno = this.denominator * otherFraction.denominator;
        return new Fraction(newNum, newDeno);
    }

    public Fraction div(Fraction otherFraction) {
        int newNum = this.numerator * otherFraction.denominator;
        int newDeno = this.denominator * otherFraction.numerator;
        return new Fraction(newNum, newDeno);
    }

    public void reducer() {
        int min = (numerator < denominator) ? numerator : denominator;
        for (int i = min; i > 0; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
                break;
            }
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Numerator: " + numerator +" Denominator: " + denominator;
    }
}
