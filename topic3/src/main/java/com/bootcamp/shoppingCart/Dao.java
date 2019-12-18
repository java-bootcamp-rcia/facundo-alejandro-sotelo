/**
 * Dao interface for ShoppingCart
 * Ideally should extend the CrudRepository as a way to complete the persistence
 */

package com.bootcamp.shoppingCart;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



public interface Dao <T>{

    Optional get(int id);

    List<Elements> getAll();

    void save(Elements elements);

    void update(Elements elements, String[] params);

    void delete(Elements elements);

    void deleteById(int id);
}
