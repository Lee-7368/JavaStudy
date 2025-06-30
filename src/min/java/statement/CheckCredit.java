package min.java.statement;

public class CheckCredit {
    public static void main(String[] args) {
        int a = 80;
        char grade; //키보드 내용 입력

        switch(a/10){

            case 10:
                grade = 'A';
                break;
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default: // 예외 처리, 전체 조건에 만족하지 않을 때
                grade = 'F';
        }
        System.out.println("학점은 "+grade+"다.");
    }
}
