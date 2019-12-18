package com.bootcamp.shoppingCart;

public class Main {

    public static void main(String[] args) {

        ShoppingDao shopCart = new ShoppingDao();

        ShoppingElements element1 = new ShoppingElements(1,"meat", "$200.00 X Kg","full cash");

        shopCart.saveElement(element1);

        shopCart.getAll().forEach(element -> System.out.println(element.toString()));


        shopCart.update(element1, new String[]{"1", "chicken", "$170.00 X Kg", "cash and credit card"});

        shopCart.getAll().forEach(element -> System.out.println(element.toString()));

    }

}
