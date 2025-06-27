package min.java.variable;

public class test {

    public static void main(String[] args) {
        //age 스테틱 멤버 변수는 public 접근 제한자를 가지므로
        // 다른 특정 클래스도 직접 MemberStatic 클래스를 통해서
        //접근할 수 있다
        System.out.println("나이 : " + MemberStatic.age); //
    }
}
