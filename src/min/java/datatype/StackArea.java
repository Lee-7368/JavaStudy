package min.java.datatype;

public class StackArea {
    @SuppressWarnings("unsued") //Q: 왜 이 명령줄은 식별자 ; 를 붙이지 않는가?
                                //A: @SuppresWarnings 는 어노테이션으로서 주석처럼 코드의 실행에는
                                //   영향을 미치지 않지만 컴파일러나 도구에 특별한 지시를 전달
                                //   따라서, 세미클론을 붙이지 않음
                                // 행당 코드는 사용되지 않는 변수 경고를 무시
    public static void main(String[] args) {  //main 메서드가 호출 될때 스택 프레임을 생성

        int i = 10; //스택에 i 변수 생성하고 10을 리터럴로 선언한다.
        int j = 20; //스택에 i 변수 생성하고 20을 리터럴로 선언한다.
        int k = 40; //스택에 i 변수 생성하고 40을 리터럴로 선언한다.
        //생성된 스택 프레임에 위 로컬 변수들이 저장됨
        //그렇지만 스텍에 저장된 각 변수는 메서드 내에서 호출 될 때 값에 접근 할 수 있음
        System.out.println("마지막 저장된 값 호출 : " + k);
    }
}
