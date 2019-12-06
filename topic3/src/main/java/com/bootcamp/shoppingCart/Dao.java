package com.bootcamp.shoppingCart;

import java.util.List;
import java.util.Optional;

public interface Dao<T>{

    Optional<T> get(int id);

    List<T> getAll();

    void saveElement(T t);

    void update(T t, String [] elements);

    void delete(T t);

}
