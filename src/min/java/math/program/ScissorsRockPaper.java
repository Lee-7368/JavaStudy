package min.java.math.program;
import java.util.Scanner;
public class ScissorsRockPaper {
    public static String choice(int num){
        return switch (num){
            case 1 -> "가위";
            case 2 -> "바위";
            case 3 -> "보";
            default -> "잘못 된 선택";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택 하세요: ");

        int user = sc.nextInt();

        int computer = (int) (Math.random()*3)+1;
        System.out.println("사용자의 선택 : "+choice(user));
        System.out.println("컴퓨터의 선택 : "+choice(computer));
        @SuppressWarnings("unused")
        double result = Math.sqrt(user*computer);

        if (user == computer){
            System.out.println("비겼습니다.");
        } else if((user == 1 && computer == 3) || (user == 3 && computer == 2) || (user == 2 && computer == 1)){
            System.out.println("사용자가 이겼습니다.");
            System.out.println("컴퓨터가 이겼습니다");
        }
        sc.close();
    }
}
