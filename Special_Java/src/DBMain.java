import com.dao.DBDAO;
import com.dao.MariaDAO;
import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBService service=DBService.getService(); //4. 생성자에 있는 객체를 받아와서 사용
		
		DBService service1=DBService.getService();
		DBService service2=DBService.getService(); 
		DBService service3=DBService.getService();
		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service3);
		
		DBDAO o=new OracleDAO();
		DBDAO my=new MySQLDAO();
		DBDAO ma=new MariaDAO();
		service.setDAO(o);
		service.setDAO(my);
		service.setDAO(ma);
		service.setDAO(new OracleDAO());
		service.setDAO(new MySQLDAO());
		service.setDAO(new MariaDAO());
		
		service.insert();
		
	}

}
