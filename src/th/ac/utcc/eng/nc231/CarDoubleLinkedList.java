package th.ac.utcc.eng.nc231;

public class CarDoubleLinkedList {
	private CarDoubleNode first;
	
	public CarDoubleLinkedList() {
		first = null;
	}
	
	public void insertFirst(Car c) {
		CarDoubleNode node = new CarDoubleNode();
		node.car = c;
		
		node.next = first;
		if(first != null)
			first.previous = node;
		first = node;
	}
	
	public void insertAfter(Car c, int id) {
		// ค้นหาโหนดที่ต้องการ insertAfter โดยใช้ id
		// หากค้นหาไม่พบให้จบเมธอด
		// หากค้นหาพบ จะได้ current มีค่า id ตรงกัน 
		CarDoubleNode current = first;
		while(current.car.getId() != id) {
			if(current.next == null)
				return ;
			else
				current = current.next;
		}
		
		// สร้างโหนดใหม่ที่ต้องการแทรก
		CarDoubleNode newNode = new CarDoubleNode();
		newNode.car = c;
		
		// 4 ขั้นตอนตามทฤษฎี
		newNode.next = current.next;
		current.next.previous =  newNode;
		newNode.previous = current;
		current.next = newNode;
	}
	
	public CarDoubleNode find(int id) {
		CarDoubleNode current = first;
		while(current.car.getId() != id) {
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		
		return current;
	}
	
	public CarDoubleNode delete(int id) {
		CarDoubleNode current = first;
		while(current.car.getId() != id) {
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		if(current == first) {
			first = first.next;
			first.previous = null;
		} else {
			if(current.previous != null)
				current.previous.next = current.next;
			if(current.next != null)
				current.next.previous = current.previous;
		}
		
		return current;
	}
	
	public void displayList() {
		CarDoubleNode current = first;
		while(current != null) {
			System.out.println(current.car);
			current = current.next;
		}
	}
}
