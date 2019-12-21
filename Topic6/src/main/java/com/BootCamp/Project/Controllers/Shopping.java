package com.BootCamp.Project.Controllers;


import com.BootCamp.Project.Entities.Element;
import com.BootCamp.Project.Services.ShopCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.lang.management.OperatingSystemMXBean;
import java.util.List;
import java.util.Optional;

/**
 * Class that will attend the petitions from the client, and pass those petitions to be answer
 */
@RestController
public class Shopping {

    /**
     * service that will be used as a mask to answer the petitions and will be in charge of the business logical layer
     * this controller will pass the petitions to that service layer
     */
    @Autowired
    private ShopCart shoppingCart;

    @GetMapping("/shop")
    public List<Element> getAll(){
        return this.shoppingCart.getAll();
    }

    @GetMapping("/shop/{id}")
    public Optional<Element> getElement(@PathVariable int id){
        return this.shoppingCart.getById(id);
    }

    @PostMapping("/shop")
    public void save(@RequestBody Element element){
        this.shoppingCart.save(element);
    }

    @PutMapping("/shop/element/{id}")
    public void update(@PathVariable int id, @RequestBody Element element){
        this.shoppingCart.update(id, element);
    }

    @DeleteMapping("/shop/element/{id}")
    public void deleteById(@PathVariable int id, @RequestBody Element element){
        this.shoppingCart.deleteById(id, element);
    }

    @DeleteMapping("/shop/{element}")
    public void deleteElement(@RequestBody Element element){
        this.shoppingCart.deleteElement(element);
    }
}
