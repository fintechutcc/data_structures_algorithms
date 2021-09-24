package th.ac.utcc.eng.nc231;

public class CarStackLinkedList extends CarLinkedList {
	public CarStackLinkedList() {
		super();
	}
	
	public void push(Car c) {
		insertFirst(c);
	}
	
	public Car pop() {
		if(first != null) {
			return delete(first.car.getId()).car;
		}
		
		return null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
}
