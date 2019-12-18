package com.bootcamp.shoppingCart.UserPackage;


/**
 * User class, that will be used for the service in a way to persist (ideally) information;
 * This is the Entity used for the service (although everything could be seen as a service);
 * The entity should has  the same information as its counterpart in the DB;
 */
public class User {

    private int id;
    private String name, lastName;
    private int registrationNumber;
    private int age;

    public User(){}


    public User(int id, String name, String lastName, int registrationNumber, int age){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
        this.age = age;
    }

    /**
     * Override toString() method, that will give an structure to give basic information about the user
     * @return the basic information of the user
     */
    @Override
    public String toString() {
        return this.name + " " + this.lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
