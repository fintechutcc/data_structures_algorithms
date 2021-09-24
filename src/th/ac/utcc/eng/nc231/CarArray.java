package th.ac.utcc.eng.nc231;

public class CarArray {
	private Car [] car;
	private int carNums;
	
	// Constructor
	public CarArray() {
		this.carNums = 0;
		this.car = new Car[10];
	}
	
	// Constructor
	public CarArray(int n) {
		this.carNums = 0;
		if(n > 0)
			this.car = new Car[n];
		else
			this.car = new Car[10];
	}
	
	public void insert(Car c) {
		// TODO: may have a problem!!!
		if(carNums < car.length)
			this.car[carNums++] = c;		
	}
	
	public void remove() {
		// TODO: leave it to the next chapters
	}

	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	public int getCarNums() {
		return carNums;
	}

	public void setCarNums(int carNums) {
		this.carNums = carNums;
	}
	
	
}
