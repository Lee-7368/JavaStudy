package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersPlus {
    public static void main(String[] args) throws IOException {

        //키보드에 입력한 내용을 시냇물처럼(줄줄줄) 읽는다
        InputStreamReader inputStreamReader =new InputStreamReader(System.in);
        BufferedReader bufferedReader =new BufferedReader(inputStreamReader);

        int num1, num2;
        int sum;

        System.out.print("첫 번째 : ");
        //웹에서 나이를 입력 받아 자바에서 숫자로 바꿀 때 사용
        num1 = Integer.parseInt(bufferedReader.readLine());
        System.out.print("두 번째 : ");
        num2 = Integer.parseInt(bufferedReader.readLine());

        //큰 수 자리 바꾸기
        if(num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;

        }

        sum = num1 + num2;
        System.out.println(num1 +"과 "+ num2 + " = " +sum);

    }
}
