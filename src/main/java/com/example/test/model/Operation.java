package com.example.test.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Operation {

    private BigDecimal firstValue;
    private BigDecimal secondValue;
    private OperationType type;

    public Operation(BigDecimal firstValue, BigDecimal secondValue, OperationType type) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.type = type;
    }

    public BigDecimal getFirstValue() {
        return firstValue;
    }

    public BigDecimal getSecondValue() {
        return secondValue;
    }

    public OperationType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation = (Operation) o;
        return Objects.equals(firstValue, operation.firstValue)
                && Objects.equals(secondValue, operation.secondValue)
                && type == operation.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue, type);
    }
}
