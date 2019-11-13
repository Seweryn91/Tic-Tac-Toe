package game.model;

public class Field {

    private Value value;

    public Field() {
        this.value = Value.EMPTY;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
