import java.util.*;


public class Restaurant {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Employee> employeeDatabase = new ArrayList<Employee>();

        // Creating some sample employees
        Employee example1 = new Employee("Mickey", 1111, 344.34);
        employeeDatabase.add(example1);
        Employee example2 = new Employee("Minnie", 2222, 1246.20);
        employeeDatabase.add(example2);
        Employee example3 = new Employee("Donald", 3333, 289.63);
        employeeDatabase.add(example3);

        System.out.println("Welcome to the Boba Store!");
        int mainMenuChoice;
        do {
            displayMainMenu();
            System.out.print("Enter your option: ");
            mainMenuChoice = scnr.nextInt();

            if (mainMenuChoice == 1) {
                // Menu part
                Menu customerMenu = new Menu();
                customizeOrder(scnr, customerMenu);
            } else if (mainMenuChoice == 2) {
                // Employee part
                loginEmployee(scnr, employeeDatabase);
            } else if (mainMenuChoice == 3) {
                // Catering part
                handleCatering(scnr);
            } else {
                System.out.println("Invalid option!");
            }
        } while (mainMenuChoice != 4);

        System.out.println("Exiting Boba Store. Goodbye!");
    }

    private static void customizeOrder(Scanner scanner, Menu customerMenu) {
        System.out.print("Enter drink size (medium, large): ");
        String size = scanner.next();
        customerMenu.setSize(size);
        System.out.print("Enter drink ice level (50%, 100%, none): ");
        String ice = scanner.next();
        customerMenu.setIce(ice);
        System.out.print("Enter drink toppings (boba, matcha, cold foam, none): ");
        String toppings = scanner.next();
        customerMenu.setTop(toppings);
        System.out.print("Enter drink flavor (taro, milk tea, caramel): ");
        String flavor = scanner.next();
        customerMenu.setFlavor(flavor);
        customerMenu.PriceOfBoba(); // Call the PriceOfBoba() method
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
                    rewards = Math.round(rewards);
                    System.out.println("You earned " + rewards + " today!");
                    double pointsOfEm = foundEmployee.getPoints() + rewards;
                    foundEmployee.setPoints(pointsOfEm);
                    System.out.println("Your current rewards points are " + pointsOfEm);
                } else if (employeeMenuChoice == 2) {
                    // Check rewards status
                    System.out.println("Your current points are " + foundEmployee.getPoints() + " points");
                    foundEmployee.PrintRewards(foundEmployee.getPoints());
                } else if (employeeMenuChoice == 3) {
                    // Exit employee menu
                    System.out.println("Exiting employee menu");
                    break;
                } else {
                    System.out.println("Invalid option!");
                }
            } while (employeeMenuChoice != 4);
        } else {
            System.out.println("Employee not found!");
            System.out.println("Try Again!");
            loginEmployee(scanner, employeeDatabase);
        }
    }

    private static void handleCatering(Scanner scanner) {
        System.out.print("Enter delivery address: ");
        String deliveryAddress = scanner.nextLine();
        System.out.print("Enter order number: ");
        int orderNumber = scanner.nextInt();

        Catering catering = new Catering(deliveryAddress, orderNumber);
        catering.printCateringFoodItems();
        catering.print();
    }

    private static void displayMainMenu() {
        System.out.println("\n##########################");
        System.out.println("Select an option:");
        System.out.println(" 1. Customize Order");
        System.out.println(" 2. Employee Menu");
        System.out.println(" 3. Catering Menu");
        System.out.println(" 4. Exit");
        System.out.println("-------------------------------");
    }

    private static void displayEmployeeMenu() {
        System.out.println("\n##########################");
        System.out.println("Here are your Options: ");
        System.out.println(" 1. Enter End-Of-Shift Results");
        System.out.println(" 2. Check Rewards Status");
        System.out.println(" 3. Exit Employee Menu");
        System.out.println("-------------------------------");
    }
}
/*
public class Restaurant {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Employee> employeeDatabase = new ArrayList<Employee>();

        // Creating some sample employees
        Employee example1 = new Employee("Mickey", 1111, 344.34);
        employeeDatabase.add(example1);
        Employee example2 = new Employee("Minnie", 2222, 1246.20);
        employeeDatabase.add(example2);
        Employee example3 = new Employee("Donald", 3333, 289.63);
        employeeDatabase.add(example3);

        System.out.println("Welcome to the Boba Store!");
        int mainMenuChoice;
        do {
            displayMainMenu();
            System.out.print("Enter your option: ");
            mainMenuChoice = scnr.nextInt();

            if (mainMenuChoice == 1) {
                // Menu part
                Menu customerMenu = new Menu();
                customizeOrder(scnr, customerMenu);
            } else if (mainMenuChoice == 2) {
                // Employee part
                loginEmployee(scnr, employeeDatabase);
            } else {
                System.out.println("Invalid option!");
            }
        } while (mainMenuChoice != 3);

        System.out.println("Exiting Boba Store. Goodbye!");
    }

    private static void customizeOrder(Scanner scanner, Menu customerMenu) {
        System.out.print("Enter drink size (medium, large): ");
        String size = scanner.next();
        customerMenu.setSize(size);
        System.out.print("Enter drink ice level (50%, 100%, none): ");
        String ice = scanner.next();
        customerMenu.setIce(ice);
        System.out.print("Enter drink toppings (boba, matcha, cold foam, none): ");
        String toppings = scanner.next();
        customerMenu.setTop(toppings);
        System.out.print("Enter drink flavor (taro, milk tea, caramel): ");
        String flavor = scanner.next();
        customerMenu.setFlavor(flavor);
        customerMenu.PriceOfBoba(); // Call the PriceOfBoba() method
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
                    rewards = Math.round(rewards);
                    System.out.println("You earned " + rewards + " today!");
                    double pointsOfEm = foundEmployee.getPoints() + rewards;
                    foundEmployee.setPoints(pointsOfEm);
                    System.out.println("Your current rewards points are " + pointsOfEm);
                } else if (employeeMenuChoice == 2) {
                    // Check rewards status
                    System.out.println("Your current points are " + foundEmployee.getPoints() + " points");
                    foundEmployee.PrintRewards(foundEmployee.getPoints());
                } else if (employeeMenuChoice == 3) {
                    // Exit employee menu
                    System.out.println("Exiting employee menu");
                    break;
                } else {
                    System.out.println("Invalid option!");
                }
            } while (employeeMenuChoice != 4);
        } else {
            System.out.println("Employee not found!");
            System.out.println("Try Again!");
            loginEmployee(scanner, employeeDatabase);
        }
    }

    private static void displayMainMenu() {
        System.out.println("\n##########################");
        System.out.println("Select an option:");
        System.out.println(" 1. Customize Order");
        System.out.println(" 2. Employee Menu");
        System.out.println(" 3. Exit");
        System.out.println("-------------------------------");
    }

    private static void displayEmployeeMenu() {
        System.out.println("\n##########################");
        System.out.println("Here are your Options: ");
        System.out.println(" 1. Enter End-Of-Shift Results");
        System.out.println(" 2. Check Rewards Status");
        System.out.println(" 3. Exit Employee Menu");
        System.out.println("-------------------------------");
    }}*/
