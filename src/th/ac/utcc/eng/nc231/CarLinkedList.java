package th.ac.utcc.eng.nc231;

public class CarLinkedList {
	protected CarNode first;
	
	public CarLinkedList() {
		first = null;
	}
	
	public void insertFirst(CarNode node) {
		node.next = first;
		first = node;
	}
	
	public void insertFirst(Car c) {
		// สร้าง CarNode
		CarNode node = new CarNode();
		node.car = c;
		
		node.next = first;
		first = node;
	}
	
	public CarNode find(int id) {
		CarNode current = first;
		while(current.car.getId() != id) {
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		
		return current;
	}
	
	public CarNode delete(int id) {
		CarNode current = first;
		CarNode previous = first;
		while(current.car.getId() != id) {
			if(current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}
		
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		
		return current;
	}
	
	public void displayList() {
		CarNode current = first;
		while(current != null) {
			System.out.println(current.car);
			current = current.next;
		}
	}
}
