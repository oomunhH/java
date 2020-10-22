package GenericTest;

import java.util.Date;


class Box<T>{
	T obj;
	
	public void setValue(T obj) {
		this.obj=obj;
	}
	public T getValue() {
		return obj;
	}
}

public class GenericClass02 {
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Box<String> b=new Box<String>();
		b.setValue("Hello");
		String str=(String)b.getValue();
//		b.setValue(new Date());
//		Date xx=(Date)b.getValue();
		System.out.println(str);
		
		Box<Date> b2=new Box<>();
		b2.setValue(new Date());
		Date d=(Date)b2.getValue();
		System.out.println(d);
		
		Box<Integer> b3=new Box<>();
		b3.setValue(100);
		b3.setValue(Integer.parseInt("100"));
		int xxx=b3.getValue();
		System.out.println(xxx);
	}

}
