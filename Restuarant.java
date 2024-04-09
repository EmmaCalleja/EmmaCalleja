import java.util.*;
public class Restuarant {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Employee> employeeDatabase = new ArrayList<Employee>();
		
		//Creating some sample employees
		Employee example1 = new Employee ("Mickey", 1111, 10);
			employeeDatabase.add(example1);
		Employee example2 = new Employee ("Minnie",2222, 1300);
			employeeDatabase.add(example2);
		Employee example3 = new Employee ("Donald",3333, 2000);
			employeeDatabase.add(example3);

		

System.out.println("Welcome to the Boba Store!");
			
do {
	System.out.println();
	System.out.println("#################################");
	System.out.println("What would you like to do today?");
	System.out.println("1. Process an Order");
	System.out.println("2. Log in into Employee account");
	System.out.print("Enter your option: ");

	int menuchoice = scnr.nextInt();
	System.out.println();
	
	if (menuchoice == 2) {
        System.out.print("Enter employee ID: ");
       int userInputID = scnr.nextInt();
       boolean matchedIn = false; 
       double pointsOfEm = 0.0; 
       String nameOfEm = "";
        int i = 0; 
		for(i = 0; i < employeeDatabase.size(); i++) {
			Employee a = employeeDatabase.get(i);
			int ActualID = a.getID();
			if (userInputID == ActualID) {
				 nameOfEm = a.getName();
				 pointsOfEm = a.getPoints();
				System.out.println("Welcome " + nameOfEm);
				matchedIn = true; 
				break;
			}
		}

		if (matchedIn) {
	       System.out.println("##########################");
        System.out.println("Here are your Options: ");
        System.out.println("	1. Enter End-Of-Shift Results");
        System.out.println("	2. Check Rewards Status"); 
        System.out.println("	3. Check Paycheck Update");   
        System.out.print("Option Number: ");
        int userOps;
        userOps = scnr.nextInt();
       if (userOps == 1 ) {
        System.out.print("Enter Sales Today: $");
        double userSales = scnr.nextDouble();
        System.out.print("Enter Tips Today: $");
        double userTips = scnr.nextDouble();
        rewar
        }
	else if (userOps == 2 ) {
		System.out.println("Your current points are " + pointsOfEm + "points");
	}
	} 
	}
            


	else {
        System.out.println("Invalid Option");
  

	}
} while ((!scnr.next().equals("exit")));

		
		
		
	}
}
