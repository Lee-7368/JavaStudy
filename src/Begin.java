import java.io.IOException;

public class Begin {
    public static void main(String[] args) throws IOException {

        System.out.print("숫자 입력 : ");

        //콘솔에 숫자를 입력하면 입력한 내용이 공간에 저장하도록됨
        int num = System.in.read();// 입력받은 값을 아스키 코드 값으로 저장

        System.out.println(num-48);
    }
}
