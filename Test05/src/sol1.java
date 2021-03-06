import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class sol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userid="scott";
		String passwd="tiger";
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userid,passwd);
			String sql="select * from dept order by deptno";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("deptno\tdname\t\tloc");
			System.out.println("-------------------------------");
			while(rs.next()) {
				int deptno=rs.getInt(1);
				String dname=rs.getString(2);
				String loc=rs.getString(3);
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
				
				
	}

}
