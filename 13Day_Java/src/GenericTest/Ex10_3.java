package GenericTest;
class Pet{}
class Cat extends Pet{}
class Dog extends Pet{}

class Box3<T extends Pet>{
	T obj;
	public void setValue(T obj) {
		this.obj=obj;
	}
	public T getValue() {
		return obj;
	}
}
public class Ex10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box3<Pet> b1=new Box3<Pet>();
		Box3<Pet> b2=new Box3<Pet>();
		Box3<Pet> b3=new Box3<Pet>();
		
//		Box3<Object> b4=new Box2<>();
	}

}
