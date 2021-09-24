package th.ac.utcc.eng.nc231.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import th.ac.utcc.eng.nc231.Car;
import th.ac.utcc.eng.nc231.CarStackArray;

public class TestCarStackArray {
	Car c1, c2, c3, c4;
	
	@BeforeEach
	void setUp() {
		c1 = new Car();
		c1.setBrand("Toyota");
		c1.setModel("Camry");
		c1.setColor("Black");
		c1.setDoorsNum(4);
		c1.setPrice(1000000.);
		c1.setId(0);
		
		c2 = new Car();
		c2.setBrand("Nissan");
		c2.setModel("Kick");
		c2.setColor("White");
		c2.setDoorsNum(4);
		c2.setPrice(1100000.);
		c2.setId(1);
		
		c3 = new Car();
		c3.setBrand("Honda");
		c3.setModel("CRV");
		c3.setColor("Blue");
		c3.setDoorsNum(5);
		c3.setPrice(1800000.);
		c3.setId(2);
		
		c4 = new Car();
		c4.setBrand("Benz");
		c4.setModel("C Class");
		c4.setColor("Black");
		c4.setDoorsNum(2);
		c4.setPrice(3500000.);
		c4.setId(3);
	}
	
	@Test
	void testPushPop() {
		CarStackArray carStack = new CarStackArray(5);
		carStack.push(c1);
		
		Car car = carStack.pop();
		assertEquals(c1.getId(), car.getId());
		assertEquals(c1.getBrand(), car.getBrand());
	}
	
	@Test 
	void testIsEmpty() {
		CarStackArray carStack = new CarStackArray(5);
		assertEquals(carStack.isEmpty(), true);
		
		carStack.push(c1);
		carStack.push(c2);
		
		carStack.pop();
		carStack.pop();
		assertEquals(carStack.isEmpty(), true);
	}
	
	@Test
	void testIsFull() {
		CarStackArray carStack = new CarStackArray(5);
		carStack.push(c1);
		carStack.push(c2);
		carStack.push(c3);
		carStack.push(c4);
		carStack.push(c1);
		assertEquals(carStack.isFull(), true);
	}
}
