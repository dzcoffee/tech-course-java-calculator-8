package calculator.view;

import calculator.model.Calculator;
import camp.nextstep.edu.missionutils.Console;

public class CalculatorView {
    private static final String RESULT_PREFIX = "결과 : ";

    public String readInput() {
        return Console.readLine();
    }

    public void printResult(int result) {
        System.out.println(RESULT_PREFIX + result);
    }
}
