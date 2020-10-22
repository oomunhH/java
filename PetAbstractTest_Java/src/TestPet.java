
public class TestPet {
	public  void petPrint(Pet p) {
		
	}
	public static void main(String[] args) {
		
		Pet c= new Cat("야옹이", 3, "암놈"); 
		Pet d= new Dog("강아지", 10, "암놈","검정");
		Pet f= new Fish("븡어", 10, "암놈",2.5);
		
		c.cry();
		c.eat();
		d.cry();
		d.eat();
		f.cry();
		f.eat();
		
		Pet[] pets=new Pet[3];
		pets[0]=c;
		pets[1]=d;
		pets[2]=f;
		
		for(Pet i:pets) {
			i.cry();
		}
	
	}
}
