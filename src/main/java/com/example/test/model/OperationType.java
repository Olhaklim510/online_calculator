package com.example.test.model;

public enum OperationType {
    ADD("Addition"),
    SUB("Subtraction"),
    MUL("Multiplication"),
    DIV("Division");

    private final String displayValue;

    private OperationType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
