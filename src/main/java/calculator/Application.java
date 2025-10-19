package calculator;

import calculator.controller.CalculatorController;
import calculator.model.Calculator;
import calculator.view.CalculatorView;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorView view = new CalculatorView();

        CalculatorController controller = new CalculatorController(calculator, view);

        controller.run();
    }
}
