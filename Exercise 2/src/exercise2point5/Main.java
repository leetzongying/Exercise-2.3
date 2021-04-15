package exercise2point5;

public class Main {

	public static void main(String[] args) {
		Car Alpha = new Car();
		
		Alpha.setBrand("Lamborghini");
		Alpha.setModel("Huracan Evo");
		Alpha.setColour("Red");
		Alpha.setEngine("5.2L Nat Aspired V10");
		
		System.out.println("Alpha Car Profile");
		
		System.out.println();
		
		System.out.println("Brand: " + Alpha.getBrand());
		System.out.println("Model: " + Alpha.getModel());
		System.out.println("Colour: " + Alpha.getColour());
		System.out.println("Engine: " + Alpha.getEngine());
		
		System.out.println();
		
		Alpha.OrderCarAlpha(860980.60);
		Alpha.startEngine();

	}

}
