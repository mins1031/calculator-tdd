package calculator.input;

import calculator.Calculator;

public class InputParser {
    private static final String plus = "+";
    private static final String minus = "-";
    private static final String multi = "*";
    private static final String div = "/";

    public static final Calculator calculator = new Calculator();

    private static final int ZERO = 0;
    private static int currentValue = 0;

    public static int inputCommand(String command) {
        String[] rawCommand = command.split(" ");
        currentValue = Integer.parseInt(rawCommand[0]);

        for (int i = 1 ; i < rawCommand.length; i += 2){
            if (rawCommand[i].equals(plus)) {
                currentValue = calculator.plus(currentValue, Integer.parseInt(rawCommand[i+1]));
            }

            if (rawCommand[i].equals(minus)) {
                currentValue = calculator.minus(currentValue, Integer.parseInt(rawCommand[i+1]));
            }

        }
        return currentValue;
    }
}
