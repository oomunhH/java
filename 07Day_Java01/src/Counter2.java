
public class Counter2 {
	static int count;
	int num;
	public Counter2() {
		count++;
		num=count;
	}
	public int getNum() {return num;}
	public static int getCount() {return count;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("객체생성횟수 : "+Counter2.getCount());
		Counter2 c=new Counter2();
		System.out.println("객체생성횟수 : "+Counter2.getCount());
		System.out.println("객체생성횟수 : "+c.getNum());
		Counter2 c2=new Counter2();
		System.out.println("객체생성횟수 : "+Counter2.getCount());
		System.out.println("객체생성횟수 : "+c2.getNum());
	}

}
