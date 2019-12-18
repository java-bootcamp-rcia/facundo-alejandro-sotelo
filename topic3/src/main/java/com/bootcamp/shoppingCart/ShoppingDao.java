package com.bootcamp.shoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ShoppingDao implements Dao<ShoppingElements>{

    private List<ShoppingElements> list = new ArrayList<>();


    @Override
    public Optional<ShoppingElements> get(int id) {
        if(list.size() >= id){
            return Optional.ofNullable(this.list.get(id-1));
        }
        return Optional.empty();
    }

    @Override
    public List<ShoppingElements> getAll() {
        return this.list;
    }

    @Override
    public void saveElement(ShoppingElements shoppingElements) {
        this.list.add(shoppingElements);
    }

    @Override
    public void update(ShoppingElements shoppingElements, String [] elements) {
        this.delete(shoppingElements);
        shoppingElements.setName(Objects.requireNonNull(elements[1], "You should change the name"));
        shoppingElements.setPrice(Objects.requireNonNull(elements[2], "You should change the price"));
        shoppingElements.setWayOfPayment(Objects.requireNonNull(elements[3], "You can add or change WofP"));
        this.list.add(shoppingElements);
    }

    @Override
    public void delete(ShoppingElements shoppingElements) {
        this.list.remove(shoppingElements);
    }
}
