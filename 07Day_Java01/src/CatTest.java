
public class CatTest {
	String name;
	public CatTest(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.new이용해서 배열
		//2.리터럴이용해서 배열
		//3.new와 리터럴이용해서 배열
		CatTest[] cats=new CatTest[3];
		cats[0]=new CatTest("나비");
		cats[1]=new CatTest("야옹이");
		cats[2]=new CatTest("점박이");
		
		CatTest [] cats2= {
				new CatTest("나비"),
				new CatTest("야옹이"),
				new CatTest("점박이"),
				new CatTest("하늘")
		};
		
		CatTest [] cats3=new CatTest[] {
				new CatTest("나비"),
				new CatTest("야옹이"),
				new CatTest("점박이"),
				new CatTest("하늘")
		};
		
		for (CatTest c:cats3) {
			System.out.println("이름: "+c.getName());
		}
		
		
	}

}
