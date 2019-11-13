package game.model;

import java.util.Arrays;

public class PatternChecker {

    Board board;

    public PatternChecker(Board board) {
        this.board = board;
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


        if (field1.getValue() != Value.EMPTY) {
            if (field1.getValue() == field2.getValue()) {
                if (field3.getValue() == field1.getValue()) {  //check for match in 1st row
                    System.out.println("Player " + field1.getValue() + " won!");
                    return true;
                }
            } else if (field4.getValue() != Value.EMPTY) {
                if (field4.getValue() == field5.getValue()) {
                    if (field6.getValue() == field4.getValue()) {  //check for match in 2nd row
                        System.out.println("Player " + field4.getValue() + " won!");
                        return true;
                    }
                }
            }
        } else if (field7.getValue() != Value.EMPTY) {
            if (field7.getValue() == field8.getValue()) {
                if (field7.getValue() == field9.getValue()) {  //check for match in 3rd row
                    System.out.println("Player " + field7.getValue() + " won!");
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

        if (field1.getValue() != Value.EMPTY) {
            if (field1.getValue() == field4.getValue()) {
                if (field7.getValue() == field1.getValue()) {  // check for match in 1st column
                    System.out.println("Player " + field1.getValue() + " won!");
                    return true;
                }
            }
        } else if (field2.getValue() != Value.EMPTY) {
            if (field2.getValue() == field5.getValue()) {
                if (field8.getValue() == field2.getValue()) {  // check for match in 2nd column
                    System.out.println("Player " + field2.getValue() + " won!");
                    return true;
                }
            }
        } else if (field3.getValue() != Value.EMPTY) {
            if (field3.getValue() == field6.getValue()) {
                if (field3.getValue() == field9.getValue()) {   //check for match in 3rd column
                    System.out.println("Player " + field3.getValue() + " won!");
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

        if (field1.getValue() != Value.EMPTY) {
            if (field1.getValue() == field5.getValue()) {
                if (field1.getValue() == field9.getValue()) {  // check for match diagonally (\)
                    System.out.println("Player " + field1.getValue() + " won!");
                    return true;
                }
            }
        }
        if (field5.getValue() != Value.EMPTY) {
            if (field5.getValue() == field3.getValue()) {
                if (field7.getValue() == field3.getValue()) {   //check for match diagonally (/)
                    System.out.println("Player " + field3.getValue() + " won!");
                    return true;
                }
            }
        }
        return false;
    }

    boolean checkForDraw() {
        //TODO: Refactor method to check for matches properly
        int flag = 0;
        for (Field[] f : board.getFields()) {
            if (Arrays.stream(f).noneMatch(field -> field.getValue().equals("EMPTY"))) { flag++; }
        }
        System.out.println("flag" + flag);
        return flag == 9;
    }
}
