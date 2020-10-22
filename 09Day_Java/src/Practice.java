
public class Practice {
		public void createPet(int num) {
					
			if(num==1) {
				Pet c= new Cat("야옹이", 3, "암놈");
				Cat cat=(Cat)c;
				System.out.println(cat.getGender());
			} else if(num==2){
				Pet d= new Dog("강아지", 10, "암놈","검정");	
				Dog dog=(Dog)d;
				System.out.println(dog.getColor());
			} else if(num==3) {
				Pet f= new Fish("븡어", 10, "암놈",2.5);
				Fish fish=(Fish)f;
				System.out.println(fish.getTailSize());
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice test=new Practice();
		test.createPet(1);
		test.createPet(2);
		test.createPet(3);
	}

}
