package min.java.statement.program;

public class MultiplicationTable {
    public static void main(String[] args) {

        for(int a = 2; a < 10; a++){
            for(int b = 1; b < 10; b++){
                System.out.print(a+"X"+b+"="+a*b);
                System.out.println(" ");
            }
            System.out.println( );
        }
    }
}
