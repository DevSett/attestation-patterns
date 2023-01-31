package ru.devsett.patterntask.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.devsett.patterntask.dto.CalcType;
import ru.devsett.patterntask.dto.request.CalcRequest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class MathControllerTest {

    private MathController mathController;
    private Double testValue = -10.1098D;
    private Double testValue2 = 10.1098D;
    private Double testValue3 = 0.5D;

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
        var request = new CalcRequest(CalcType.ACOS, testValue3);

        var response = mathController.calc(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(Math.acos(testValue3), response.getBody().getResult());
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
        var request = new CalcRequest(CalcType.SQRT, testValue2);

        var response = mathController.calc(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(Math.sqrt(testValue2), response.getBody().getResult());
    }

    @Test
    void calcSqrtAndLogOk() {
        var request = new CalcRequest(CalcType.SQRTANDLOG, testValue2);

        var response = mathController.calc(request);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(Math.sqrt(Math.log(testValue2)), response.getBody().getResult());
    }
}