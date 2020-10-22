package Test04;

public class Cruise extends Ship{

	@Override
	public void sail(int dist) {
		setFuelTank(getFuelTank()-dist*13);
		
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank()+fuel*8);
		
	}

	public Cruise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}


	
}
