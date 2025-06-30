package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticCalculation {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int num1,num2,result;
        char sign = 0;

        System.out.print("첫번째 수 : ");       //키보드에 입력 된 한 줄 텍스트를 읽어 문자열을 정수로 변환한다
        num1 = Integer.parseInt(br.readLine()); //readLine 메서드는 입력 스트림으로부터 한 줄의 텍스트를 읽는다

        System.out.print("연산자(+,-,*,/,%) 중 선택 : ");
        sign = (char) System.in.read();

        br.readLine();

        System.out.print("두번째 수 : ");
        num2 = Integer.parseInt(br.readLine());

        result = switch (sign){
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            default -> {
                System.out.println("잘못된 연산자를 입력 하셨습니다.");
                System.exit(0);
                yield 0;
            }
        };
        System.out.println(num1+" "+sign+" "+num2+" = "+result);
    }
}
