package GenericTest;
class Group<T>{
	T obj;
	public void setValue(T obj) {
		this.obj=obj;
	}
	public T getValue() {
		return obj;
	}
}
class Person{}
class Man extends Person{}
class Woman extends Person{}
public class Ex10_5 {
	public static void method(Group<?> group) {}
	public static void method2(Group<? extends Person>group) {}
	public static void method3(Group<? super Person> group) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(new Group<Object>());
		method(new Group<Person>());
		method(new Group<Man>());
		method(new Group<Woman>());
		
		method2(new Group<Person>());
		method2(new Group<Man>());
		method(new Group<Woman>());
		
		method3(new Group<Object>());
		method3(new Group<Person>());
	}

}
