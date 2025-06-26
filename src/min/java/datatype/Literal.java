package min.java.datatype;

public class Literal {
    public static void main(String[] args) {
        int decimal;
        decimal = 10;

        int octal;
        octal = 012; //자바에서 0으로 시작하는 숫자는 8진수로 취급

        int hex;
        hex = 0xA;

        int binary;
        binary = 0b1010;

        float f;
        f = 3.14f; // 고정 실수

        double d;
        d = 3.14; // 부통 실수

        System.out.println("10진수 리터럴값 : " + decimal);
        System.out.println("8진수 리터럴값 : " + octal);
        System.out.println("16진수 리터럴값 : " + hex);
        System.out.println("2진수 리터럴값 : " + binary);
        System.out.println("32비트 부동소수점 리터럴값 : " + f);
        System.out.println("64비트 부동소수점 리터럴값 : " + d);
    }
}
