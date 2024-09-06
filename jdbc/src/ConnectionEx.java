import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
    private static Connection con;

    public static void main(String[] args) {

        Connection con = null;

        try {
            // 1. 오라클 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver"); // 오라클 드라이버 이름

            // 2. url, user, password
            // localhost(== 아이피 127.0.0.1) : 로컬 컴퓨터를 의미
            // DB 서버가 설치된 주소를 작성
            // 1521 : port 번호(오라클 서버의 기본 포트 번호, 서버마다 다름)
            // xe : 오라클 서버의 인스턴스 이름(회사용 오라클은 olcl)
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 정해진 문자열
            String user = "scott"; // scott 계정이름
            String password = "TIGER";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("연결되었습니다");
            con.close();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
