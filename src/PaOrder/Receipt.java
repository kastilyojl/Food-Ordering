package PaOrder;

import java.util.Scanner;

public class Receipt extends Food_List{
	
	static void purchase() {
		
	   	Scanner keyboard2 = new Scanner(System.in);
		
			try { 
				
			int range[] = new int[6];
	
			System.out.println();
			System.out.print("Enter Here!: ");
			here = keyboard2.nextInt();
			int newrange = range[here];
	
			
			System.out.print("How many pieces?: ");
			pieces = keyboard2.nextInt();
			System.out.print("Total: ");
			piraso[c++]=pieces;
			
			

			  } catch(ArrayIndexOutOfBoundsException e) {
			        System.out.println("The Choices is from 1-5 Only");
			        	} 
			
			
		}
	
	
   static void PersonalInfo() {
	   
	   Scanner keyboard3 = new Scanner(System.in);
		
		System.out.println();
		System.out.println("    ----------Food Deliver Receipt----------");
		System.out.println("*Note! We Only Accepting Cash On Delivery Mode of Payment.");
		System.out.println();
		System.out.print("Enter Name: ");
		String name = keyboard3.nextLine();
		System.out.print("Enter Address: ");
		String address = keyboard3.nextLine();
		
		keyboard3.close();
		
	}
   

   static void AllItems() {
	
	System.out.println();
	
	for(int i=0; i<store.length; i++) {
		System.out.println(store[i] + " x " + piraso[i] );
		
		if(store[i+1]==null)  
			          break;
		
	}
	
	int sum=0;
	
	for(int e=0; e<price.length; e++) 
		sum=sum+price[e];
	
	   System.out.println("\nTotal Amount:              P " +sum+".00");
}
	
   
   static void thanku() {
	System.out.println("\n---Thank You! Come & Order Again <3.---");
}


		
	}


