package min.java.test;

public class A {
    public static void main(String[] args) {
        String sql = "";
            //select deptno, dname, loc from dept
            //where deptno = 30;
//        sql += "select deptno, dname, loc from dept";
//        sql += " where deptno = ?";
        System.out.println(sql);
        sql = """
            elect deptno, dname, loc from dept
            where deptno = ?
            """;
        System.out.println(sql);
        String json = """
        {
        "name" : "홍길동"
        "age" : 33
        }        
        """;
        System.out.println(json);
    }
}
