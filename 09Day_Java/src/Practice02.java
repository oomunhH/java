
public class Practice02 {
	public Pet createPet(int num) {
		Pet p=new Pet();
		if(num==1) {
			p= new Cat("야옹이", 3, "암놈");
			
		} else if(num==2){
			p= new Dog("강아지", 10, "암놈","검정");	
			
		} else if(num==3) {
			p= new Fish("븡어", 10, "암놈",2.5);
			
		}
		return p;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Practice02 test=new Practice02();
	Pet p=test.createPet(3);

	
	
	if(p instanceof Cat) 
	{Cat c=(Cat)p;
	System.out.println(c.getGender());
	}else if(p instanceof Dog) 
	{Dog d=(Dog)p;
	System.out.println(d.getColor());	
	}else if(p instanceof Fish) 
	{Fish f=(Fish)p;
	System.out.println(f.getTailSize());		
	}
	
}

}
