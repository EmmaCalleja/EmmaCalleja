package project;

import java.util.HashMap;
import java.util.Map;

 class Catering extends Menu {
	public static void main(String[] args) {
	
	}
    private static String[] CateringMenu = {"Classic Milk Tea", "Taro Milk Tea", "Brown Sugar Milk Tea"}; 
    private static double[] CateringPrice = {30, 32, 35}; 
    
	
    private String deliveryAddress;
    private int orderNumber;
    private Map<Integer, String> cateringFoodItems; 
    
    // Constructor with delivery address and order number parameters
    public Catering(String deliveryAddress, int orderNumber) {
        super(); // Use fixed menu and prices
        this.deliveryAddress = deliveryAddress;
        this.orderNumber = orderNumber;
       
        initializeCateringFoodItems(); 
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Order Number: " + orderNumber);
    }
    
    
    // Method to initialize CateringFood items
    private void initializeCateringFoodItems() {
    	try {
        cateringFoodItems = new HashMap<>();
        cateringFoodItems.put(1, "Classic Milk Tea");
        cateringFoodItems.put(2, "Taro Milk Tea");
        cateringFoodItems.put(3, "Brown Sugar Milk Tea");
    	} catch (Exception e)	{
        System.out.println("Please input customers catering menu items(1-3): " + cateringFoodItems);
    	}
    }
    
    // Method to print CateringFood items
    public void printCateringFoodItems() {
        System.out.println("Catering Food Items:");
        for (Map.Entry<Integer, String> entry : cateringFoodItems.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
	
    // Method to calculate total price for selected items
    
    // Additional methods specific to catering services
    
    
    public static double[] getCateringprice() {
		return CateringPrice;
	}
	public static String[] getCateringfood() {
		return CateringMenu;
	}

    // Getter and setter for delivery address
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
    // Getter and setter for order number
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
    
        this.orderNumber = orderNumber;
       
    }
	}
	


