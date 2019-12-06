package com.bootcamp.TestingTest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.when;

public class BlogTest {

    @Mock
    Blog blog = Mockito.mock(Blog.class);

    @Test
    public void testAdding(){
        Mockito.when(blog.addElements("Element")).thenReturn(true);
        Mockito.when(blog.addElements("")).thenReturn(false);
    }
    @Test
    public void testShowRecentEntries(){
        Mockito.when(blog.showRecentEntries()).thenReturn(false);
        Mockito.when(blog.addElements("Element")).thenReturn(true);
        Mockito.when(blog.addElements("Element")).thenReturn(true);
        System.out.println(Mockito.when(blog.showRecentEntries()).thenReturn(true));
    }

    @Test
    public void testDeletingElement(){
        Mockito.when(blog.deleteElement("")).thenReturn(false);
        Mockito.when(blog.addElements("Element")).thenReturn(true);
        Mockito.when(blog.deleteElement("")).thenReturn(false);
        Mockito.when(blog.deleteElement("Element")).thenReturn(true);
    }
}


class Blog{

    private List<String> list = new LinkedList<String>();

    protected boolean addElements(String token){
        if(list.size() > 14){
            removeLast();
        }
        if(!"".equalsIgnoreCase(token)) {
            list.add(token.toLowerCase());
            return true;
        }
        return false;
    }
    protected boolean deleteElement(String token){
        if(list.size() > 0){
            if(!"".equalsIgnoreCase(token)){
                this.list.remove(token.toLowerCase());
                return true;
            }
            return false;
        }
        return false;
    }

    protected boolean showRecentEntries(){
        if(this.list.size() > 0){
            Iterator iter = list.iterator();
            do{
                System.out.println(iter.next());
                if(!iter.hasNext()){
                    System.out.println(iter.next());
                    return true;
                }
            }while(true);
        }
        return false;
    }
    private void removeLast(){
        this.list.remove(15);
    }


}
