package min.java.statement.program;

import java.io.IOException;

public class CaseCheck {
    public static void main(String[] args) throws IOException {
        System.out.print("영어 문자: ");

        char alphabet = (char)System.in.read();

        if(alphabet >= 'a' && alphabet <= 'z'){
            System.out.println(alphabet + "는 소문자 입니다.");
        } else if(alphabet >= 'A' && alphabet <= 'Z'){
            System.out.println(alphabet +"는 대문자 입니다.");
        } else {
            System.out.println("대소문자 외의 문자를 입력하였습니다.");
        }
    }
}
