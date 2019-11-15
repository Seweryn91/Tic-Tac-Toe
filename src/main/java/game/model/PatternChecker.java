package game.model;

import game.controller.FieldCheckerImpl;
import game.view.MessagePrinter;

import java.util.Arrays;

public class PatternChecker {

    private Board board;
    private FieldCheckerImpl fieldChecker;
    private MessagePrinter messagePrinter;

    public PatternChecker(Board board, FieldCheckerImpl fieldChecker, MessagePrinter messagePrinter) {
        this.board = board;
        this.fieldChecker = fieldChecker;
        this.messagePrinter = messagePrinter;
    }


    boolean checkRows() {

        Field field1 = board.getFields()[0][0];
        Field field2 = board.getFields()[0][1];
        Field field3 = board.getFields()[0][2];
        Field field4 = board.getFields()[1][0];
        Field field5 = board.getFields()[1][1];
        Field field6 = board.getFields()[1][2];
        Field field7 = board.getFields()[2][0];
        Field field8 = board.getFields()[2][1];
        Field field9 = board.getFields()[2][2];


        if (!fieldChecker.isFieldEmpty(field1)) {
            if (field1.getValue() == field2.getValue()) {
                if (field3.getValue() == field1.getValue()) {  //check for match in 1st row
                    messagePrinter.printVictory(field1.getValue());
                    return true;
                }
            } else if (!fieldChecker.isFieldEmpty(field4)) {
                if (field4.getValue() == field5.getValue()) {
                    if (field6.getValue() == field4.getValue()) {  //check for match in 2nd row
                        messagePrinter.printVictory(field4.getValue());
                        return true;
                    }
                }
            }
        } else if (!fieldChecker.isFieldEmpty(field7)) {
            if (field7.getValue() == field8.getValue()) {
                if (field7.getValue() == field9.getValue()) {  //check for match in 3rd row
                    messagePrinter.printVictory(field7.getValue());
                    return true;
                }
            }
        }
        return false;
    }


    boolean checkColumns() {

        Field field1 = board.getFields()[0][0];
        Field field2 = board.getFields()[0][1];
        Field field3 = board.getFields()[0][2];
        Field field4 = board.getFields()[1][0];
        Field field5 = board.getFields()[1][1];
        Field field6 = board.getFields()[1][2];
        Field field7 = board.getFields()[2][0];
        Field field8 = board.getFields()[2][1];
        Field field9 = board.getFields()[2][2];

        if (!fieldChecker.isFieldEmpty(field1)) {
            if (field1.getValue() == field4.getValue()) {
                if (field7.getValue() == field1.getValue()) {  // check for match in 1st column
                    messagePrinter.printVictory(field1.getValue());
                    return true;
                }
            }
        } else if (!fieldChecker.isFieldEmpty(field2)) {
            if (field2.getValue() == field5.getValue()) {
                if (field8.getValue() == field2.getValue()) {  // check for match in 2nd column
                    messagePrinter.printVictory(field2.getValue());
                    return true;
                }
            }
        } else if (!fieldChecker.isFieldEmpty(field3)) {
            if (field3.getValue() == field6.getValue()) {
                if (field3.getValue() == field9.getValue()) {   //check for match in 3rd column
                    messagePrinter.printVictory(field3.getValue());
                    return true;
                }
            }
        }
        return false;
    }


    boolean checkDiagonally() {

        Field field1 = board.getFields()[0][0];
        Field field3 = board.getFields()[0][2];
        Field field5 = board.getFields()[1][1];
        Field field7 = board.getFields()[2][0];
        Field field9 = board.getFields()[2][2];

        if (!fieldChecker.isFieldEmpty(field1)) {
            if (field1.getValue() == field5.getValue()) {
                if (field1.getValue() == field9.getValue()) {  // check for match diagonally (top-left to bottom-right)
                    messagePrinter.printVictory(field1.getValue());
                    return true;
                }
            }
        }
        if (!fieldChecker.isFieldEmpty(field5)) {
            if (field5.getValue() == field3.getValue()) {
                if (field7.getValue() == field3.getValue()) {   //check for match diagonally (bottom-left to top-right)
                    messagePrinter.printVictory(field5.getValue());
                    return true;
                }
            }
        }
        return false;
    }

    boolean checkForDraw() {
        int emptyLeft = 0;
        for (Field[] row : board.getFields()) {
            for (Field field : row) {
                if (field.getValue().equals(Value.EMPTY)) {
                    emptyLeft++;
                }
            }
        }
        return emptyLeft == 0;
    }
}
