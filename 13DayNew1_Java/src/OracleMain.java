import java.util.HashSet;

import com.service.OracleService;
//Main에서 오라클서비스 new 오라클 서비스의 기본생성자는 실제 실행될 내용의 dao 객체를 new해주고 멤버변수로 설정해주고 있다.
//service.select하면은 실제 실행해야할 dao의 select를 get해와서  return(dao에서 담아온 set) 
public class OracleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleService service=new OracleService();
		HashSet<String> xxx=service.select();
		for (String s : xxx) {
			System.out.println(s);
		}
	}

}
