package min.java.variable;

public class MemberStatic {

    //String 타입의 name 스테틱 멤버 변수를 선언, 멤버 변수라 자동 초기화 NULL값 가짐
    static String name;

    // public 접근 제한자로 int 타입의 스테틱 멤버 변수를 선언하면 어디서든 접근 가능
    public static int age;

    public static void main(String[] args) {
        System.out.println("이름" + name);
        System.out.println("나이"+ age);

        //스테틱 맴버 변수에 값을 할당한
        name = "홍길동";
        age = 23;

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);

        //스테틱 맴버 변수는 직접 클래스를 통해서 접근할 수 있다.
        System.out.println("나이 : "+ MemberStatic.age);
    }

}
