package game.view;

import game.model.Board;
import game.model.Field;
import game.model.Value;

public class BoardPrinter {

    private Board board;

    public BoardPrinter(Board board) {
        this.board = board;
    }

    public void printBoard() {
        char vertical = '|';
        String cross = " X ";
        String nought = " O ";
        String empty = "   ";
        String horizontalLine = "---+---+---";
        Field[][] fields = board.getFields();
        System.out.println("");

        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields.length; j++) {
                if (j > 0) System.out.print(vertical);
                Field field = fields[i][j];
                if (field.getValue().equals(Value.EMPTY)) {
                    System.out.print(empty);
                } else if (field.getValue().equals(Value.X)) {
                    System.out.print(cross);
                } else if (field.getValue().equals(Value.O)) {
                    System.out.print(nought);
                }
            }
            if (i < fields.length-1) System.out.println("\n" + horizontalLine);
        }
    }
}