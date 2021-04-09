package Ying;

import java.util.*;
public class Smartphone {
	
	Scanner in = new Scanner(System.in);
	
	void printSpec(String model, String OS, int releasedyear) {
		System.out.println("Enter name of brand:");
		String brand = in.next();
		System.out.println("Brand: " + brand);
		
		System.out.println("Model: " + model);
		System.out.println("Operating System: " + OS);
		System.out.println("Released Year: " + releasedyear);
	}
	
	void printNotification(){
		System.out.println("Allow notification on? (Y/N)");
		String a = in.next();
		char note = a.charAt(0);
        if (note == 'Y'|| note =='y') {
        	System.out.println("You have incoming messages, scroll up to read more.");
        }
        else if(note == 'N' || note == 'n'){
        	System.out.println("No notification will be received at this moment");
        }
    }
	
	void weight(String brand) {
		System.out.println("Enter quantity of smartphonee you buy");
		int quantity = in.nextInt();
		System.out.println("Enter the weight of the smartphone");
		double weight = in.nextDouble();
		
		double totalWeight = (quantity*weight);
		
		System.out.println("The Unit Weight of " + brand + " is :" + weight +"kg");
		System.out.println("The Total Unit Purchased is : " + quantity + " units.");
		System.out.println("The total weight for " + quantity + " " + brand + " is :" + totalWeight + "kg");
	}
	
	void Resolution() {
		System.out.print("Enter your screen resolution(Horizontal): ");
		int h=in.nextInt();
		System.out.print("Enter your screen resolution(vertical): ");
		int v=in.nextInt();
		System.out.print("Enter your screen surface area(inch): ");
		int area=in.nextInt();
		int dpi=(h*v)/area;
		System.out.println("The dpi of your screen is: "+dpi+"dpi");
	}

	void appSelection() {
		System.out.print("Select the app you want to run.");
		System.out.println();
		System.out.print("Type 1 for Google Chrome, Type 2 for MP3 player, Type 3 for games, Type 4 for video conference");
		int select = in.nextInt();
		switch (select) {
		case 1: 
			System.out.print("You now can browse the Internet");
			break;
		case 2:
			System.out.print("Enjoy your music!");
			break;
		case 3:
			System.out.print("Have fun with your games!");
			break;
		case 4:
			System.out.print("Video conference is now ready, you now can select any contacts to start.");
			break;
		default:
			System.out.print("Invalid input detected");
		}
	}
}
