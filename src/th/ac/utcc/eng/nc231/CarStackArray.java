package th.ac.utcc.eng.nc231;

public class CarStackArray {
	private int maxSize;
	private Car [] carArray;
	private int top;
	
	public CarStackArray(int maxSize) {
		this.maxSize = maxSize;
		this.carArray = new Car[this.maxSize];
		this.top = -1;
	}
	
	public void push(Car c) {
		carArray[++top] = c;
	}
	
	public Car pop() {
		return carArray[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}
}
