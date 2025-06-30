package min.java.statement.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTwoNumbers {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int num1, num2;
        int tot =0;

        System.out.print("첫번째 수 : ");
        num1 = Integer.parseInt(br.readLine());
        System.out.print("두번째 수 : ");
        num2 = Integer.parseInt(br.readLine());

        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for(int i = num1; i <= num2; i++){
            tot += i;
        }
        System.out.print(num1+"에서"+num2+"="+tot+"입니다.");
    }
}
