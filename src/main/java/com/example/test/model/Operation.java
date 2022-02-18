package com.example.test.model;

import java.util.Objects;

public class Operation {

    long firstValue;
    long secondValue;
    long result;

    public long getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(long firstValue) {
        this.firstValue = firstValue;
    }

    public long getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(long secondValue) {
        this.secondValue = secondValue;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation = (Operation) o;
        return firstValue == operation.firstValue && secondValue == operation.secondValue && result == operation.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue, result);
    }
}
