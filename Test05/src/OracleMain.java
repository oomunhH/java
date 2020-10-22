//OracleMain.java – main함수포함 insert자료를 넘김
public class OracleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleService service=new OracleService();
		
		Dept dept=new Dept(99,"영업부","경기도");
		int n=service.insert(dept);
		System.out.println("insert 횟수: "+n);
	}

}
