package com.jk;

import static org.junit.Assert.assertTrue;

import com.jk.dao.BookMapper;
import com.jk.pojo.Book;
import com.jk.service.BookService;
import com.jk.service.BookServiceImpl;
import lombok.Lombok;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1(){
        BookService bookService =  new BookServiceImpl();
        int book = bookService.selectBookById(1);
        System.out.println(book);
    }
}
