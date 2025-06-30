package min.java.statement.program;

import java.util.Scanner;

public class MatchNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100)+1;//컴퓨터는 완전한 무작위가 없다.
        System.out.println(num);
        int result = 0;
        do{
            System.out.print("숫자 입력 : ");
            result = sc.nextInt();
            if(result == num){
                System.out.println("맞추셨습니다.");
                break;
            } else if (result < num){
                System.out.println("조금 더 커요");

            } else {
                System.out.println("조금 더 작아요");
            }
        } while(true);
    }
}
