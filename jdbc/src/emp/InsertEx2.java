package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.Scanner;

public class InsertEx2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 정해진 문자열
            String user = "scott"; // scott 계정이름
            String password = "TIGER";
            // 3. 커넥션 얻기
            con = DriverManager.getConnection(url, user, password);

            // 입력 데이터 동적 처리
            System.out.println("============데이터 입력==============");
            System.out.println("사번 : ");
            int empno = Integer.parseInt(sc.nextLine());
            System.out.println("이름 : ");
            String ename = sc.nextLine();
            System.out.println("직업 : ");
            String job = sc.nextLine();
            System.out.println("매니저 번호 : ");
            int mgr = Integer.parseInt(sc.nextLine());
            System.out.println("입사일 : ");
            String hiredate = sc.nextLine();
            System.out.println("급여 : ");
            int sal = Integer.parseInt(sc.nextLine());
            System.out.println("수당 : ");
            int comm = Integer.parseInt(sc.nextLine());
            System.out.println("부서번호 : ");
            int deptno = Integer.parseInt(sc.nextLine());
            System.out.println("============================");

            // 4. connection 을 통해서 실행하고자 하는 sql 구문전송
            String sql = "Insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
            sql += "VALUES(?,?,?,?,?,?,?,?)";

            // 4-2. sql 구문 전송
            pstmt = con.prepareStatement(sql);

            // ?해결
            pstmt.setInt(1, empno);
            pstmt.setString(2, ename);
            pstmt.setString(3, job);
            pstmt.setInt(4, mgr);
            pstmt.setString(5, hiredate);
            pstmt.setInt(6, sal);
            pstmt.setInt(7, comm);
            pstmt.setInt(8, deptno);

            // 4-3 sql
            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("입력 성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        sc.close();

    }
}
