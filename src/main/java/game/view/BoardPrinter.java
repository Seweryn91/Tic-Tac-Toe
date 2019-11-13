package game.view;

import game.model.Board;
import game.model.Field;

public class BoardPrinter {

    private Board board;

    public BoardPrinter(Board board) {
        this.board = board;
    }

    public void printBoard() {
        Field[][] fields = board.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println("\n");
            System.out.print(i + " ");
            for (int j = 0; j < fields.length; j++) {
                System.out.print(fields[i][j].getValue() + " ");
            }
        }
    }

}
