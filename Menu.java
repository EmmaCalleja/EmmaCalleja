

public class Menu {
    private String drinkSize;
    private String drinkIce;
    private String drinkToppings;
    private String drinkFlavor;
    private double drinkPrice;

    public Menu() {
        drinkSize = "N/A";
        drinkIce = "N/A";
        drinkToppings = "N/A";
        drinkFlavor = "N/A";
        drinkPrice = 0.0;
    }

    public Menu(String n, String i, String p, String c) {
        drinkSize = n;
        drinkIce = i;
        drinkToppings = p;
        drinkFlavor = c;
        drinkPrice = 0.0;
    }

    public void PriceOfBoba() {
        if (drinkSize.equals("medium")) {
            drinkPrice = drinkPrice + 3;
            System.out.println("The Price of your drink is $" + drinkPrice);
        } else if (drinkSize.equals("large")) {
            drinkPrice = drinkPrice + 5;
            System.out.println("The Price of your drink is $" + drinkPrice);
        } else {
            System.out.println("Invalid Option");
        }

        if (drinkToppings.equals("boba") || drinkToppings.equals("matcha") || drinkToppings.equals("cold foam")) {
            drinkPrice = drinkPrice + 1;
        } else if (drinkToppings.equals("none")) {
            drinkPrice = drinkPrice + 0;
        } else {
            System.out.println("Invalid Option");
        }
    }

    public String getSize() {
        return drinkSize;
    }

    public void setSize(String n) {
        this.drinkSize = n;
    }

    public String getIce() {
        return drinkIce;
    }

    public void setIce(String i) {
        this.drinkIce = i;
    }

    public void setTop(String t) {
        this.drinkToppings = t;
    }

    public String getFlavor() {
        return drinkFlavor;
    }

    public void setFlavor(String f) {
        this.drinkFlavor = f;
    }
}
