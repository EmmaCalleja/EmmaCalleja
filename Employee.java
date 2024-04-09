
public class Employee {
	private String name;
	private int idEmployee;
	private double sales;
	private double salesTips;
	private double CurrPoints;

	
	public Employee () {
		name = "N/A";
		idEmployee = 0000;
		sales = 00.00;
		salesTips = 0.00;
		CurrPoints = salesTips * .1; 
	}
	public Employee (String n, int i) {
		name = n;
		idEmployee = i;
		sales = 0.00;
		salesTips = 0.00;
		CurrPoints = 0; 

	}
		public Employee (String n, int i, double p) {
			name = n;
			idEmployee = i;
			sales = 0.00;
			salesTips = 0.00;
			CurrPoints = p; 

		}
	public void PrintRewards(double CurrPoints) {
		double tier1Min = 0;
		double tier1Max = 1000;
		double tier2Min = 1001;
		double tier2Max = 2000;
		double tier3Min = 2001;
		double tier3Max = 3000;

	    if (CurrPoints >= tier1Min && CurrPoints <= tier1Max) {
	        System.out.println("Current points are in Tier 1");
	        double Reach1 = tier1Max-CurrPoints; 
	        System.out.println("You need " + Reach1 + " to advance to next tier");
	    } else if (CurrPoints >= tier2Min && CurrPoints <= tier2Max) {
	        System.out.println("Current points are in Tier 2");
	        double Reach2 = tier2Max-CurrPoints; 
	        System.out.println("You need " + Reach2 + " to advance to next tier");
	    } else if (CurrPoints >= tier3Min && CurrPoints < tier3Max) {
	        System.out.println("Current points are in Tier 3");
	        double Reach3 = tier3Max-CurrPoints; 
	        System.out.println("You need " + Reach3 + " to advance to next tier");
	    } 
	    else if (CurrPoints == tier3Max) {
	        System.out.println("You are Promoted");
	    } 
	    else {
	        System.out.println("Current points are not in any tier");
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
		public double getSales() {
			return sales;
		}

		public void setSales(double s) {
			this.sales = s;
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

		
		
	}

