import java.util.*;

public class Restuarant {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Employee> employeeDatabase = new ArrayList<Employee>();

        // Creating some sample employees
        Employee example1 = new Employee("Mickey", 1111, 344.34, 121.23);
        employeeDatabase.add(example1);
        Employee example2 = new Employee("Minnie", 2222, 1246.20, 497.89);
        employeeDatabase.add(example2);
        Employee example3 = new Employee("Donald", 3333, 289.63, 321.34);
        employeeDatabase.add(example3);
        System.out.println("Welcome to the Boba Store!");

        loginEmployee(scnr, employeeDatabase);
    }

    private static void loginEmployee(Scanner scanner, ArrayList<Employee> employeeDatabase) {
        System.out.print("Enter employee ID: ");
        int userInputID = scanner.nextInt();
        Employee foundEmployee = null;
        for (Employee employee : employeeDatabase) {
            if (employee.getID() == userInputID) {
                foundEmployee = employee;
                break;
            }
        }
        if (foundEmployee != null) {
            System.out.println("Welcome " + foundEmployee.getName());
            int employeeMenuChoice;
            do {
                displayEmployeeMenu();
                System.out.print("Enter your option: ");
                employeeMenuChoice = scanner.nextInt();
                if (employeeMenuChoice == 1) {
          
                        // Process end-of-shift results
                        System.out.print("Enter Tips Today: $");
                        double userTips = scanner.nextDouble();
                        double rewards = userTips * 0.1;
                        double pointsOfEm = foundEmployee.getPoints() + rewards;
                        foundEmployee.setPoints(pointsOfEm);
                        System.out.println("Your current rewards points are " + pointsOfEm);
                        break;
                        }
                else if (employeeMenuChoice == 2) {
                        // Check rewards status 
                        System.out.println("Your current points are " + foundEmployee.getPoints() + " points");
                        foundEmployee.PrintRewards(foundEmployee.getPoints());
                        break;
                        }
                else if (employeeMenuChoice == 3) {
                        // Check paycheck
                        double emPayCheck = foundEmployee.getCheck();
                        foundEmployee.CheckforPay(emPayCheck);
                        break;}
                else if (employeeMenuChoice == 4) {
                        // Exit employee menu
                        System.out.println("Exiting employee menu...");
                        break;}
                else {
                        System.out.println("Invalid option!");
                }
                
            } while (employeeMenuChoice != 4);
        } else {
            System.out.println("Employee not found!");
            System.out.println("Try Again!");
            loginEmployee(scanner, employeeDatabase);
        }
    }

    private static void displayEmployeeMenu() {
        System.out.println("\n##########################");
        System.out.println("Here are your Options: ");
        System.out.println("    1. Enter End-Of-Shift Results");
        System.out.println("    2. Check Rewards Status");
        System.out.println("    3. Check Paycheck");
        System.out.println("    4. Exit Employee Menu");
    }
}
