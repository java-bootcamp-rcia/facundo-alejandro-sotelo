package com.bootcamp.shoppingCart.UserPackage;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * UserService class, that will be using User class in order to respond (ideally) the petitions of the clientSide;
 * Is the business logic side of the application;
 */

@Service
public class UserService implements UserDao<User> {

    private List <User> userList = new ArrayList<>();

    /**
     * Using the list of user, will search inside the list, an element that has the same provided property;
     * @param id: to find the User object with the specific id;
     * @return if there are data, returns the specific object that has that id
     */
    @Override
    public Optional get(int id) {
        return Optional.ofNullable(userList.get(id));
    }

    /**
     * Using the list of user, the method just will respond the petition made in the clientSide;
     * @return the whole list with its elements (if it has elements);
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
     * @param params The String array that will have the information that is needed to change from the user
     * @return As well as in the save method will provide a true in case that the object is not null +
     * ideally should see two things, if the set and changes can be done, and if the user has changed in any +
     * of its properties, otherwise should not do anything and maybe return a message
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

    /**
     *
     * @param user the user that will be deleted
     * @return true if the object is not null +
     * as well as in the other two methods should see if the user can be deleted
     */
    @Override
    public boolean delete(User user) {
        if(null != user && !this.userList.isEmpty()){
            this.userList.remove(user);
            return true;
        }
        return false;
    }
}
