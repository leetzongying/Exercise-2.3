package Ying;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Smartphone Huawei = new Smartphone();
		Smartphone Samsung = new Smartphone();
		Smartphone Apple = new Smartphone();
		Smartphone Nokia = new Smartphone();
		
		System.out.println("Phone 1 Specifications");
		Huawei.printSpec("P30","Android 9.0 \"Pie\"",2019);
		 
		System.out.println("\n");
		 
		 Huawei.printNotification();
		 Huawei.weight("Huawei");
		 Huawei.Resolution();
		 Huawei.appSelection();
		 
		 System.out.println("\n");
		 
		 System.out.println("Phone 2 Specifications");
		Samsung.printSpec("Samsung Galaxy S21","One UI 3.1, Android 11",2021);
		 
		 System.out.println("\n");
		 
		 Samsung.printNotification();
		 Samsung.weight("Huawei");
		 Samsung.Resolution();
		 Samsung.appSelection();
		 
		 System.out.println("\n");
		 
		 System.out.println("Phone 3 Specifications");
		 Apple.printSpec("iPhone 12 Pro","iOS 14.1",2020);
		 
		 System.out.println("\n");
		 
		 Apple.printNotification();
		 Apple.weight("Huawei");
		 Apple.Resolution();
		 Apple.appSelection();
		 
         System.out.println("\n");
		 
		 System.out.println("Phone 4 Specifications");
		 Nokia.printSpec("Nokia 3310","Yun OS",2020);
		 
		 System.out.println("\n");
		 
		 Nokia.printNotification();
		 Nokia.weight("Huawei");
		 Nokia.Resolution();
		 Nokia.appSelection();
		

	}

}
