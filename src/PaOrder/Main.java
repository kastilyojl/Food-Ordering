package PaOrder;
import java.util.Scanner;
public class Main extends Receipt{

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Calling_Foods CF = new Calling_Foods();	
		
		try {
		
		while(true) {
			
		System.out.println("Food Delivery");
		
		CF.Calling_Types_of_Foods();
		
		System.out.println("\nFood Delivery is easy as 1, 2, 3, 4...");
		System.out.println("Enjoy your food prepared by professional cooks specially 4 U.");
		System.out.println();
		System.out.print("Enter Here!:");
		int i = keyboard.nextInt();
		
		String new_Types_Of_Foods = CF.Types_Of_Foods[i]; 
		
		Food_List FL = new Food_List();
		
		if(new_Types_Of_Foods == CF.Types_Of_Foods[1]) {
			CF.Calling_Seafood_Fish();
			purchase();
			FL.Seafood_Fish_Purchase();
		} 
		
		else if (new_Types_Of_Foods == CF.Types_Of_Foods[2]) {
			CF.Calling_Meat_Grills();
			purchase();
			FL.Meat_Grills_Purchase();
		}
		
		else if(new_Types_Of_Foods == CF.Types_Of_Foods[3]) {
			CF.Calling_Pizza();
			purchase();
			FL.Pizza_Purchase();
		}
		
		else if(new_Types_Of_Foods == CF.Types_Of_Foods[4]) {
			CF.Calling_Sushi_Rolls();
			purchase();
			FL.Sushi_Rolls_Purchase();
		}
		
		   System.out.print("\nAnother Order? [1.Yes][2.Exit] : ");
	       int again = keyboard.nextInt();
	       
	       if(again>2 || again==0) {
	    	   break;
	       } else {
	       
	       switch(again) {
	       case 1:
	    		System.out.println("///////////////////////////////////");
	    	   break;
	       case 2:
	    	  PersonalInfo();
	    	  AllItems();
	    	  thanku();
	      	  System.exit(0);
	       }
		}
		}		
		}  catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out of Bounds");
		}  catch(Exception e) {
			System.out.println("Numbers Only!");
		}
		
		
		
		}
	}
	
