package game.model;

import game.controller.FieldCheckerImpl;
import game.view.BoardPrinter;
import game.view.ConsoleCleaner;
import game.view.MessagePrinter;

public class Runner {

    public void run() {
        Board board = new Board();
        BoardPrinter boardPrinter = new BoardPrinter(board);
        FieldCheckerImpl fieldChecker = new FieldCheckerImpl();
        MessagePrinter messagePrinter = new MessagePrinter();
        ConsoleCleaner consoleCleaner = new ConsoleCleaner();
        PatternChecker pattenChecker = new PatternChecker(board, fieldChecker, messagePrinter);
        boardPrinter.printBoard();
        Game game = new Game(board, pattenChecker);
        boolean end = game.isGameWon();
        while (!end) {
            consoleCleaner.clearScreen();
            boardPrinter.printBoard();
            game.playTurn();
            boardPrinter.printBoard();
            game.playBotTurn();
            boardPrinter.printBoard();
            end = game.isGameWon();
        }
    }
}
