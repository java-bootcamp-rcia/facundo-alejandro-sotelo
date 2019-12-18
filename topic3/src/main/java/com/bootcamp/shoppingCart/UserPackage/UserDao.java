/**
 * The interface that has the basic methods
 */

package com.bootcamp.shoppingCart.UserPackage;

import java.util.List;
import java.util.Optional;

public interface UserDao <T> {

    Optional get(int id);

    List <User> getAll();

    boolean save(User user);

    boolean update(User user, String[] params);

    boolean delete(User user);

}
