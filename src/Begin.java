import java.io.IOException;
//객체는 메소드 활용법
public class Begin {
    String str = "인스턴스 변수";
    public static void main(String[] args) {
        new Begin().str=" 변경불과"; // 힙은 스텍에 접근 할 때 마다 주소가 바뀜
        System.out.println(new Begin().str);

        Begin begin =new Begin(); // 계속 바뀌는 =new Begin() 의 주소를 begin에 넣어 보정해줌
        begin.str = "변경가능";
        System.out.println(begin.str);

    }
}
