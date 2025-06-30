package min.java.statement;

public class MessageDay {
    public static void main(String[] args) {
        String day = "월요일";
        String message = switch(day) {

            case "월요일", "수요일", "금요일" -> "바쁜 날입니다.";
            case "화요일" -> "회의가 있는 날 입니다.";
            case "목요일", "토요일" -> " 여유로운 날 입니다.";
            case "일요일" -> "쉬는 날입니다.";
            default -> "알 수 없는 날입니다.";
        };
        System.out.println(message);
    }
}
