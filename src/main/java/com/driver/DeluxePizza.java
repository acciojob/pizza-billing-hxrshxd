package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
//        super.setExtraCheese(true);
//        super.setExtraToppings(true);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
