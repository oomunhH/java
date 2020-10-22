import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//-insert함수 : main의 자료를 받아서 DAO로 전송, 레코드 개수를 리턴 받아 main 전송

public class OracleService {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid="scott";
	String passwd="tiger";
	
	OracleDAO dao;
	
	public OracleService() {
		dao=new OracleDAO();
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public int insert(Dept dept) {
		int n=0;
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,userid,passwd);
			n=dao.insert(con, dept);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return n;
	}
}
