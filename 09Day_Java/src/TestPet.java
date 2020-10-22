
public class TestPet {
	public void petPrint(Pet p) {
		System.out.println(p.printInfo());
		Cat cat=null;
		if(p instanceof Cat) {
			cat=(Cat)p;
			System.out.println(cat.getGender());
		}
		else if(p instanceof Dog) {
			Dog dog=(Dog)p;
			System.out.println(dog.getColor());
		}
		else if(p instanceof Fish) {
			Fish fish=(Fish)p;
			System.out.println(fish.getTailSize());
		}else {
			System.out.println("잘못된 데이터");
		}
		
	}
	public void arrPrint(Pet[] pets) {
		System.out.println("arrprint함수 호출=========");
		for(Pet p:pets) {
			System.out.println(p.printInfo());
			if(p instanceof Cat) {
				Cat cat=(Cat)p;
				System.out.println(cat.getGender());
			}
			else if(p instanceof Dog) {
				Dog dog=(Dog)p;
				System.out.println(dog.getColor());
			}
			else if(p instanceof Fish) {
				Fish fish=(Fish)p;
				System.out.println(fish.getTailSize());
			}else {
				System.out.println("잘못된 데이터");
			}
		}
	}
	
	public Pet[] createPetArr() {
		Pet c= new Cat("야옹이", 3, "암놈"); 
		Pet d= new Dog("강아지", 10, "암놈","검정");
		Pet f= new Fish("븡어", 10, "암놈",2.5);
		Pet[] pets=new Pet[3];
		pets[0]=c;
		pets[1]=d;
		pets[2]=f;
		
		return pets;
	}
	public static void main(String[] args) {
//		Pet c= new Cat("야옹이", 3, "암놈"); 
//		Pet d= new Dog("강아지", 10, "암놈","검정");
//		Pet f= new Fish("븡어", 10, "암놈",2.5);
//		//System.out.println(c.printInfo());
		TestPet test=new TestPet();
//		test.petPrint(c);
//		test.petPrint(d);
//		test.petPrint(f);
//		
//		//배열에 담을것이다. 부모클래스 타입으로 설정.
//		Pet[] pets=new Pet[3];
//		pets[0]=c;
//		pets[1]=d;
//		pets[2]=f;
//		test.arrPrint(pets);
		test.arrPrint(test.createPetArr());
	}
}
