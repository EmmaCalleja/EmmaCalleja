

public class Menu {
  public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        ArrayList<Member> memberDatabase = new ArrayList<Member>();
        
        String foodOrBev = "";
        String snackChoice = "";
        String drinkChoice = "";
        String toppingChoice = "";
        String flavorChoice = "";
        String memberInput = "";
        double orderTotal = 0;
        String memberInputNumber = "";
      
        

	System.out.println("Welcome! What would you like to order");
	System.out.println("Drinks or Snacks?");
	foodOrBev = scnr.nextLine();
	
	if(foodOrBev.equals("Snacks")) {
		System.out.println("Would you like");
		System.out.println("Mochi Ice Cream");
		System.out.println("Lavender Macaroons");
		System.out.println("Dumplings");
		snackChoice = scnr.nextLine();
	}
	
	if(foodOrBev.equals("Drinks")) {
		System.out.println("Would you like");
		System.out.println("Milk Tea");
		System.out.println("Coffee");
		System.out.println("Smoothie");
		drinkChoice = scnr.nextLine();
		
		if(drinkChoice.equals("Milk Tea")) {
			System.out.println("Great choice! What flavor are we thinking?");
			System.out.println("Vanilla");
			System.out.println("Strawberry");
			System.out.print("Lavendar");
			flavorChoice = scnr.nextLine();
		}
		
		if(drinkChoice.equals("Coffee")) {
			System.out.println("Great choice! What flavor are we thinking?");
			System.out.println("Vanilla");
			System.out.println("Brown Sugar");
			flavorChoice = scnr.nextLine();
		}
		
		if(drinkChoice.equals("Smoothie")){
			System.out.println("Great choice! What flavor are we thinking?");
			System.out.println("Strawberry");
			System.out.println("Peach");
			System.out.println("Blueberry");
			flavorChoice = scnr.nextLine();
		}
	
	}
	
	if(foodOrBev.equals("Drinks")) {
		System.out.println("Would you like to add any toppings?");
		toppingChoice = scnr.nextLine();
	}
	
	if(toppingChoice.equals("Yes")) {
		System.out.println("Good call! Are we feeling");
		System.out.println("Tapioca Pearls");
		System.out.println("Strawberry Popping Pearls");
		System.out.println("Blueberry Popping Pearls");
		System.out.println("Peach Popping Pearls");
		toppingChoice = scnr.nextLine();
	}
	
	if(toppingChoice.equals("No")) {
		System.out.println("Ok!");
	}
	
	// Repeating the Order
	
	System.out.print("Sounds delicious! That ");
	if(foodOrBev.equals("Snacks")) {
		System.out.println("order of " + snackChoice);
	}
	
	System.out.print( flavorChoice + " " + drinkChoice);
	if (!toppingChoice.equals("No")) {
		System.out.print(" with " + toppingChoice);
	}
	
	System.out.println(" will be ");
	if(foodOrBev.equals("Snacks")) {
		orderTotal = 3.50;
	}
	if(foodOrBev.equals("Drinks")) {
		orderTotal = 2.00;
	}
	if(!toppingChoice.equals("No")) {
		orderTotal = orderTotal + 0.50;
	}
	System.out.print("$" + orderTotal);
	
	//Referencing Membership
	System.out.println("Do you have a membership with us?");
	memberInput = scnr.nextLine();
	if(memberInput.equalsIgnoreCase("Yes"))	{
		System.out.println("Welcome back! Please enter your member number: ");
		memberInputNumber = scnr.nextLine();
    }
	else {
		System.out.println("No problem! We'll set up your account now! Please enter your phone number:");
		string memberInputNumber = scnr.nextLine();
	}
	System.out.println("Thank you! We'll add ");
	if(foodOrBev.equals("Drinks")) {
		System.out.print("3 points ");
	}
	if(foodOrBev.equals("Snacks")) {
		System.out.print("5 points ");
	}
	System.out.print("to your rewards!");
	
	//giving order number
	System.out.println("Your order number is ");
	}

}

}
