/**
 * this class was just me kinda losing my time :D:
 * Rest for the ShoppingCart to expose and interact with the service
 */

package com.bootcamp.shoppingCart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public class ShoppingController {


    private ShoppingCart shop = new ShoppingCart();

    @GetMapping("/Shop")
    public List getAll(){
        return this.shop.getAll();
    }

    @GetMapping("/Shop/{element}")
    public Optional getElement(@PathVariable("element") int element){
        return this.shop.get(element);
    }

    @PostMapping("/Shop")
    public void save(@RequestBody Elements element){
        this.shop.save(element);
    }

    /**
     * I had to do the method this way in order to compile the mvn command for the test
     * @param elements: the Element object which will be updated
     *                Then the method call the update of the service
     */
    @PutMapping("/Shop/{element}")
    public void update(@RequestBody Elements elements){
        this.shop.update(elements, new String []{String.valueOf(elements.getId()), elements.getName(), elements.getPrice()});
    }

    @DeleteMapping("/Shop/{element}")
    public void delete(@RequestBody Elements element){
        this.shop.delete(element);
    }


}
