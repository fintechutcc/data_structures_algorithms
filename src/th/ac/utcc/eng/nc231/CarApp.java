package th.ac.utcc.eng.nc231;

public class CarApp {

	public static void main(String[] args) {
		CarArray cars = new CarArray(3);

		Car c1 = new Car();
		c1.setBrand("Toyoto");
		c1.setModel("Camry");
		c1.setColor("Black");
		c1.setDoorsNum(4);
		c1.setPrice(1000000.);
		
		Car c2 = new Car();
		c2.setBrand("Nissan");
		c2.setModel("Kick");
		c2.setColor("White");
		c2.setDoorsNum(4);
		c2.setPrice(1100000.);
		
		Car c3 = new Car();
		c3.setBrand("Honda");
		c3.setModel("CRV");
		c3.setColor("Blue");
		c3.setDoorsNum(5);
		c3.setPrice(1800000.);
		
		Car c4 = new Car();
		c4.setBrand("Benz");
		c4.setModel("C Class");
		c4.setColor("Black");
		c4.setDoorsNum(2);
		c4.setPrice(3500000.);
		
		cars.insert(c1);
		cars.insert(c2);
		cars.insert(c3);
		cars.insert(c4);
		
		System.out.println("Number of cars: " + cars.getCarNums());
		
		Car [] carArray = cars.getCar();
		for(int i=0; i < carArray.length; i++) {
			System.out.println("Car " + i + ": " + carArray[i]);
		}
		
		// สร้าง cars2 และ copy จาก cars ไปยัง cars2
		CarArray cars2 = new CarArray(10);
		cars2.insert(c1);
		cars2.insert(c2);
		cars2.insert(c3);
		cars2.insert(c4);
		
		System.out.println("Cars2:");
		Car [] carArray2 = cars2.getCar();
		for(int i=0; i < 4; i++) {
			System.out.println("Car " + i + ": " + carArray2[i]);
		}
	}

}
