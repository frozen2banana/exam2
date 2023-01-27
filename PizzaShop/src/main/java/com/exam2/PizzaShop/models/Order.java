package com.exam2.PizzaShop.models;

import java.io.Serializable;

import jakarta.validation.constraints.*;

public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    // I keep getting this error, have tried for hours !!! (spent all my time stuck here !!!)
    // The validation errors are not appearing, I have no idea why !!! (STUCK FOREVER!!!)

    @NotNull (message = "Must select a Pizza Type")
    private String pizza;
    @AssertTrue (message = "Choose a Pizza Type")
    private Boolean pizzaP = pizza.equals("bella") || pizza.equals("margherita") || pizza.equals("marinara") || 
                                pizza.equals("spianatacalabrese") || pizza.equals("trioformaggio");


    @NotNull (message = "Must select a Pizza Size")
    private String size;
    @AssertTrue (message = "Choose a Pizza Size")
    private Boolean sizeP = size.equals("sm") || size.equals("md") || size.equals("lg");


    @Min (value = 1, message = "Must select at least 1 Pizza")
    @Max (value = 10, message = "Must select at most 10 Pizzas")
    private int quantity;


    public Order(String pizza, String size, int quantity) {
        this.pizza = pizza;
        this.size = size;
        this.quantity = quantity;
    }


    public String getPizza() {
        return pizza;
    }


    public void setPizza(String pizza) {
        this.pizza = pizza;
    }


    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }


    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
