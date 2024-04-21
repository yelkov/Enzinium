package enzinium;

import java.security.PublicKey;

public class IllegalTokenAmountException extends IllegalArgumentException {
    private PublicKey firstValue;
    private Double secondValue;

    public IllegalTokenAmountException(String s, PublicKey firstValue, Double secondValue) {
        super(s);
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public PublicKey getFirstValue() {
        return firstValue;
    }

    public Double getSecondValue() {
        return secondValue;
    }
}