package game.controller;

import java.util.Scanner;

public class InputPrompter {

    Scanner scanner = new Scanner(System.in);

    public String promptForInput() {
        String input = scanner.nextLine();
        return input;
    }

    public int promptForInteger() {
        int integer = -1;
        try {
        integer = Integer.parseInt(promptForInput());
        } catch (NumberFormatException e) {
            System.out.println("Provided input is not a number. Try again");
            promptForInteger();
        }
        return integer;
    }
}
