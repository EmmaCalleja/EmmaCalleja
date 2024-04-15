

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
    
   
    public Catering(String deliveryAddress, int orderNumber) {
        super(); 
        this.deliveryAddress = deliveryAddress;
        this.orderNumber = orderNumber;
       
        initializeCateringFoodItems(); 
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Order Number: " + orderNumber);
    }
    
    
    
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
    
    
    public void printCateringFoodItems() {
        System.out.println("Catering Food Items:");
        for (Map.Entry<Integer, String> entry : cateringFoodItems.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
    
    public static double[] getCateringprice() {
		return CateringPrice;
	}
	public static String[] getCateringfood() {
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
	}
	


