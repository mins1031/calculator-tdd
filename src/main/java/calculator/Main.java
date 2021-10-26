package calculator;

import calculator.input.InputParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input == null) {
                break;
            }
            InputParser.inputCommand(input);
        }
    }
}
