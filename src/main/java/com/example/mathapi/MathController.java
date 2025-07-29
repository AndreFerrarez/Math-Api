package com.example.mathapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MathController {

    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public double add(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @RequestMapping(value= "/subtract", method= {RequestMethod.GET, RequestMethod.POST})
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @RequestMapping(value = "/multiply", method = {RequestMethod.GET, RequestMethod.POST})
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @RequestMapping(value = "/divide", method = {RequestMethod.GET, RequestMethod.POST})
    public double divide(@RequestParam double a, @RequestParam double b) {
        if(b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    @RequestMapping(value = "/power", method = {RequestMethod.GET, RequestMethod.POST})
    public double power(@RequestParam double base, @RequestParam double exponent) {
        return Math.pow(base, exponent);
    }
}
