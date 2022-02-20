package com.example.test.services;

import com.example.test.model.Operation;
import com.example.test.model.OperationResult;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

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
        return null; //TODO
    }

    private OperationResult subtraction(BigDecimal v1, BigDecimal v2) {
        return null; //TODO
    }

    private OperationResult multiplication(BigDecimal v1, BigDecimal v2) {
        return null; //TODO
    }

    private OperationResult division(BigDecimal v1, BigDecimal v2) {
        return null; //TODO
    }
}
