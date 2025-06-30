package min.java.array;

public class ArrayForStatement {
    public static void main(String[] args) {

        //배열의 크기가 3인 1차원 배열을 선어, 값을 할당한다
        String[] name = new String[3];

        //배열의 인덱스는 0부터 시작하고 배열의 각 인덱스에 값을 할당한다
        name[0] = "홍길동";
        name[1] = "전우치";
        name[2] = "임구자";

        //i 변수는 배열의 인덱스로 0부터 name.length-1까지 증가하여 배열의 각 요소를 반복한다
        for(int i=0; i < name.length; i++){

            //현재 인덱스의 배열값을 출력
            System.out.println(name[i]);
        }
        for(String string : name){
            System.out.println(string);
        }
    }
}
