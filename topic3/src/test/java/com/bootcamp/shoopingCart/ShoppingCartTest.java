package com.bootcamp.shoopingCart;

import com.bootcamp.shoppingCart.Elements;
import com.bootcamp.shoppingCart.ShoppingCart;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {

    private ShoppingCart cart;
    private Elements elements;
    private Elements elements2;
    @Before public void initialize(){
        this.cart = new ShoppingCart();
         elements = new Elements(0, "Chicken", "$200 X Kg");
         elements2 = new Elements(1, "Meat", "$350 X Kg");
    }



    @Test
    public void deleteItem(){
        this.cart.delete(elements);
    }

    @Test
    public void updateItem(){
        this.cart.save(elements);
        this.cart.save(elements2);

        this.cart.getAll().forEach(element -> System.out.println(element.getName()));

        this.cart.update(elements, new String[]{"1", "Sausage", "$80 X 6u."});

        this.cart.getAll().forEach(element -> System.out.println(element.getName()));
    }




}
