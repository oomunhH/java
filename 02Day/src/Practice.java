
public class Practice {
		String name;
		int age;
		String address;
		public void printInfo() {
			System.out.println("이름은 "+name+" 나이는 "+age+" 주소는 "+address+"이다");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice P_1 = new Practice();
		P_1.name="홍길동";
		P_1.age=20;
		P_1.address="서울";
		System.out.println(P_1);
		Practice P_2 = new Practice();
		P_2.name="이효리";
		P_2.age=40;
		P_2.address="제주도";
		System.out.println(P_2);
		P_1.printInfo();
		P_2.printInfo();
	}

}
