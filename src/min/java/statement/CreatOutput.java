package min.java.statement;

public class CreatOutput {
    public static void main(String[] args) {
        int score = 98;
        char grade;

        if(score >= 90){
            grade = 'A';
        } else if(score >= 80){
            grade = 'B';
        } else if(score >= 70){
            grade = 'C';
        }  else {
            grade = 'D';
        }
        System.out.println("학점은 " + grade + "다");
    }
}
