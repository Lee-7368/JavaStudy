package min.java.array;

public class ArrayShollowCopy {
    public static void main(String[] args) {
        int [] num1 = new int[2];
        System.out.println("num1 참조값 : " + num1);

        num1[0] = 3;
        num1[1] = 6;
        System.out.println("num1 결과 값 : " + num1[0]+", "+num1[1]);
        int [] num2 = num1;
        System.out.println("num2 참조값 : " + num2);
        // 원소에 값을 저장한다.
        num2[0] = 6;
        num2[1] = 8;
        System.out.println("num2 결괏값 : " + num2[0] + ", " + num2[1]);
        // 얕은 복사 때문에 num2 변수가 변경되면 num1 변수도 함께 변경된다.
        System.out.println("num1 변경된 결괏값 : " + num1[0] + ", " + num1[1]);
    }

}
