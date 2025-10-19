package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class CalculatorView {
    private static final String RESULT_PREFIX = "결과 : ";

    public String readInput() {
        return Console.readLine();
    }

    public void printBeforeInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
    }

    public void printResult(int result) {
        System.out.println(RESULT_PREFIX + result);
    }
}
