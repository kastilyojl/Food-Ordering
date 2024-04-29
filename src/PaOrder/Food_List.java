package PaOrder;

public class Food_List extends Foods {
	
	static int num_food_list = 20;
	static int here,pieces,total;
	static int a=0,b=0,c=0;
    static String[] store = new String[num_food_list];
	static int[] piraso = new int[num_food_list];
    static int[] price = new int[num_food_list];
	
	public void Seafood_Fish_Purchase() {
		
		switch(here) {
		case 1:
			total = pieces*Seafood_Fish_Price[1];
			System.out.println(total);
			store[a++]=Seafood_Fish[1];
			price[b++]=total;
			break;
		case 2:
			total = pieces*Seafood_Fish_Price[2];
			System.out.println(total);
			store[a++]=Seafood_Fish[2];
			price[b++]=total;
			break;
		case 3:
			total = pieces*Seafood_Fish_Price[3];
			System.out.println(total);
			store[a++]=Seafood_Fish[3];
			price[b++]=total;
			break;
		case 4:
			total = pieces*Seafood_Fish_Price[4];
			System.out.println(total);
			store[a++]=Seafood_Fish[4];
			price[b++]=total;
			break;
		case 5:
			total = pieces*Seafood_Fish_Price[5];
			System.out.println(total);
			store[a++]=Seafood_Fish[5];
			price[b++]=total;
			break;
		}
		}
		
		public void Meat_Grills_Purchase() {
			
			switch(here) {
			case 1:
				total = pieces*Meat_Grills_Price[1];
				System.out.println(total);
				store[a++]=Meat_Grills[1];
				price[b++]=total;
				break;
			case 2:
				total = pieces*Meat_Grills_Price[2];
				System.out.println(total);
				store[a++]=Meat_Grills[2];
				price[b++]=total;
				break;
			case 3:
				total = pieces*Meat_Grills_Price[3];
				System.out.println(total);
				store[a++]=Meat_Grills[3];
				price[b++]=total;
				break;
			case 4:
				total = pieces*Meat_Grills_Price[4];
				System.out.println(total);
				store[a++]=Meat_Grills[4];
				price[b++]=total;
				break;
			case 5:
				total = pieces*Meat_Grills_Price[5];
				System.out.println(total);
				store[a++]=Meat_Grills[5];
				price[b++]=total;
				break;
			}
		}
		
		public void Pizza_Purchase() {
			
			switch(here) {
			case 1:
				total = pieces*Pizza_Price[1];
				System.out.println(total);
				store[a++]=Pizza[1];
				price[b++]=total;
				break;
			case 2:
				total = pieces*Pizza_Price[2];
				System.out.println(total);
				store[a++]=Pizza[2];
				price[b++]=total;
				break;
			case 3:
				total = pieces*Pizza_Price[3];
				System.out.println(total);
				store[a++]=Pizza[3];
				price[b++]=total;
				break;
			case 4:
				total = pieces*Pizza_Price[4];
				System.out.println(total);
				store[a++]=Pizza[4];
				price[b++]=total;
				break;
			case 5:
				total = pieces*Pizza_Price[5];
				System.out.println(total);
				store[a++]=Pizza[5];
				price[b++]=total;
				break;
			}
		}
		
		public void Sushi_Rolls_Purchase() {
			
			switch(here) {
			case 1:
				total = pieces*Sushi_Rolls_Price[1];
				System.out.println(total);
				store[a++]=Sushi_Rolls[1];
				price[b++]=total;
				break;
			case 2:
				total = pieces*Sushi_Rolls_Price[2];
				System.out.println(total);
				store[a++]=Sushi_Rolls[2];
				price[b++]=total;
				break;
			case 3:
				total = pieces*Sushi_Rolls_Price[3];
				System.out.println(total);
				store[a++]=Sushi_Rolls[3];
				price[b++]=total;
				break;
			case 4:
				total = pieces*Sushi_Rolls_Price[4];
				System.out.println(total);
				store[a++]=Sushi_Rolls[4];
				price[b++]=total;
				break;
			case 5:
				total = pieces*Sushi_Rolls_Price[5];
				System.out.println(total);
				store[a++]=Sushi_Rolls[5];
				price[b++]=total;
				break;
			} 
		} 

}
