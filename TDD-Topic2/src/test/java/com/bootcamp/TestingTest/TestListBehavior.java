package com.bootcamp.TestingTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestListBehavior {

    private ListBe list = new ListBe();
    @Test
    public void testReading(){
        Assert.assertFalse(list.readAll());
        Assert.assertFalse(list.readList("Requiem"));
    }
    @Test
    public void testDeletingWZeroElements(){
        Assert.assertFalse(list.delete("Requiem"));
    }

    @Test
    public void addingTokens(){
        Assert.assertTrue(list.addToken("Requiem"));
    }

    @Test
    public void addingTokensAndDeleting(){
        Assert.assertTrue(list.addToken("Requiem"));
        Assert.assertTrue(list.delete("Requiem"));
    }

    @Test
    public void readingWElements(){
        Assert.assertTrue(list.addToken("Requiem"));
        Assert.assertTrue(list.readList("Requiem"));
    }

    @Test
    public void readingAllElements(){
        list.addToken("Requiem");
        list.addToken("Bangladesh");
        list.addToken("South");
        list.addToken("Park");
        Assert.assertTrue(list.readAll());
    }

}


class ListBe{

    private final List <String> list = new LinkedList<String>();

    public boolean addToken(String token){
        if(list.size() > 14){
            this.list.remove(15);
        }
        this.list.add(token.toLowerCase());
        return true;
    }

    public boolean readAll(){
        return this.list.size() > 0;
    }

    public boolean readList(String element){
        if(this.list.size() > 0){
            list.remove(element.toLowerCase());
            list.add(0, element.toLowerCase());
            return true;
        }
        return false;
    }

    public boolean delete(String element){
        if(this.list.size() > 0){
            if(this.list.contains(element.toLowerCase())) {
                this.list.remove(element.toLowerCase());
                return true;
            }
            return false;
        }
        return false;
    }

}
