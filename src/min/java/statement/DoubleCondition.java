package min.java.statement;
import java.io.IOException;

@SuppressWarnings("null")
public class DoubleCondition {
    public static void main(String[] args) throws IOException {

        int num = 9;

        if(num % 2 == 1) {
            System.out.println(num + "는 홀수다");
        } else {
            System.out.println(num + "는 짝수다");
        }


    String name = null; // 아무런 객체를 참조하지 않고 있다.
        if (name.isEmpty()){
            System.out.println("입력 내용이 비어있습니다.");
        } else {
            System.out.println("입력 내용이 비어있습니다.");
        }
    }
}
