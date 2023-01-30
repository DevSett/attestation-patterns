package ru.devsett.patterntask.dto.response;

import ru.devsett.patterntask.dto.CalcType;

public class CalcResponse {
    private Double result;
    private Long timeCalculation;
    private CalcType calcType;

    public Double getResult() {
        return result;
    }
}
