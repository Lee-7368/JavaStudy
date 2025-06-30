package min.java.array;

public class ArrayString {
    public static void main(String[] args) {
        String[ ] name = new String[4];
        name[0] = "홍길동";
        name[1] = "전우치";
        name[2] = "임꺽정";

        for(String string : name) {
        // 현재 배열의 요소값을 출력한다.
        System.out.println("향상된 for 문의 배열값 : " + string);
        }

    }
}
