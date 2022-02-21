package com.example.test.model;

public enum OperationType {
    ADD("Addition"),
    SUB("Subtraction"),
    MUL("Multiplication"),
    DIV("Division"),
    RTP("Raising to the power of"),
    SQR("Extracting the square root"),
    PER("Percent");

    private final String displayValue;

    OperationType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
