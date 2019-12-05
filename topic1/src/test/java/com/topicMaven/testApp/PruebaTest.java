package com.topicMaven.testApp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PruebaTest {

    @Test
    public void testAdd(){
        Add adding = new Add();
        Assert.assertEquals(10, adding.adding(5,5));
    }

}

class Add{

    protected int adding(int a, int b){
        return a+b;
    }
}

