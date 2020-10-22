import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Random  ran  = new Random();  
	       int n = ran.nextInt();
	       int m = ran.nextInt();
	       int z1= ran.nextInt(46);
	       int z2= ran.nextInt(46);
	       int z3= ran.nextInt(46);
	       int z4= ran.nextInt(46);
	       int z5= ran.nextInt(46);
	       int z6= ran.nextInt(46);
	       System.out.println(n);
	       System.out.println(m);
	       System.out.println("1번"+z1);
	       System.out.println("2번"+z2);
	       System.out.println("3번"+z3);
	       System.out.println("4번"+z4);
	       System.out.println("5번"+z5);
	       System.out.println("6번"+z6);
	 
	       float f=ran.nextFloat();
	       System.out.println(f); //0.0부터 1.0사이의 임의의 값
	       
	       boolean b=ran.nextBoolean();
	       System.out.println(b);//임의의 논리값 true false

	}

}
