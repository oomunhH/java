package Practice;

public class TestPet {
	public void petPrint(Object pet) {
//		Cat cat=(Cat)pet;
//		System.out.println("petPrint 호출됨========"+cat.printInfo());
		if(pet instanceof Cat) {
			Cat cat=(Cat)pet;
			System.out.println(cat.getGender());
			System.out.println(cat.printInfo());
		}else if(pet instanceof Dog)	{
			Dog dog=(Dog)pet;
			System.out.println(dog.getColor());
			System.out.println(dog.printInfo());
		}else if(pet instanceof Fish)	{
			Fish fish=(Fish)pet;
			System.out.println(fish.getTailSize());
			System.out.println(fish.printInfo());
		}else if(pet instanceof Pet) 	{
			System.out.println(((Pet) pet).printInfo());
		}else {
			System.out.println("똑바로 넣으세요");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet c=new Cat("야옹이",3,"암컷");
//		System.out.println(c.printInfo());
		Pet d=new Dog("강아지",10,"암놈","검정");
//		System.out.println(d.printInfo());
		Pet f=new Fish("금붕어",15,"암놈",10.1);
//		System.out.println(f.printInfo());
//		Cat c1=(Cat)c;
//		System.out.println(c1.getGender());
//		Dog d1=(Dog)d;
//		System.out.println(d1.getColor());
//		Fish f1=(Fish)f;
//		System.out.println(f1.getTailSize());
		
		TestPet test =new TestPet();
		test.petPrint(c);
		test.petPrint(d);
		test.petPrint(f);
		
		Pet[] arr=new Pet[3]; //cat dog fish가 pet타입에 들어가서 배열을 만들 수 있다.
		arr[0]=c;
		arr[1]=d;
		arr[2]=f;
		for(Pet pet:arr) {
			System.out.println(pet.printInfo());
		}
		
//		System.out.println(c.getGender());
		
		
		
//		Cat c=new Cat("야옹이",3,"암컷");
//		c.printInfo();
//		System.out.println(c.printInfo());
//		
//		Dog d=new Dog("멍멍이",4,"수컷","빨강");
//		d.printInfo();
//		System.out.println(d.printInfo());
//		
//		Fish f=new Fish("금붕어",5,"암컷",10);
//		f.printInfo();
//		System.out.println(f.printInfo());
	}

}
