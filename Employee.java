
public class Employee {
	private String name;
	private int idEmployee;
	private double salesTips;
	private double CurrPoints;
	private double PayCheck; 

	
	public Employee () {
		name = "N/A";
		idEmployee = 0000;
		salesTips = 0.00;
		PayCheck = 0.00; 
		CurrPoints = salesTips * .10; 
	}
	public Employee (String n, int i) {
		name = n;
		idEmployee = i;
		salesTips = 0.00;
		CurrPoints = 0; 
		PayCheck = 0.00; 

	}
		public Employee (String n, int i, double p) {
			name = n;
			idEmployee = i;
			salesTips = 0.00;
			CurrPoints = p; 
			PayCheck = 0.00; 

		}
		public Employee (String n, int i, double p, double c) {
			name = n;
			idEmployee = i;
			salesTips = 0.00;
			CurrPoints = p; 
			PayCheck = c; 

		}
		
		
	public void PrintRewards(double CurrPoints) {
		double tier1Min = 0;
		double tier1Max = 1000;
		double tier2Min = 1001;
		double tier2Max = 2000;
		double tier3Min = 2001;
		double tier3Max = 3000;

	    if (CurrPoints >= tier1Min && CurrPoints <= tier1Max) {
	        System.out.println("You are are in Tier 1: Bronze Level");
	        System.out.println("Your benefits include 50% discount on all Menu Items and a 15 minute break.");
	        double Reach1 = tier1Max-CurrPoints; 
	        Math.round(Reach1); 
	        System.out.println("You need " + Reach1 + " to advance to next tier: Silver Level");
	    } else if (CurrPoints >= tier2Min && CurrPoints <= tier2Max) {
	        System.out.println("Current points are in Tier 2: Silver Level");
	        System.out.println("Your benefits include 75% discount on all Menu items and an 30 minute break.");
	        double Reach2 = tier2Max-CurrPoints; 
	        Math.round(Reach2); 
	        System.out.println("You need " + Reach2 + " to advance to next tier: Gold Level");
	    } else if (CurrPoints >= tier3Min && CurrPoints < tier3Max) {
	        System.out.println("Current points are in Tier 3: Gold Level");
	        System.out.println("Your benefits include 100% discount on all Menu items, a 30 minute break, and 5 paid leave days.");
	        double Reach3 = tier3Max-CurrPoints; 
	        Math.round(Reach3); 
	        System.out.println("You need " + Reach3 + " to advance to your promotion!");
	    } 
	    else {
	        System.out.println("You are Promoted");
	        System.out.println("Your benefits include 100% discount on all Menu items, an 30 minute break, 5 paid leave days, and healthcare benefits.");

	    } 
		
		}
	
		
		
		public String getName() {
			return name;
		}

		public void setName(String n) {
			this.name = n;
		}

		public int getID() {
			return idEmployee;
		}

		public void setID(int d) {
			this.idEmployee = d;
		}
	
		public double getSalesTips() {
			return salesTips;
		}

		public void setSalesTips(double t) {
			this.salesTips = t;
		}
		public double getPoints() {
			return CurrPoints;
		}

		public void setPoints(double c) {
			this.CurrPoints = c;
		}
		public void setCheck(double p) {
			this.PayCheck = p;
		}
		public double getCheck() {
			return PayCheck;
		}
		
		
	}

