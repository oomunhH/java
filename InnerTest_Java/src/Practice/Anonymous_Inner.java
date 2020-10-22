package Practice;
interface Flyer{
	public abstract void takeoff();
	
	public abstract void fly();
	
	public void land();
}
public class Anonymous_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyer f=new Flyer() {
			public void fly() {
				System.out.println("fly");
			}
		
			public void land() {
				System.out.println("land");
			}
			@Override
			public void takeoff() {
				// TODO Auto-generated method stub
				System.out.println("takeoff");
			}
		};
		f.fly();
		f.land();
		f.takeoff();
	}

}
