package com.BootCamp.Project.Entities;


import javax.persistence.*;

/**
 * Element class, will be used in order to add more objects of this class to the shopCart
 */
@Entity
@Table(name = "Element")
public class Element {

    /**
     * Description of its properties or attributes; Just practising Hibernate annotation and mapping;
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "elementName", length = 30)
    private String name;
    @Column(name = "elementPrice", length = 50)
    private String price;

    public Element(){}

    public Element(int id, String name, String price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " " + this.price;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
