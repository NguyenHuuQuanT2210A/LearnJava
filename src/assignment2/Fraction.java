package assignment2;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction() {
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    void printFraction() {
        System.out.println("Phan so: " + this.numerator + "/" + this.denominator);
    }

    void printFractionNgichDao() {
        System.out.println("Phan so: " + this.denominator + "/" + this.numerator);
    }

    public int timUSCLN(int a, int b) {
        while(a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }

    public void toiGianPhanSo() {
        int i = this.timUSCLN(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }
}