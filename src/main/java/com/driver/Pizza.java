package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese = false;
    private boolean extraToppings = false;
    private boolean papperBag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!extraCheese) {
            this.price += 80;
            extraCheese = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if (!extraToppings) {
            if (isVeg) this.price += 70;
            if (!isVeg) this.price += 120;
            extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!papperBag) {
            this.price += 20;
            papperBag = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (isVeg) this.bill = "Base Price Of The Pizza: 300\n";
        if (!isVeg) this.bill = "Base Price Of The Pizza: 400\n";

        if (extraCheese) this.bill += "Extra Cheese Added: 80\n";

        if (extraToppings) {
            if (isVeg) this.bill += "Extra Toppings Added: 70\n";
            if (!isVeg) this.bill += "Extra Toppings Added: 120\n";
        }

        if (papperBag) this.bill += "Paperbag Added: 20\n";

        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setExtraToppings(boolean extraToppings) {
        this.extraToppings = extraToppings;
    }
}
