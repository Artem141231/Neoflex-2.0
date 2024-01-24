package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.model.Calculation;
import ru.neoflex.practice.repository.CalculationRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CalcController {

    @Autowired
    private CalculationRepository calculationRepository;

    @GetMapping("/plus/{a}/{b}")
    public Integer add(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        int result = a + b;
        saveCalculation(a, b, result);
        return result;
    }

    @GetMapping("/minus/{a}/{b}")
    public Integer subtract(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        int result = a - b;
        saveCalculation(a, b, result);
        return result;
    }

    @GetMapping("/allCalculations")
    public List<Calculation> getAllCalculations() {
        return calculationRepository.findAll();
    }

    private void saveCalculation(Integer a, Integer b, Integer result) {
        Calculation calculation = new Calculation(a, b, result);
        calculationRepository.save(calculation);
    }
}
