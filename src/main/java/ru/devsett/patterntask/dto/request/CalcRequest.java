package ru.devsett.patterntask.dto.request;

import ru.devsett.patterntask.dto.CalcType;

public class CalcRequest {
    CalcType calcType;
    Double value;

    public CalcRequest(CalcType calcType, Double value) {
        this.calcType = calcType;
        this.value = value;
    }
}
