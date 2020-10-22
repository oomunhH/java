package GenericTest;

import java.util.Date;

class Box1{
	Object obj;
	
	public void setValue(Object obj) {
		this.obj=obj;
	}
	public Object getValue() {
		return obj;
	}
}

public class GenericClass01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 b=new Box1();
		b.setValue("Hello");
		String str=(String)b.getValue();
		System.out.println(str);
		
		Box1 b2=new Box1();
		b2.setValue(new Date());
		Date d=(Date)b2.getValue();
		System.out.println(d);
	}

}
