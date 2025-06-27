package min.java.operation.program;
import java.io.IOException;

public class OddEven {
    public static void main(String[] args) throws IOException {

        System.out.print("숫자 입력 : ");

        // 사용자로부터 입력받은 아스키코드를 0의 아스키코드값인 48을 빼서 실제 정숫값을 얻는다.
        int num = System.in.read() -48;
        System.out.println("입력받은 숫자 : " + num); // 로그 확인, 입력 받은게 우리가 우너하는게 맞는지 확인

        //String 타입의 numberCheck 변수를 선언하고 빈 문자열을 할당한다.
        String numberCheck = "";

        numberCheck = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println(numberCheck + "입니다.");
    }
}
