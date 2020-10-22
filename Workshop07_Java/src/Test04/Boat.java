package Test04;

public class Boat extends Ship {

	@Override
	public void sail(int dist) {
		// TODO Auto-generated method stub
		setFuelTank(getFuelTank()-dist*10);
	}

	@Override
	public void refuel(int fuel) {
		// TODO Auto-generated method stub
		setFuelTank(getFuelTank()+fuel*10);
	}

	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Boat(String shipname,int refuel) {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
