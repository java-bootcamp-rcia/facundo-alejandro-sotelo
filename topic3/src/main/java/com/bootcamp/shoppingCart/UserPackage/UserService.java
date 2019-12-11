/**
 * User service to connect and use the User class
 */

package com.bootcamp.shoppingCart.UserPackage;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService implements UserDao<User> {

    private List <User> userList = new ArrayList<>();

    /**
     *
     * @param id: to find the User object with the specific id;
     * @return if there are data, returns the specific object that has that id
     */
    @Override
    public Optional get(int id) {
        return Optional.ofNullable(userList.get(id));
    }

    /**
     *
     * @return the list of user objects that are in this class
     */
    @Override
    public List<User> getAll() {
        return this.userList;
    }

    /**
     *
     * @param user the user object that will be added
     * @return well in this case, returns true if the object is not null +
     * also should see if the insertion could be done, in which case should be captured inside a try{} catch{} scope
     */
    @Override
    public boolean save(User user) {
        if(null != user){
            this.userList.add(user);
            return true;
        }
        return false;
    }

    /**
     *
     * @param user User object that will be updated
     * @param params
     * @return
     */
    @Override
    public boolean update(User user, String [] params) {
        if(null != user){
            user.setName(Objects.requireNonNull(params[1], "Name : User Name"));
            user.setLastName(Objects.requireNonNull(params[2], "LastName : User lastName"));
            user.setRegistrationNumber(Objects.requireNonNull(Integer.getInteger(params[3]),"Registration : User RegistrationNumber"));
            user.setAge(Objects.requireNonNull(Integer.getInteger(params[4]), "Age : User Age"));
            this.userList.set(user.getId(), user);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(User user) {
        if(null != user){
            this.userList.remove(user);
            return true;
        }
        return false;
    }
}
