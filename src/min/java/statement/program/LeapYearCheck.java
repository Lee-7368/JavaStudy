package min.java.statement.program;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args){

        int year;
        Scanner scanner = new Scanner(System.in); // 사용자 입력 처리
        System.out.print("연도 입력 : ");

        year = scanner.nextInt(); //사용자로부터 입력받은 연도를 year 변수에 저장

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
    }
}
