package calculator.input;

public class InputParser {
    private static final String plus = "+";
    private static final String minus = "-";
    private static final String multi = "*";
    private static final String div = "/";


    public static String[] inputCommand(String command) {
        String[] s = command.split(" ");
        return s;
    }
}
