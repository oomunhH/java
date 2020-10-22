import java.sql.Connection;
import java.sql.PreparedStatement;

//insert함수 : 데이터베이스에 접속하는 코드와 OracleService의 자료를 받아 DataBase에 insert함 
public class OracleDAO {
	
	PreparedStatement pstmt=null;
	
	public int insert(Connection con,Dept dept) {
		int n=0;
		try {
			String sql="insert into dept values(?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			n=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return n;
	}
}
