import game.controller.FieldCheckerImpl;
import game.model.Board;
import game.view.BoardPrinter;
import game.model.PatternChecker;
import game.model.Turn;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        BoardPrinter boardPrinter = new BoardPrinter(board);
        FieldCheckerImpl fieldChecker = new FieldCheckerImpl();
        PatternChecker pattenChecker = new PatternChecker(board, fieldChecker);
        boardPrinter.printBoard();
        Turn turn = new Turn(board, pattenChecker);
        boolean end = turn.isGameWon();
        while (!end) {
            turn.playTurn();
            boardPrinter.printBoard();
            end = turn.isGameWon();
            turn.playBotTurn();
            boardPrinter.printBoard();
            end = turn.isGameWon();
        }
    }
}
