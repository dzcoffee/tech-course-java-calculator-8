package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String st = Console.readLine();


        String[] arr = st.split(":");
        if(arr.length == 1) arr = st.split(",");
        if(st.startsWith("//")){
            Separator separator = new Separator(st);
            if(separator.isSepartorNull()) return;

            st= st.substring(separator.getEndIndex() + 2);

            arr = st.split(separator.getSeparator());
        }

        int answer = 0;
        for(String number : arr){
            int num = Integer.parseInt(number);
            answer += num;
        }

        System.out.println("결과 : " + answer);
    }


}
