package game.model;

import game.controller.MovementController;


class Game {

    private Board board;
    private PatternChecker patternChecker;

    Game(Board board, PatternChecker patternChecker) {
        this.board = board;
        this.patternChecker = patternChecker;
    }

    void playTurn() {
        MovementController movementController = new MovementController(board);
        movementController.getInput();
    }

    void playBotTurn() {
        if (!isGameWon()) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int randomRow = rng.rng(board.getFields().length);
        int randomCol = rng.rng(board.getFields().length);
        Field field = board.getFields()[randomRow][randomCol];
        if (field.getValue().equals(Value.EMPTY)) {
            field.setValue(Value.O);
            //System.out.println("ROW:" + randomRow + " COL: " + randomCol);
        } else {
            playBotTurn();
        }
        }
    }

    public boolean isGameWon() {
        if (patternChecker.checkRows()) return true;
        else if (patternChecker.checkColumns()) return true;
        else if (patternChecker.checkDiagonally()) return true;
        else return patternChecker.checkForDraw();
    }


}
