package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select 구문 시에만 사용, 표형식 받기위해

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 정해진 문자열
            String user = "scott"; // scott 계정이름
            String password = "TIGER";
            // 3. 커넥션 얻기
            con = DriverManager.getConnection(url, user, password);

            // 4. connection 을 통해서 실행하고자 하는 sql 구문전송
            String sql = "select * from emp where empno = 7369";
            pstmt = con.prepareStatement(sql);

            // 5. 전송된 sql 구문 실행 요청
            rs = pstmt.executeQuery();

            // 6. 결과값이 담긴 rs에서 하나씩 조회, 행단위, 컬럼꺼내기
            if (rs.next()) {
                // number 타입 => getInt / varchar2 => getString / date => getDate
                // ( ) 안에는 컬럼번호 or 컬럼명 가능, 보통 컬럼명
                System.out.println("empno : " + rs.getInt("empno"));
                System.out.println("ename : " + rs.getString(2));
                System.out.println("job : " + rs.getString(3));
                System.out.println("mgr : " + rs.getInt(4));
                System.out.println("hiredate : " + rs.getDate(5));
                System.out.println("sal : " + rs.getInt(6));
                System.out.println("comm : " + rs.getInt(7));
                System.out.println("deptno : " + rs.getInt(8));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.cancel();
                con.close(); // 닫는 순서 지키기
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
