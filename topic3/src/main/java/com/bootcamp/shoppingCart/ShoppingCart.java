/**
 * ShoppingCart that is the service
 * Implements the Dao interface to do the CRUD operations needed
 */

package com.bootcamp.shoppingCart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ShoppingCart implements Dao{


    private List <Elements> shopCart = new ArrayList<>();

    /**
     *
     * @param id: id of an object Element
     * @return the Element object that has that id
     */
    @Override
    public Optional get(int id) {
        return Optional.ofNullable(this.shopCart.get(id));
    }

    /**
     *
     * @return the list of elements within this class
     */
    @Override
    public List <Elements> getAll() {
        return this.shopCart;
    }

    /**
     *
     * @param elements: an Object of Element, that will be add to the Element list
     */
    @Override
    public void save(Elements elements) {
        this.shopCart.add(elements);
    }

    /**
     *
     * @param elements: an object from Element class
     * @param params: an array of String that contains the new data that will be added to the existing Element object
     */
    @Override
    public void update(Elements elements, String[] params) {
        elements.setName(Objects.requireNonNull(params[1], "Name cannot be null"));
        elements.setPrice(Objects.requireNonNull(params[2], "Price cannot be null"));
        this.shopCart.set(elements.getId(), elements);
    }

    /**
     *
     * @param elements: the object from Element class that will be removed
     */
    @Override
    public void delete(Elements elements) {
        this.shopCart.remove(elements);
    }

    /**
     *
     * @param id: the id of the Element object that will be removed; an alternative to remove Element objects
     */
    @Override
    public void deleteById(int id) {
        this.shopCart.remove(id);
    }
}
