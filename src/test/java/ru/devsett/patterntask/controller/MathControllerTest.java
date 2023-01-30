package ru.devsett.patterntask.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import ru.devsett.patterntask.dto.CalcType;
import ru.devsett.patterntask.dto.request.CalcRequest;

import static org.junit.jupiter.api.Assertions.*;

class MathControllerTest {


    private MathController mathController;
    private Double testValue = -10.1098D;

    @Autowired
    public MathControllerTest(MathController mathController) {
        this.mathController = mathController;
    }

    @Test
    void calcAbsOk() {
        var request = new CalcRequest(CalcType.ABS, testValue);

        var response = mathController.calc(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(Math.abs(testValue), response.getBody().getResult());
    }

    @Test
    void calcAcosOk() {
        var request = new CalcRequest(CalcType.ACOS, testValue);

        var response = mathController.calc(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(Math.acos(testValue), response.getBody().getResult());
    }

    @Test
    void calcFloorOk() {
        var request = new CalcRequest(CalcType.FLOOR, testValue);

        var response = mathController.calc(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(Math.floor(testValue), response.getBody().getResult());
    }

    @Test
    void calcLogOk() {
        var request = new CalcRequest(CalcType.LOG, testValue);

        var response = mathController.calc(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(Math.log(testValue), response.getBody().getResult());
    }

    @Test
    void calcSqrtOk() {
        var request = new CalcRequest(CalcType.SQRT, testValue);

        var response = mathController.calc(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(Math.sqrt(testValue), response.getBody().getResult());
    }

    @Test
    void calcSqrtAndLogOk() {
        var request = new CalcRequest(CalcType.SQRT, testValue);

        var response = mathController.calc(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(Math.sqrt(Math.log(testValue)), response.getBody().getResult());
    }
}