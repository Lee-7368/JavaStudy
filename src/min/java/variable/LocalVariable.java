package min.java.variable;

public class LocalVariable {
    public static void main(String[] args) {

        String name ; // String 타입의 로컬 변수를 선언
                      // 단, 초기화 되지 않아 이대로 sout 하게되면 오류 발생
        int age = 0;

        System.out.println(age);
        //System.out.println(name); 사용하기 위해서는 name을 최소한 null로 초기화 해줘야함
        name = "홍길동";
        age = 32;

        System.out.println("이름 : " + name );
        System.out.println("나이 : " + age);
    }
}
