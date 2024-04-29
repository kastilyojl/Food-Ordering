package PaOrder;

public class Calling_Foods extends Foods {
	
	void Calling_Types_of_Foods() {
		for(String TOF: Types_Of_Foods)
			System.out.println(TOF);
	}
	
	void Calling_Seafood_Fish() {
		System.out.println("\n\tSeafood & Fish");
		for(String SF: Seafood_Fish)
			System.out.println(SF);
	}
	
	void Calling_Meat_Grills() {
		System.out.println("\n\tMeat & Grills");
		for(String MG: Meat_Grills) 
			System.out.println(MG);
	}
	
	void Calling_Pizza() {
		System.out.println("\n\t\tPizza");
		for(String Pzz: Pizza)
			System.out.println(Pzz);
	}
	
	void Calling_Sushi_Rolls() {
		System.out.println("\n\tSushi & Rolls");
		for(String SH: Sushi_Rolls)
			System.out.println(SH);
	}

}
