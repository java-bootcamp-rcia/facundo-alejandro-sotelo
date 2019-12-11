/**
 * Element class which is used to do the test
 * Actually was made from the test as well as ShoppingCart
 */

package com.bootcamp.shoppingCart;

public class Elements {

    private int id;
    private String name;
    private String price;

    public Elements(){}

    public Elements(int id, String name, String price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return 0;
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


}
