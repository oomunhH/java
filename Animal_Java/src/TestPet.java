
public class TestPet {
	public  void petPrint(Pet p) {
		
	}
	public static void main(String[] args) {
		Pet [] c = {
						new Cat("야옹이",3,"암놈"),
						new Cat("야옹이",3,"암놈"),
						new Dog("누렁이",8,"암놈","검정")};
		System.out.println(c);
	Object [] c1 = {
			10,
			"홍길동",
			new Cat("야옹이",3,"암놈"),
			new Cat("야옹이",3,"암놈"),
			new Dog("누렁이",8,"암놈","검정")
	};
	for(Object object:c) {
		System.out.println(object); //toString 호출
	}
	System.out.println("=================");
	}
}
