package min.java.array.program;

import java.util.Scanner;

public class DepartmentList {
    private static Scanner scanner;

    public static void main(String[] args) {

        String[] deptList = new String[0];
        System.out.println("프로그램을 종료하려면 exit를 입력하세요.");
        do {
            scanner = new Scanner(System.in);
            System.out.print("부서 이름 입력 : ");
            String inputDept = scanner.next( ); // 사용자가 입력한 문자열을 읽어오며 입력된 문자열에서 공백 앞의 문자까지만 입력된다.
            if(inputDept.equals("exit")) { // exit를 입력하면 프로그램을 종료하며 대소문자를 구분한다.
                System.out.println("프로그램을 종료합니다.");
                break; // 코드 블록을 벗어나서 종료한다.
            }
            String[ ] newDeptList = new String[deptList.length + 1]; // 기존 배열의 크기보다 1 큰 새로운 배열을 생성한다.
            System.arraycopy(deptList, 0, newDeptList, 0, deptList.length); // 기존 배열의 내용을 새로운 배열로 얕은 복사를 한다.
            newDeptList[deptList.length] = inputDept; // 새로운 배열의 마지막 요소에 입력받은 부서 이름을 추가한다.
            deptList = newDeptList; // 새로운 배열을 deptList 배열 변수에 할당하여 업데이트한다.
            System.out.print("현재 부서 목록 : ");
            for(String list : deptList) { // 배열의 실제값인 부서 목록을 반복해서 출력한다.
                System.out.print(list + " ");
            }
            System.out.println( );
        } while( true );
    }
}
