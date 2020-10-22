
public class TestOuter {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.innerCreate();

		
		//2. Outer밖에서 Inner 생성==>반드시 Outer부터생성한다.
		Outer outer2 = new Outer(); //Outer 타입 먼저 만들고,
		outer2.n=10;
		Outer.Inner inner = outer2.new Inner(); //Outerclass에있는 Inner 타입으로 Outer.Inner
		inner.info();
	}

}
