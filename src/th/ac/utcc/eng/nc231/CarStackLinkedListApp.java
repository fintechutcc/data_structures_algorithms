package th.ac.utcc.eng.nc231;

public class CarStackLinkedListApp {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setBrand("Toyota");
		c1.setModel("Camry");
		c1.setColor("Black");
		c1.setDoorsNum(4);
		c1.setPrice(1000000.);
		c1.setId(0);
		
		Car c2 = new Car();
		c2.setBrand("Nissan");
		c2.setModel("Kick");
		c2.setColor("White");
		c2.setDoorsNum(4);
		c2.setPrice(1100000.);
		c2.setId(1);
		
		Car c3 = new Car();
		c3.setBrand("Honda");
		c3.setModel("CRV");
		c3.setColor("Blue");
		c3.setDoorsNum(5);
		c3.setPrice(1800000.);
		c3.setId(2);
		
		Car c4 = new Car();
		c4.setBrand("Benz");
		c4.setModel("C Class");
		c4.setColor("Black");
		c4.setDoorsNum(2);
		c4.setPrice(3500000.);
		c4.setId(3);
		
		CarStackLinkedList carStack = new CarStackLinkedList();
		carStack.push(c1);
		carStack.push(c2);
		carStack.push(c3);

		while(!carStack.isEmpty()) {
			System.out.println(carStack.pop());
		}
	}

}
