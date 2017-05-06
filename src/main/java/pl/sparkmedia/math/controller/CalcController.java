package pl.sparkmedia.math.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Maciej Lesniak
 */

@RestController
@RequestMapping(Endpoints.ENDPOINT_VERSION)
public class CalcController {

    @RequestMapping(value = Endpoints.Calc.PARSE, method = RequestMethod.POST)
    public ResponseEntity<Double> parse(@RequestBody String expression) {

        return ResponseEntity.ok(1.0);

    }


}
