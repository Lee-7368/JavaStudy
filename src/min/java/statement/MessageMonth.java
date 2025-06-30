package min.java.statement;

public class MessageMonth {
    public static void main(String[] args) {
        String month = "7월";
        String message = switch(month){

            case "1월", "2월", "4월", "5월" -> {// yield 키워드로 값을 반환한다.
                yield "바쁜 달입니다.";
            }
            case "3월", "6월", "8월" -> {
                yield "한가로운 달입니다.";
            }
            case "7월" -> {
                yield "중간 점검하는 달입니다.";
            }
            case "9월", "10월", "11월" -> {
                yield "계획을 수립하는 달입니다.";
            }
            case "12월" -> {
                yield "마무리 하는 달입니다.";
            }
            default -> {
                yield "알 수 없는 달입니다.";
            }
        };
        System.out.println(message);
        }
    }

