package calculator.controller;

import calculator.model.Calculator;
import calculator.view.CalculatorView;

public class CalculatorController {
    private final Calculator calculator;
    private final CalculatorView calculatorView;

    public CalculatorController(Calculator calculator, CalculatorView calculatorView) {
        this.calculator = calculator;
        this.calculatorView = calculatorView;
    }

    public void run() {
        try {
            calculatorView.printBeforeInput();
            String input = calculatorView.readInput();
            int result = calculator.add(input);
            calculatorView.printResult(result);

        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
