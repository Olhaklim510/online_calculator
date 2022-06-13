package com.example.test.services;

import com.example.test.model.Operation;
import com.example.test.model.OperationResult;
import com.example.test.model.OperationType;
import com.example.test.services.OperationService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


public class OperationServiceTest {
    private OperationService services;

    @BeforeEach
    public void init() {
        services = new OperationService();
    }

    @Test
    public void checkAddition() {
        Operation operation = new Operation(new BigDecimal("4"), new BigDecimal("1"), OperationType.ADD);
        OperationResult actual = services.calculate(operation);
        Assertions.assertThat(actual).isEqualTo(new OperationResult(new BigDecimal("5")));
    }

    @Test
    public void checkSubtraction() {
        Operation operation = new Operation(new BigDecimal("3"), new BigDecimal("1"), OperationType.SUB);
        OperationResult actual = services.calculate(operation);
        Assertions.assertThat(actual).isEqualTo(new OperationResult(new BigDecimal("2")));
    }

    @Test
    public void checkMultiplication() {
        Operation operation = new Operation(new BigDecimal("5"), new BigDecimal("2"), OperationType.MUL);
        OperationResult actual = services.calculate(operation);
        Assertions.assertThat(actual).isEqualTo(new OperationResult(new BigDecimal("10")));
    }

    @Test
    public void checkDivision() {
        Operation operation = new Operation(new BigDecimal("8"), new BigDecimal("4"), OperationType.DIV);
        OperationResult actual = services.calculate(operation);
        Assertions.assertThat(actual).isEqualTo(new OperationResult(new BigDecimal("2.00000")));
    }

    @Test
    public void checkRaisingToThePowerOf() {
        Operation operation = new Operation(new BigDecimal("2"), new BigDecimal("3"), OperationType.RTP);
        OperationResult actual = services.calculate(operation);
        Assertions.assertThat(actual).isEqualTo(new OperationResult(new BigDecimal("8")));
    }

    @Test
    public void checkExtractingTheSquareRoot() {
        Operation operation = new Operation(new BigDecimal("4"), null, OperationType.SQR);
        OperationResult actual = services.calculate(operation);
        Assertions.assertThat(actual).isEqualTo(new OperationResult(new BigDecimal("2")));
    }

    @Test
    public void checkPercent() {
        Operation operation = new Operation(new BigDecimal("400"), null, OperationType.PER);
        OperationResult actual = services.calculate(operation);
        Assertions.assertThat(actual).isEqualTo(new OperationResult(new BigDecimal("4.00000")));
    }
}
