
public class Sample01_operatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		System.out.println(4<2 && (name.length()==4));
		//System.out.println(4>2 && (name.length()==4)); -null값은 입력되지않은 값이기에 존재하지 않아 오류가 발생한다.
		
		//and 연산자 사용시에  앞의 조건이 false가 나오면 결과가 false이므로 뒤에 있는 조건을 계산 하지 않는다.
		//(뒤에 조건이 이름이 null 값이기 때문에 오류가 발생하지만 뒤에 조건을 계산하지 않는다.)
		//7행에서는 앞의 조건이 true이므로 뒤에 있는 조건을 계산하려고 하지만 오류가 발생한다.
	}	

}
