package setterAndGetter;

public class Main {

	public static void main(String[] args) {
		Dog Comel = new Dog();
		
		Comel.setBreed("German Shepherd");
		Comel.setColor("Black & Tan");
		Comel.setSize("Medium");
		Comel.setCoat("Double coat");
		Comel.setFood(0.084);

		System.out.println("Comel's Dog Profile.");
		
		System.out.println();
		
		System.out.println("Breed: " + Comel.getBreed());
		System.out.println("Colour: " + Comel.getColor());
		System.out.println("Size: " + Comel.getSize());
		System.out.println("Type of coat: " + Comel.getCoat());
		
		System.out.println();
		
		Comel.CalculateFood(12);
	}

}
