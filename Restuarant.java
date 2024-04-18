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

    // Rest of the code remains the same
}
