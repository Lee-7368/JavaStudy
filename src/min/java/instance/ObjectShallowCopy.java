package min.java.instance;

public class ObjectShallowCopy {
    public static void main(String[] args) {
        StringBuffer name1 = new StringBuffer("홍길동"); // StringBuffer 타입의 name1 변수를 생성하고 홍길동이라는 값을 할당한다.
        System.out.println("name1 참조값 : " + System.identityHashCode(name1)); // 객체의 고유 해시코드를 호출하여 출력한다.
        System.out.println("name1 결괏값 : " + name1);
        StringBuffer name2 = name1; // name1 변수의 참조값을 name2 변수에 할당하여 얕은 복사를 한다.
        System.out.println("name2 참조값 : " + System.identityHashCode(name2)); // 객체의 고유 해시코드를 호출하여 출력한다.
        System.out.println("name2 결괏값 : " + name2);
        name2.append(" 전우치"); // name2 변수에 새로운 전우치라는 값을 추가한다.
        System.out.println("name2 변경된 결괏값 : " + name2);
        System.out.println("name1 변경된 결괏값 : " + name1); // 얕은 복사 때문에 name2 변수가 변경되면 name1 변수도 함께 변경된다.
    }
}
