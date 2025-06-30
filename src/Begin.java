import java.io.IOException;

public class Begin {
    public static void main(String[] args) throws IOException {

        //인덱스가 가변이다
        int[] num={2,3,4,2,3};
        int result=0;
        for(int i : num){
            result = result ^ i;
        }
    }
}
