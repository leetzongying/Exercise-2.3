package setterAndGetter;

public class Dog {
	
	String breed;
	String color;
	String size;
	String coat;
	double food;
	  
	 // Create Setter Method
	  public void setBreed(String breed) {
	    this.breed = breed;
	  }
	  
	  public void setColor(String color) {
		    this.color = color;
	  }
	  
	  public void setSize(String size) {
	    this.size = size;
	  }
	  
	  public void setCoat(String coat) {
		  this.coat = coat;
	  }
	  
	  public void setFood(double food) {
		  this.food = food;
	  }
	  
	   // Create Getter Method
	  public String getBreed() {
		  return this.breed;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }
	  
	  public String getSize() {
		  return this.size;
	  }
	  
	  public String getCoat() {
		  return this.coat;
	  }
	  
	  public double getFood() {
		  return this.food;
	  }
	  
	  //method
	  void CalculateFood(int month){
		  double totalFoodTaken = food*month*30;
		  System.out.println("The average amount food of " + breed + " taken per day is " + food + "kg.");
		  System.out.println(breed + " eats " + totalFoodTaken + "kg of food in " + month + " month");
	  }

}
