package ru.geekbrains.navy.model.dto;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDTO {
    private final List<String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }
}
