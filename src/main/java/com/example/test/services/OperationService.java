package com.example.test.services;

import com.example.test.model.Operation;
import com.example.test.model.OperationResult;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class OperationService {

    public OperationResult calculate(Operation operation) {
        switch (operation.getType()) {
            case ADD:
                return addition(operation.getFirstValue(), operation.getSecondValue());
            case SUB:
                return subtraction(operation.getFirstValue(), operation.getSecondValue());
            case MUL:
                return multiplication(operation.getFirstValue(), operation.getSecondValue());
            case DIV:
                return division(operation.getFirstValue(), operation.getSecondValue());
            default:
                return null;
        }
    }

    private OperationResult addition(BigDecimal v1, BigDecimal v2) {
        BigDecimal result = v1.add(v2);
        return new OperationResult(result);
    }

    private OperationResult subtraction(BigDecimal v1, BigDecimal v2) {
        BigDecimal result = v1.subtract(v2);
        return new OperationResult(result);
    }

    private OperationResult multiplication(BigDecimal v1, BigDecimal v2) {
        BigDecimal result = v1.multiply(v2);
        return new OperationResult(v2);
    }

    private OperationResult division(BigDecimal v1, BigDecimal v2) {
        try {
            BigDecimal result = v1.divide(v2, 5, RoundingMode.FLOOR);
            return new OperationResult(result);
        } catch (ArithmeticException exc) {
            System.out.println("You can't divide by zero!");
        }
        return null;
    }
}
