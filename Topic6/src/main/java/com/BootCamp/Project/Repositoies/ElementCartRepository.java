package com.BootCamp.Project.Repositoies;

import com.BootCamp.Project.Entities.Element;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * interface to persist information about the elements in the shop cart
 */
public interface ElementCartRepository extends JpaRepository <Element, Integer> {

    //Element findElementByName();
    //Element findElementByPrice();
}
