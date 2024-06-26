import java.util.*; 

public class Catering extends Menu {
    private static String[] CateringMenu = {"Vanilla Milk Tea", "Strawberry Milk Tea", "Lavender Milk Tea"};
    private static double[] CateringPrice = {30, 32, 35};

    private String deliveryAddress;
    private int orderNumber;
    private HashMap<Integer, String> cateringFoodItems;

    public Catering(String deliveryAddress, int orderNumber) {
        super();
        this.deliveryAddress = deliveryAddress;
        this.orderNumber = orderNumber;
       initializeCateringFoodItems();
    /*    System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Order Number: " + orderNumber); */
    }

    private void initializeCateringFoodItems() {
        cateringFoodItems = new HashMap<>();
        for (int i = 0; i < CateringMenu.length; i++) {
            cateringFoodItems.put(i + 1, CateringMenu[i]);
        }
    }

    public void printCateringFoodItems() {
        System.out.println("Catering Food Items:");
        for (Map.Entry<Integer, String> entry : cateringFoodItems.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static double[] getCateringPrice() {
        return CateringPrice;
    }

    public static String[] getCateringFood() {
        return CateringMenu;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    @Override
    public void PriceOfBoba() {
        System.out.println("This is the overridden PriceOfBoba() method for catering orders.");

    }
    public void print() {
        System.out.println("Catering Menu:");
        Scanner scanner = new Scanner(System.in);
        String[] cateringMenu = Catering.getCateringFood();
        double[] cateringPrices = Catering.getCateringPrice();

        for (int i = 0; i < cateringMenu.length; i++) {
            System.out.println((i + 1) + ". " + cateringMenu[i] + " - $" + cateringPrices[i]);
        }

        System.out.print("Enter the number corresponding to the catering food item (1-3): ");
        int selection = scanner.nextInt();

        if (selection < 1 || selection > 3) {
            System.out.println("Invalid selection. Please enter a number between 1 and 3.");
            return;
        }

        String selectedFood = cateringMenu[selection - 1];
        double selectedPrice = cateringPrices[selection - 1];
        System.out.println("You selected: " + selectedFood + " - $" + selectedPrice);
         System.out.println("Enter delivery address - ");
        System.out.println("Enter customer ID - ");
        scanner.close();
    }
    }

