package com.BootCamp.Project;

import com.BootCamp.Project.Controllers.Shopping;
import com.BootCamp.Project.Entities.Element;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopCartTest {

    @Autowired
    private Shopping cart;

    @Before
    public void construct(){
        cart = new Shopping();
    }
    @Test
    public void addElementToCart(){
        Element element1 = new Element(1, "Meat","$ 300 x kg");
        Element element2 = new Element(2, "Chicken","$ 200 x kg");
        Assert.assertNull(this.cart.getAll());
        this.cart.save(element1);
        this.cart.save(element2);
        Assert.assertNotNull(this.cart.getAll());
    }


}
