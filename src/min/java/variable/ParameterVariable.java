package min.java.variable;

public class ParameterVariable {

    // char 타입의 gender 매개 변수와 int 타입의 age 매개 변수를 지정한 displayMember 스테틱 메서드를 선언한다.
    public static void displayMember(char gender, int age) {
        System.out.println("성별" + gender);
        System.out.println("나이" + age);

    }

    public static void main(String[] args) {
        char gender = '남';
        int age = 23;
        displayMember(gender, age);
    }
}
