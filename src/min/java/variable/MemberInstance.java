package min.java.variable;

public class MemberInstance {

    //인스턴스 맴버 변수 선언
    String name;
    int age;

    public static void main(String[] args) {
        //new를 사용하여 MemberInstance 생서자를 초기화 하여 memberInstance 인스턴스를 생성한다
        MemberInstance memberInstance = new MemberInstance();

        //인스턴스 멤버 변수의 초깃값을 출력한다.
        System.out.println("이름 : " + memberInstance.name);
        System.out.println("나이 : " + memberInstance.age);

        //인스턴스 멤버 변수에 값을 할당한다.
        memberInstance.name = "홍길동";
        memberInstance.age = 23;

        //변경된 인스턴스 맴버 변수의 값을 출력한다.
        System.out.println("이름 : " + memberInstance.name);
        System.out.println("나이 : " + memberInstance.age);
    }
}
