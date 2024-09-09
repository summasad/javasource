package emp2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class EmpDAO {
    // CRUD 작업을 위한 메소드 작성
    // static 블럭 : 클래스 로드 되면 인스턴스 생성여부와 상관없이 실행
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    static {
        // 1. 드라이버 로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 정해진 문자열
        String user = "scott"; // scott 계정이름
        String password = "TIGER"; // 대소문자 구분

        // con = DriverManager.getConnection(url, user, password);

        // con return
        // return con;
        return DriverManager.getConnection(url, user, password);
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CRUD 메소드 작성
    public boolean insert(EmpDTO dto) {

        boolean flag = false;

        try {
            con = getConnection();

            String sql = "Insert into emp_temp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)";
            sql += "VALUES(?,?,?,?,?,?,?,?)";
            // 4-2. sql 구문 전송
            pstmt = con.prepareStatement(sql);

            // ?해결
            pstmt.setInt(1, dto.getEmpno());
            pstmt.setString(2, dto.getEname());
            pstmt.setString(3, dto.getJob());
            pstmt.setInt(4, dto.getMgr());
            pstmt.setString(5, dto.getHiredate());
            pstmt.setInt(6, dto.getSal());
            pstmt.setInt(7, dto.getComm());
            pstmt.setInt(8, dto.getDeptno());

            int result = pstmt.executeUpdate();

            if (result > 0)
                flag = true;

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return flag;
    }

}
