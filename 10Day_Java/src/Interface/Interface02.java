package Interface;

interface Vehicle{
	public abstract void speed();
	public default void start() {
		System.out.println("start~~");
	}
	int num=10;
	public static void stop() {
		System.out.println("stop~~!");
	}
	
}

class Car implements Vehicle{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("100km");
	}
	
}
public class Interface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.start();
		c.speed();
		Vehicle.stop();
		System.out.println(Vehicle.num);
	}

}
