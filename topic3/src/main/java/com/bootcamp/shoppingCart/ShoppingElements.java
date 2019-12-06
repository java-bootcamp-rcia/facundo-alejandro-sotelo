package com.bootcamp.shoppingCart;

public class ShoppingElements {

    private int id;
    private String name;
    private String price;
    private String wayOfPayment;


    public ShoppingElements(){}

    public ShoppingElements(int id, String name, String price, String wayOfPayment){
        this.id = id;
        this.name = name;
        this.price = price;
        this.wayOfPayment = wayOfPayment;
    }

    @Override
    public String toString() {
        return "Product name: "+this.name + " product price: "+this.price+ " product WayOfPayment: "+this.wayOfPayment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWayOfPayment() {
        return wayOfPayment;
    }

    public void setWayOfPayment(String wayOfPayment) {
        this.wayOfPayment = wayOfPayment;
    }
}
