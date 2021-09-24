package th.ac.utcc.eng.nc231;

public class Car {
	private int id;
	private String brand;
	private String model;
	private String color;
	private int doorsNum;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoorsNum() {
		return doorsNum;
	}
	public void setDoorsNum(int doorsNum) {
		this.doorsNum = doorsNum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return brand + ", " + model + ", " + color + ", " + doorsNum + ", " + price;
	}
}
