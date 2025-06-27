package min.java.statement.program;

import java.util.Random;
import java.util.Scanner;

public class OddEvenGame {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        Random random = new Random();

        System.out.println("홀(1), 짝(0) 중 무엇일까요?");
        int user =  scanner.nextInt();
        int computer = random.nextInt(2);

        if(user != 0 && user != 1) {
            System.out.println("0 또는 1만 입력 가능합니다.");
        } else {
            System.out.println("컴퓨터의 선택 : " + computer);

        }
    }
}
