package com.bootcamp.projectUser.entity;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "firstName", columnDefinition = "VARCHAR(50)", nullable = false)
    private String firstName;
    @Column(name = "lastName", columnDefinition = "VARCHAR(50)", nullable = false)
    private String lastName;
    @Column(name = "nickName", columnDefinition = "VARCHAR(30)", nullable = false)
    private String nickName;

    public User(){}

    public User(String firstName, String lastName, String nickName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
