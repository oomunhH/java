
public class Counter {
	static int count;
	int num;
	public Counter() {
		count++;
		num=count;
	}
	public int getNum() {return num;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(count);
		System.out.println("객체생성 횟수 : "+ Counter.count);
		
		Counter c=new Counter();
		System.out.println(count);
		System.out.println("객체생성 횟수 : "+ c.getNum());
		System.out.println("객체생성 횟수 : "+ Counter.count);
		System.out.println("num:"+c.num);
		Counter c2=new Counter();
		System.out.println(count);
		System.out.println("객체생성 횟수 : "+ c2.getNum());
		System.out.println("객체생성 횟수 : "+ Counter.count);
		System.out.println("num:"+c2.num);
		Counter c3=new Counter();
		System.out.println(count);
		System.out.println("객체생성 횟수 : "+ Counter.count);
		System.out.println("num:"+c3.num);
	}

}
