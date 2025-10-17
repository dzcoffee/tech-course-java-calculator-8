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
        if(arr.length == 1) throw new IllegalArgumentException(); //구분이 되지 않는 경우

        int answer = 0;
        for(String number : arr){
            try{
                int num = Integer.parseInt(number);
                if(num < 0) throw new IllegalArgumentException(); //숫자가 음수인 경우
                answer += num;
            }catch (IllegalArgumentException e){
                throw new IllegalArgumentException(); //구분된 문자열을 숫자로 변환할 수 없는경우
            }
        }

        System.out.println("결과 : " + answer);
    }


}
