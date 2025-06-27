package min.java.statement;

public class SingleCondition {
    public static void main(String[] args) {

        //int 타입인 i 변수를 선언하고 10을 할당
        int i = 10;

        if (i>9) {

            //조건이 참이므로 다음 문을 실행한다
            System.out.println("if 문의 조건 참이므로 실행");
        }
        //코드 블록{}을 생략, 조건식의 다음에 나오는 하나의 문만을 조건의 수행대상이 됨
        if(i>8)
            System.out.println("코드블럭을 생략하고 실행");

    }
}
