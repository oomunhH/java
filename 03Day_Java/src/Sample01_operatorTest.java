
public class Sample01_operatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.대입연산자
//		int x=10;
//		int x2=x;	
//		System.out.println(x2);
//		x2+=x;	//x2=x2+x;라는 말.
//		System.out.println(x2);
//		x2-=x; 
//		System.out.println(x2);
//		x2*=x;
//		System.out.println(x2);
//		x2/=x;
//		System.out.println(x2);
//		x2%=x;
//		System.out.println(x2);
//		
//		x+=1; //x=x+1
//		
		//3.증감연산자
//		int k=10;
//		System.out.println(k);
//		int a=++k;
//		System.out.println(k);
//		++k;
//		System.out.println(k);
//		System.out.println(a);
//	
//		int b=k++;
//		System.out.println(k);
//		System.out.println(b);
//		k++;
//		System.out.println(k);
//		
		
//		int a=3;
//		++a;
//		System.out.println(a);
//		a--;
//		System.err.println(a);
//		
//		int x=5;
//		int y=++x;
//		System.out.println(x+" "+y);
//		
//		int x2=5;
//		int y2=x2++;
//		System.out.println(x+" "+y);
		
		//4.비교연산자
//		int xyz=5;
//		int xyz2=3;
//		boolean result=xyz==xyz2;
//		System.out.println(xyz==xyz2);
//		System.out.println(xyz!=xyz2);
//		System.out.println(xyz>xyz2);
//		System.out.println(xyz>=xyz2);
//		System.out.println(xyz<xyz2);
//		System.out.println(xyz<=xyz2);
//		System.out.println(result);
//		
		//5.논리연산자
//		System.out.println(3==4 && 4>3);
//		System.out.println(! true);
//		System.out.println(! false);
//		System.out.println(true || true);
//		System.out.println(true || false);
//		System.out.println(false || true);
//		System.out.println(false || false);
//		
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
//		int x =10;
//		int y =15;
//		System.out.println(x>5 && y<25);
//		System.out.println(x>8 && y<10);
//		System.out.println(x>15 || y<25);
//		System.out.println(x>8 || y<25);
		
		//6. 3항연산자
//		int xxx=(3==4)?100:200;
//				String xxx2 =(3!=4)?"A":"B";
//				System.out.println(xxx);
//				System.out.println(xxx2);
//		int a=10;
//		int b=20;
//		int max=(a>b)?a:b;
//		System.out.println(max);
//		int max2=(b>a)?b:a;
//		System.out.println(max2);
//		int max3=(a<b)?b:a;
//		System.out.println(max3);
		
		int a =10;
		int b =20;
		int c =30;
		int max=(a>c)?a:c;
		int final_max=(b>max)?c:max;
		System.out.println(final_max);
		
		int max1=(a>b)?(c>a?c:a):(c>b?c:b);
		System.out.println(max1);
		

	}

}
