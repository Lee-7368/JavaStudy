package min.java.string;

public class StringStatus {
    public static void main(String[] args) {
        String str1  = "java study";
        System.out.println("str1의 길이"+str1.length());
        String str2 = "";

        if(str2.isEmpty()){
            System.out.println("str2는 빈 문자열 입니다");
        } else {
            System.out.println("str2는 빈 문자열이 아닙니다");
        }
        String str3 = " ";
        if(str3.isBlank()){
            System.out.println("str3는 공백 문자열입니다");
        } else {
            System.out.println("str3는 공백 문자열이 아닙니다");
        }
    }
}
