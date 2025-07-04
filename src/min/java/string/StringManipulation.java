package min.java.string;

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "java\nagin\nstudy";
        String indented = str1.indent(4);
        System.out.println("문자열의 들여쓰기 결과 :\n"+indented);
        String str2 = "java again study";
        String substringed = str2.substring(5, 10);
        System.out.println("문자열의 부분 문자열 반환 결과 : "+substringed);
        char c = str2.charAt(9);
        System.out.println("문자열의 지정된 문자 반환 결과 : "+c);
        String str3 = "java ";
        String repeated = str3.repeat(3);
        System.out.println("문자열의 반복 결과 : "+repeated);
    }
}
