package th.ac.utcc.eng.nc231.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import th.ac.utcc.eng.nc231.Car;

class TestCar {
	@Test
	void testBrand() {
		Car car = new Car();
		String brand = "Toyota";	
		car.setBrand(brand);
		assertEquals(car.getBrand(), brand);
	}
	
	@Test
	void testModel() {
		Car car = new Car();
		String model = "Camry";
		car.setModel(model);
		assertEquals(car.getModel(), model);
	}
	
	@Test
	void testColor() {
		Car car = new Car();
		String color = "Red";
		car.setColor(color);
		assertEquals(car.getColor(), color);
	}
	
	@Test
	void testDoorNums() {
		Car car = new Car();
		int doorNums = 4;
		car.setDoorsNum(doorNums);
		assertEquals(car.getDoorsNum(), doorNums);
	}
	
	@Test 
	void testPrice() {
		Car car = new Car();
		double price = 500000.0;
		car.setPrice(price);
		assertEquals(car.getPrice(), price);
	}

}
