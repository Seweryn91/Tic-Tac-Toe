package game.controller;

import game.model.Field;
import game.model.Value;

public class FieldCheckerImpl implements FieldChecker {

    public boolean isFieldEmpty(Field field) {
        return field.getValue() == Value.EMPTY;
    }

    public boolean isFieldX(Field field) {
        return field.getValue() == Value.X;
    }

    public boolean isFieldO(Field field) {
        return field.getValue() == Value.O;
    }
}
