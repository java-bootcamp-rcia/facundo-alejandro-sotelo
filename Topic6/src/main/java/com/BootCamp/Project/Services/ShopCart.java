package com.BootCamp.Project.Services;


import com.BootCamp.Project.Entities.Element;
import com.BootCamp.Project.Repositoies.ElementCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service class, that will be doing all business logical part of the operations; Will see if the petitions are correct, and
 * then, response to them somehow
 */

@Service
public class ShopCart {

    /**
     * cartShop will be doing the persistence part; Autowired is doing the dependency injection work so that
     * we will be having the basic operations to be done;
     */
    @Autowired
    private ElementCartRepository cartShop;

    /**
     * Using cartShop this method will be doing a "get" crud operation
     * @return a list with all the elements of the shopCart, if not null
     */
    public List<Element> getAll(){
        if(cartShop.findAll().isEmpty()){
            return null;
        }
        return this.cartShop.findAll();
    }

    /**
     * Using cartShop this method will get you an element from the cartShop
     * @param id : the id of the wanted element
     * @return : the element that matches that id
     */
    public Optional<Element> getById(int id){
        return this.cartShop.findById(id);
    }

    /**
     * Given an element, this will be added to the cart shop
     * @param element : the element and all its information that will be added to the shopCart
     */
    public void save(Element element){
        this.cartShop.save(element);
    }

    /**
     * Given an id and an element information, this will be updated in the shop cart
     * @param id :  the id of the element that will be updated
     * @param element : the element with the changes that has to be implemented
     */
    public void update(int id, Element element){
        this.cartShop.save(element);
    }

    /**
     * Given an id, an element will be deleted
     * @param id : id of the element
     * @param element : information about the element... This could be put away
     */
    public void deleteById(int id, Element element){
        this.cartShop.deleteById(id);
    }

    /**
     * Given an element, the method will search for it and if matches delete that element
     * @param element : the element to be deleted
     */
    public void deleteElement(Element element){
        this.cartShop.delete(element);
    }

    /**
     * this method will delete all the elements in the shop cart
     */
    public void deleteAll(){
        this.cartShop.deleteAll();
    }
}
