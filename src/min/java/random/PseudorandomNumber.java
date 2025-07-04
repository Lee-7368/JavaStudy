package min.java.random;
import java.util.Random;
public class PseudorandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(100);
        System.out.println("정수의 난수 : "+num1);
        double num2 = random.nextDouble();
        System.out.println("부동소수점의 난수 : "+num2);
        double min = 5.0;
        double max = 10.0;
        double num3 = min + (max-min)*random.nextDouble();
        System.out.println("5.0 이상 10.0 미만의 난수 : " + num3);
// 1차원 배열을 선언하고 초기화한다.
        String[ ] items = {"홍길동", "전우치", "임꺽정", "장길산", "일지매"};
// 배열에서 무작위로 항목을 선택한다.
        String item = items[random.nextInt(items.length)];
        System.out.println("배열의 난수 : " + item);

    }
}
