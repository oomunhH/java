
public class Sample07_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("-------"+i+"------");
			System.out.println("hello1"+i);
			System.out.println("hello2"+i);
			if(i==3)continue;
			System.out.println("hello3"+i);
			System.out.println("hello4"+i);
			
		}
	}

}
