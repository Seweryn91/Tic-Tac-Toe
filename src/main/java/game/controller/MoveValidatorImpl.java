package game.controller;

import game.model.Board;

public class MoveValidatorImpl implements MoveValidator {

    private Board board;
    private InputPrompter inputPrompter;
    private FieldCheckerImpl fieldChecker;

    public MoveValidatorImpl(Board board, InputPrompter inputPrompter, FieldCheckerImpl fieldChecker) {
        this.board = board;
        this.inputPrompter = inputPrompter;
        this.fieldChecker = fieldChecker;
    }

    public boolean isValidInteger(int input) {
        int inputInteger = input;

        if (inputInteger != -1) {
            if (inputInteger >= 0) {
                return inputInteger < board.getFields().length;
            }
        }
        System.out.println("Provided number is invalid");
        return false;
    }
}