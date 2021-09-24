package th.ac.utcc.eng.nc231;

public class CarQueue {
	private int maxSize;
	private Car [] cars;
	private int front;
	private int rear;
	private int nItems;
	
	public CarQueue(int size) {
		maxSize = size;
		cars = new Car[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(Car c) {
		if(rear == maxSize -1)
			rear = -1;
		cars[++rear] = c;
		nItems++;
	}
	
	public Car remove() {
		Car c = cars[front++];
		front %= maxSize;
		nItems--;
		
		return c;
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public int size() {
		return nItems;
	}
}
