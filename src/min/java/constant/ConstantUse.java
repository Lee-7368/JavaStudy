package min.java.constant;


public class ConstantUse {
    private static final int NUM = 10; // static final로 선언된 상수를 선언하며 컴파일 시에 값이 고정되어 변경할 수 없다.
    static int num = 10; // static 키워드로 선언된 일반 변수를 선언하며 클래스 로딩 시 초기화되어 변경 가능하다.

    public static void main(String[ ] args) {

        long startTime, endTime; // 시작 시각과 종료 시각을 기록할 변수다.
        startTime = System.currentTimeMillis( ); // 현재 시간을 밀리세컨드 단위로 기록한다.

        int result1 = 0; // 결과를 저장할 변수를 초기화한다. // 반복을 통해 NUM 상수를 곱한 결과를 계산하며 상수를 사용하면 일반 변수보다 최적화되어 더 빠르게 실행될 수 있다.

        for(int i = 0; i < 1000000000; i++) {
            result1 += i * NUM; // NUM 상수를 곱하여 결과에 누적한다.
        }

        endTime = System.currentTimeMillis( ); // 연산 종료 후 현재 시간을 밀리세컨드 단위로 기록한다.

        System.out.println("상수를 사용한 경우 소요 시간 : " + (endTime - startTime) + "ms");
        startTime = System.currentTimeMillis( ); // 현재 시간을 밀리세컨드 단위로 기록한다.
        int result2 = 0; // 결과를 저장할 변수를 초기화한다. // 반복을 통해 num 변수를 곱한 결과를 계산한다.
        for(int i = 0; i < 1000000000; i++) {
            result2 += i * num; // num 변수를 곱하여 결과에 누적한다.
        }
        endTime = System.currentTimeMillis( ); // 연산 종료 후 현재 시간을 밀리세컨드 단위로 기록한다.
        System.out.println("스테틱 변수를 사용한 경우 소요 시간 : " + (endTime - startTime) + "ms");
        System.out.println("상수 곱셈 결괏값 : " + result1 + ", " + "변수 곱셈 결괏값 : " + result2);
    }
}