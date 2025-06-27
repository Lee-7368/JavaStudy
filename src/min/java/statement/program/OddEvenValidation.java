package min.java.statement.program;

import java.util.Scanner;

public class OddEvenValidation {

    public static void main(String[] args) {
        int num;

        Scanner scanner=new Scanner(System.in); //스케너 객체 생성
        System.out.print("숫자 입력 : ");

        num =scanner.nextInt(); // 입력받은 내용 정수로 변환후 num에 저장

        if (num%2==1){
            System.out.println("홀수를 선택했습니다.");
        } else {
            System.out.println("짝수를 선택했습니다.");
        }
    scanner.close();
    }
}
