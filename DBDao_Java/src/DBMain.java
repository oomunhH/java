import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBService service=new DBService();
//		service.setDAO(new MySQLDAO());
		//mysql접속을 위해 객체 생성 후 service에 넘김
		service.setDAO(new OracleDAO());
	}

}
