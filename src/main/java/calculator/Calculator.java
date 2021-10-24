package calculator;

public class Calculator {
    private static final int ZERO = 0;
    private int currentValue = 0;

    public Calculator() {
    }

    public Calculator(int currentValue) {
        this.currentValue = currentValue;
    }

    public int plus(int plusValue) {
        return currentValue + plusValue;
    }
}
