package ru.devsett.patterntask.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.devsett.patterntask.dto.request.CalcRequest;
import ru.devsett.patterntask.dto.response.CalcResponse;

@RestController("/math")
public class MathController {

    @PostMapping("/calc")
    public ResponseEntity<CalcResponse> calc(CalcRequest calcRequest) {
        //TODO
    }
}
