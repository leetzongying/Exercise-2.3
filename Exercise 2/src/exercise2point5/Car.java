package exercise2point5;

import java.util.*;

public class Car {

	String brand;
	String model;
	String colour;
	String engine;
	int quantity;
	
	Scanner in = new Scanner(System.in);
	
	//setter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	//getter
	public String getBrand() {
		return this.brand;
	}
	public String getModel() {
		return this.model;
	}
	public String getColour() {
		return this.colour;
	}
	public String getEngine() {
		return this.engine;
	}
	
	//methods
	void OrderCarAlpha(double price) {
		System.out.println("Enter the quantity of car you want to purchase");
		int quantity = in.nextInt();
		double totalprice = price*quantity;
		System.out.println("The total price for " + quantity + " of " + brand + " you purchased is RM" + totalprice);	
		}
	void startEngine() {
		System.out.println("Do you want to press the start engine? (true/false)");
		boolean confirm = in.nextBoolean();
		
		if(confirm == true) {
			System.out.println("Engine starts!");
		}
		else {
			System.out.println("Car is still idle.");
		}
	}
}
