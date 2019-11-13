package game.controller;

import game.model.Board;
import game.model.Field;
import game.model.Value;

public class MovementController {

    private Board board;

    public MovementController(Board board) {
        this.board = board;
    }

    public void getInput() {
        InputPrompter inputPrompter = new InputPrompter();
        FieldCheckerImpl fieldChecker = new FieldCheckerImpl();
        MoveValidatorImpl moveValidator = new MoveValidatorImpl(board, inputPrompter, fieldChecker);
        System.out.println(" ");
        System.out.println("Provide row index");
        int row = inputPrompter.promptForInteger();
        System.out.println("Provide col index");
        int col = inputPrompter.promptForInteger();

        if (moveValidator.isValidInteger(row) && moveValidator.isValidInteger(col)) {
            if (setValue(row, col)) return;
            else getInput();
        } else {
            getInput();
        }
    }

    private boolean setValue(int row, int col) {
        Field field = board.getFields()[row][col];
        if (field.getValue() == Value.EMPTY) {
            field.setValue(Value.X);
            return true;
        } else {
        System.out.println("Try again");
        return false;
        }
    }
}
