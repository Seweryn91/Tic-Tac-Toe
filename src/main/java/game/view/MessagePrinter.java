package game.view;

import game.model.Value;

public class MessagePrinter {

    public void printVictory(Value value) {
        System.out.println("\nPlayer " + value + " wins!");
    }

    public void printDraw() {
        System.out.println("\nThis round was draw!");
    }
}
