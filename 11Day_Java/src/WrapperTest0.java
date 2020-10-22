
public class WrapperTest0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="123";
		int a=Integer.parseInt(str);
		
		String str2="3.14F";
		float b=Float.parseFloat(str2);
		System.out.println(str2);
		System.out.println(b);
		
		int num0=10;
		Integer x=new Integer(num0);
		System.out.println(x+num0);
		int x2=x.intValue();
		System.out.println(x2);
		
		int num=10;
		Integer num2=num;
		
		System.out.println(num==num2);
		
		Integer num3=new Integer(200);
		int num4=num3;
		
		System.out.println(num3>100);
	}

}
