package game.controller;

import game.model.Field;

public interface FieldChecker {

    boolean isFieldEmpty(Field field);

    boolean isFieldX(Field field);

    boolean isFieldO(Field field);
}
