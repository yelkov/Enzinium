package enzinium;

import java.security.PublicKey;

public class IllegalTokenAmountException extends IllegalArgumentException {
    private double firstValue;
    private double secondValue;

    public IllegalTokenAmountException(String s, double firstValue, double secondValue) {
        super(s);
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }
}