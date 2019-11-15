package game.view;

import game.model.Value;

public class MessagePrinter {

    public void printVictory(Value value) {
        System.out.println("Player " + value + " wins!");
    }

    public void printDraw() {
        System.out.println("This round was draw!");
    }
}
