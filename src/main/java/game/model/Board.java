package game.model;

public class Board {

    private Field[][] fields;

    public Field[][] getFields() {
        return fields;
    }

    public void setBoard(Field[][] board) {
        this.fields = board;
    }

    public Board() {
        fields = new Field[3][3];
        for (int row = 0; row < fields.length; row++) {
            for (int col = 0; col < fields.length; col++) {
                fields[row][col] = new Field();
            }
        }
    }

    public Field[] getRow(int index){
        return fields[index];
    }

}
