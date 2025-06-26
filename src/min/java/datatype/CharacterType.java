package min.java.datatype;

public class CharacterType {
    //main 메서드는 프로그램의 시작점으로 JVM에 의해 자동으로 호출된다.
    public static void main(String[ ] args) {
        // 문자를 할당할 char 타입의 변수들을 선언한다.
        char kword;
        char eword;

        // 유니코드 문자를 할당한 char 타입의 변수들을 선언한다.
        char word1;
        char word2;
        char word3;
        char word4;
        kword = '삶'; // kword 변수에 한글 문자 '삶'을 할당하며 모든 타입의 글자 형태와 관계없이 한 글자만 가능하다.
        eword = 'a'; // eword 변수에 영어 문자 'a'를 할당하며 모든 타입의 글자 형태와 관계없이 한 글자만 가능하다.
        word1 = '\u0041'; // word1 변수에 유니코드 문자 \u0041를 할당하면 영어 A 문자가 할당된다.
        word2 = '\uAC00'; // word2 변수에 유니코드 문자 \uAC00를 할당하면 한글 가 문자가 할당된다.
        word3 = '\u0040'; // word3 변수에 유니코드 문자 \u0040를 할당하면 특수 문자 @ 문자가 할당된다.
        word4 = '\u260E'; // word4 변수에 유니코드 문자 \u260E를 할당하면 아이콘 ☎ 문자가 할당된다.
        int sum = '0' + 'A'; // char 타입의 0과 A를 int 타입으로 자동 변환하므로 int 타입의 c 변수는 48과 65를 더한 113이 할당된다.

        // +(더하기) 연결 연산자로 문자열과 변수를 연결하여 kword 값을 출력한다.
        System.out.println("한글 문자 : " + kword);

        // + 연결 연산자로 문자열과 변수를 연결하여 eword 값을 출력한다.
        System.out.println("영어 문자 : " + eword);

        // + 연결 연산자로 문자열과 변수를 연결하여 word1, word2, word3, word4 값을 출력한다.
        System.out.println("유니코드 문자 : " + word1 + ", " + word2 + ", " + word3 + ", " + word4);

        // + 연결 연산자로 문자열과 변수를 연결하여 sum 값을 출력한다.
        System.out.println("더한 결과 : " + sum);


    }
}
